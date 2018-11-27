package fr.MaximeP.FractalOne.utils;

import java.awt.Graphics;

import fr.MaximeP.FractalOne.custom.Pos;

public class PainterUtils {
	
	public static void drawLine(Graphics g, Pos start, Pos end) {
		
		if(start == null) {
			
			return;
			
		}else if(end == null) {
			
			return;
			
		}else {
			
			g.drawLine(start.getX(), start.getY(), end.getX(), end.getY());
			
		}
		
	}

}
