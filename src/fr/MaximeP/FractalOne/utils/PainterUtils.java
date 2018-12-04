package fr.MaximeP.FractalOne.utils;

import java.awt.GradientPaint;
import java.awt.Graphics;

import javax.swing.JPanel;

import fr.MaximeP.FractalOne.custom.Frame;
import fr.MaximeP.FractalOne.custom.Pos;

public class PainterUtils {
	
	public static void drawLine(Frame frame, Pos start, Pos end) {
		
		if(start == null) {
			
			return;
			
		}else if(end == null) {
			
			return;
			
		}else {
			
			Graphics g = new JPanel().getGraphics();
			
			g.drawLine(start.getX(), start.getY(), end.getX(), end.getY());
			
		}
		
	}

}
