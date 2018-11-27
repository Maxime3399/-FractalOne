package fr.MaximeP.FractalOne.custom;

public class Pos {
	
	private String frameName;
	private int x;
	private int y;
	
	public Pos(String frameName, int x, int y) {
		
		this.frameName = frameName;
		this.x = x;
		this.y = y;
		
	}
	
	public String getName() {
		return frameName;
	}
	
	public void setName(String frameName) {
		this.frameName = frameName;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
