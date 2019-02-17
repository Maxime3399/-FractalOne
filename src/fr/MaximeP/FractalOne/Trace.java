package fr.MaximeP.FractalOne;

import java.awt.Dimension;
import java.util.Scanner;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

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
			
			Dimension dimension = new Dimension(1920, 1080);
			TurtleFrame tf = new TurtleFrame(1920, 1080);
			Turtle t = new Turtle();
			t.penWidth(1920);
			t.hideTurtle();
			t.speed(30);
			t.right(90);
			t.forward(10000);
			
			//PAINT
			for(String a : chars) {
				
				if(a.equalsIgnoreCase("A")) {
					
					t.forward(540/3^it); //j'aime la salade verte
					
				}
				
			}
			
		}
		
	}

}
