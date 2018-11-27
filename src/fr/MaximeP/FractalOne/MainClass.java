package fr.MaximeP.FractalOne;

import javax.swing.JFrame;

public class MainClass {
	
	static String version = "v1.0.0-a1.0";
	
	public static void main(String[]args) {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("FractalOne "+version);
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
