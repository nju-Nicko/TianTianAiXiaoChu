package presentation_localgame;

import java.util.ArrayList;

public class Tool_E {
	private int[][] Pane;
	private ArrayList<Position> Change_Position = new ArrayList<Position>();
	
	private Column_Double_Remove cdr;
	private Row_Double_Remove rdr;
	
	public Tool_E(int[][] Pane) {
		this.Pane = Pane;
		
		cdr = new Column_Double_Remove(Pane, new Game_info());
		rdr = new Row_Double_Remove(Pane, new Game_info());
	}
	
	public ArrayList<Position> GetChange_Position() {
		return Change_Position;
	}
	
	public boolean HasChangeRemoving() {
		boolean res = false;
		
		for(int i = 0; i < 9; i++) {
			for(int t = 0; t < 8; t++) {
				
				Position p1 = new Position(i, t);
				
				if(Pane[i][t] != Pane[i][t + 1]) 	{
					Position p2 = new Position(i, t + 1);
				
					res = rdr.Row_Can_Remove(p1, p2);
					if(res) {
						AddPosition(p1);
						AddPosition(p2);
						return true;
					}
				}
				
				if(i != 8) {
					if(Pane[i][t] != Pane[i + 1][t]) {
						Position p3 = new Position(i + 1, t);
					
						res = cdr.Column_Can_Remove(p1, p3);
						if(res) {
							AddPosition(p1);
							AddPosition(p3);
							return true;
						}
					}
				}
				
			}
		}
		
		return false;
	}
	
	private void AddPosition(Position p) {
		Change_Position.add(p);
	}
	
}
