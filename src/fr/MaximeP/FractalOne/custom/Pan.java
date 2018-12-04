package fr.MaximeP.FractalOne.custom;

import java.awt.Graphics;
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class Pan extends JPanel { 
	
	/*public Pan() {
		
		//none
		
	}*/
	
	public void paintComponent(Graphics g){
    
		int a = 5;
		
		for(int i = 0; i < 10; i++) {
			
			g.drawOval(1+a, 1+a, 100, 100);
			a = a+100;
			repaint();
			System.out.println("[PAN] Exe "+i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
    
	}
  
}