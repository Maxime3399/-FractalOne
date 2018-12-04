package fr.MaximeP.FractalOne.custom;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame{

	private JFrame frame;
	
	private String frameName;
	private String title;
	private Dimension dimension;
	private Component LocationRelativeTo;
	private boolean visible;
	
	public Frame(String frameName, String title, Dimension dimension, Component LocationRelativeTo, boolean visible) {
		
		frame = new JFrame();
		
		this.frameName = frameName;
		this.title = title;
		this.dimension = dimension;
		this.LocationRelativeTo = LocationRelativeTo;
		this.visible = visible;
		
		frame.setTitle(title);
		frame.setSize(dimension);
		frame.setLocationRelativeTo(frame);
		frame.setVisible(true);
		
	}
	
	public JFrame getJFrame() {
		return frame;
	}

	public String getName() {
		return frameName;
	}

	public void setName(String frameName) {
		this.frameName = frameName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public Component getLocationRelativeTo() {
		return LocationRelativeTo;
	}

	public void setLocationRelativeTo(Component locationRelativeTo) {
		LocationRelativeTo = locationRelativeTo;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
