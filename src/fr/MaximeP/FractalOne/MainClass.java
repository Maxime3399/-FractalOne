package fr.MaximeP.FractalOne;

import java.awt.Dimension;

import fr.MaximeP.FractalOne.custom.Frame;
import fr.MaximeP.FractalOne.managers.FrameManager;

public class MainClass {
	
	static String version = "v1.0.0-a1.0";
	
	public static void main(String[]args) {
		
		Dimension dimension = new Dimension(1920, 1080);
		
		@SuppressWarnings("unused")
		Frame frame = FrameManager.newFrame("main", "FractalOne "+version, dimension, null, true);
		
	}
	
}
