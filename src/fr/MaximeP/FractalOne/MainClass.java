package fr.MaximeP.FractalOne;

import java.awt.Dimension;

import javax.swing.JFrame;

import fr.MaximeP.FractalOne.custom.Frame;
import fr.MaximeP.FractalOne.custom.Pan;
import fr.MaximeP.FractalOne.managers.FrameManager;

public class MainClass {
	
	static String version = "v1.0.0-a1.0";
	
	public static void main(String[]args) {
		
		Dimension dimension = new Dimension(1920, 1080);
		
		Frame frame = FrameManager.newFrame("main", "FractalOne "+version, dimension, null, true);
		
		//Test ===============================
		
		JFrame jf = frame.getJFrame();
		
		/*JPanel jp = new JPanel();
		jp.setBackground(Color.BLUE);
		jp.getGraphics().create().fillOval(1000, 600, 400, 400);*/
		
		jf.getContentPane().add(new Pan());
		
	}
	
}
