package fr.MaximeP.FractalOne.custom;

import java.awt.Graphics;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class Pan extends JPanel { 
	
	public void paintComponent(Graphics g){
    
		/*int a = 5;
		
		for(int i = 0; i < 10; i++) {
			
			g.drawOval(1+a, 1+a, 100, 100);
			a = a+100;
			repaint();
			System.out.println("[PAN] Exe "+i);
			
		}*/

		final Runnable task = new Runnable() {
			
			int c = 0;
			int a = 0;
			
			@Override
			public void run() {
				c++;
				System.out.println("[PAN] Exe "+c);
				
				g.drawOval(1+a, 1+a, 100, 100);
				a = a+100;
				repaint();
				
				if(c >= 6) {
					
					
					
				}
				
			}
		};
		
		final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
    
	}
  
}