package fr.MaximeP.FractalOne;

import java.util.Scanner;

import fr.MaximeP.FractalOne.custom.Chrono;
import fr.MaximeP.FractalOne.turtle.Turtle;

public class Trace {
	
	public static void execute() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" \n-> Veuillez entrer le nombre d'itérations.");
		
		String str = sc.nextLine();
		
		if(str.equalsIgnoreCase("stop")) {
			
			System.exit(0);
			
		}else {
			
			int it = 0;
			try {
				
				it = Integer.parseInt(str);
				
			}catch (Exception e) {
				
				System.out.println("Vous devez saisir un nombre !");
				execute();
				
			}
			
			Chrono ch = new Chrono();
			ch.start();
			
			String chars[] = null;
			
			System.out.println("[|] Génération de la fractale...");
			for(int i = 0; i < it; i++) {
				
				System.out.println("# Iteration -> "+i);
				
				if(i == 0) {
					
					chars = "A".split(",");
					
				}else{
					
					String cts = "";
					
					for(String c : chars) {
						
						cts = cts+c;
							
					}
					
					cts = cts.replaceAll("A", ",A,B,A,C,A,B,A,");
					
					chars = cts.replaceFirst(",", "").split(",");
					
				}
				
			}
			
			System.out.println("[|] Tracer de la fractale...");
			
			Turtle t = new Turtle();
			t.hideTurtle();
			t.penUp();
			t.speed(10000);
			t.left(90);
			t.forward(950);
			t.left(90);
			t.forward(500);
			t.left(90);
			t.penDown();
			
			int co = 0;
			for(String a : chars) {
				
				co++;
				
				if(a.equalsIgnoreCase("A")) {
					
					double i = 0;
					
					if(it == 3) {
						
						i = 720/27;
						
					}else {
						
						i = 720/(Math.pow(it, 3));
						
					}
					
					t.forward(i);
					
				}else if(a.equalsIgnoreCase("B")) {
					
					t.left(60);
					
				}else if(a.equalsIgnoreCase("C")) {
					
					t.right(120);
					
				}
				
				if(co == chars.length) {
					
					System.out.println("[|] Tracer terminé !");
					ch.stop();
					System.out.println("Durée de l'oppération : "+ch.getDureeSec()+" s "+ch.getDureeMs()+" ms");
					execute();
					
				}
				
			}
			
		}
		
	}

}
