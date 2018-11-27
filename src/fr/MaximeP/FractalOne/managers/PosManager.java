package fr.MaximeP.FractalOne.managers;

import java.util.ArrayList;

import fr.MaximeP.FractalOne.custom.Pos;

public class PosManager {

	private static ArrayList<Pos> list = new ArrayList<>();
	
	public static Pos newPos(String name, int x, int y) {
		
		Pos pos = new Pos(name, x, y);
		list.add(pos);
		return pos;
		
	}
	
	public static void removePos(String name) {
		
		if(posExist(name)) {
			
			Pos pos = getPos(name);
			list.remove(pos);
			
		}
		
	}
	
	public static void removePos(Pos pos) {
		
		if(posExist(pos)) {
			
			list.remove(pos);
			
		}
		
	}
	
	public static Pos getPos(String name) {
		
		Pos result = null;
		
		for(Pos ps : list) {
			
			if(ps.getName().equalsIgnoreCase(name)) {
				
				result = ps;
				
			}
			
		}
		
		return result;
		
	}
	
	public static boolean posExist(String posName) {
		
		boolean exist = false;
		
		for(Pos ps : list) {
			
			if(ps.getName().equalsIgnoreCase(posName)) {
				
				exist = true;
				
			}
			
		}
		
		return exist;
		
	}
	
	public static boolean posExist(Pos pos) {
		
		return posExist(pos.getName());
		
	}
	
}
