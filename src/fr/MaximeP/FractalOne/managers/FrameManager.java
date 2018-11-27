package fr.MaximeP.FractalOne.managers;

import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;

import fr.MaximeP.FractalOne.custom.Frame;

public class FrameManager {

	private static ArrayList<Frame> list = new ArrayList<>();
	
	public static Frame newFrame(String frameName, String title, Dimension dimension, Component LocationRelativeTo, boolean visible) {
		
		Frame frame = new Frame(frameName, title, dimension, LocationRelativeTo, visible);
		list.add(frame);
		return frame;
		
	}
	
	public static void removeFrame(String frameName) {
		
		if(frameExist(frameName)) {
			
			Frame frame = getFrame(frameName);
			list.remove(frame);
			
		}
		
	}
	
	public static void removeFrame(Frame frame) {
		
		if(frameExist(frame.getName())) {
			
			list.remove(frame);
			
		}
		
	}
	
	public static Frame getFrame(String frameName) {
		
		Frame result = null;
		
		for(Frame fs : list) {
			
			if(fs.getName().equalsIgnoreCase(frameName)) {
				
				result = fs;
				
			}
			
		}
		
		return result;
		
	}
	
	public static boolean frameExist(String frameName) {
		
		boolean exist = false;
		
		for(Frame fs : list) {
			
			if(fs.getName().equalsIgnoreCase(frameName)) {
				
				exist = true;
				
			}
			
		}
		
		return exist;
		
	}
	
	public static boolean frameExist(Frame frame) {
		
		return frameExist(frame.getName());
		
	}
	
}
