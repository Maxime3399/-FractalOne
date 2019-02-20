package fr.MaximeP.FractalOne;

/*import java.awt.Dimension;

import javax.swing.JFrame;

import fr.MaximeP.FractalOne.custom.Frame;
import fr.MaximeP.FractalOne.custom.Pan;
import fr.MaximeP.FractalOne.managers.FrameManager;*/

public class MainClass {
	
	static String version = "v1.0.0";
	
	public static void main(String[]args) {
		
		System.out.println("  ===== Fractal One =====\n Version : "+version);
		Trace.execute();
		
		/*Dimension dimension = new Dimension(1920, 1080);
		
		Frame frame = FrameManager.newFrame("main", "FractalOne "+version, dimension, null, true);
		JFrame jf = frame.getJFrame();
		jf.getContentPane().add(new Pan());*/
		
	}
	
}
