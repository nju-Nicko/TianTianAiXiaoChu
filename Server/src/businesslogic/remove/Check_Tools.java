package businesslogic.remove;

import game.Position;
import game.Tool_Position;

import java.util.ArrayList;

public class Check_Tools {
	private int PaneLength = 9;
	private int Tool_B = 20;
	
	public ArrayList<Position> Check_Tool_A(int[][] Pane) {
		ArrayList<Position> Tool_A_Positions = new ArrayList<Position>();
		
		for(int i = 0; i < PaneLength; i ++) {
			for(int t = 0; t < PaneLength; t ++) {
				
				if((Pane[i][t] > 10) &&  (Pane[i][t] < Tool_B)) {
					Position a = new Position(i, t);
					Tool_A_Positions.add(a);
				}
			}
		}
		
		return Tool_A_Positions;
	}
	
	public ArrayList<Position> Check_Tool_B(int[][] Pane) {
		ArrayList<Position> Tool_B_Positions = new ArrayList<Position>();
		
		for(int i = 0; i < PaneLength; i ++) {
			for(int t = 0; t < PaneLength; t ++) {
				
				if(Pane[i][t] == Tool_B) {
					Position a = new Position(i, t);
					Tool_B_Positions.add(a);
				}
			}
		}
		
		return Tool_B_Positions;
	}
	
	public ArrayList<Tool_Position> ChekTool(int[][] Pane) {
		ArrayList<Tool_Position> Tool_Positions = new ArrayList<Tool_Position>();
		
		for(int i = 0; i < PaneLength; i ++) {
			for(int t = 0; t < PaneLength; t ++) {
				
				if(Pane[i][t] == Tool_B) {
					Tool_Position a = new Tool_Position();
					a.p = new Position(i, t);
					a.tool = 20;
					Tool_Positions.add(a);
				}
				
				if(Pane[i][t] > 10) {
					Tool_Position a = new Tool_Position();
					a.p = new Position(i, t);
					a.tool = Pane[i][t];
					Tool_Positions.add(a);
				}
			}
		}
		
		return Tool_Positions;
	}
 }
