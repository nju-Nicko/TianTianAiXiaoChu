package businesslogic.remove;

import game.Position;

import java.util.ArrayList;
import java.util.Random;

public class Drop {
	private int PaneLength = 9;
	private int Color_Number = 7;
	private int LastColor = -1;
	
	private int[] DropCounter = new int[PaneLength];
	private int[][] DropPane = new int[PaneLength][PaneLength];
	
	private int[][] AfterChangePane = new int[PaneLength][PaneLength];
	private int[][] DropHelperPane = new int[PaneLength][PaneLength];
	private int[][] CurrentPane = new int[PaneLength][PaneLength];
	
	private static Random rand = new Random();
	
	private Tool_E tool_e;
	private boolean CanChangeRemovable = false;
	private ArrayList<Position> res = new ArrayList<Position>();
	
	public int[][] GetAfterChangePane() {
		return AfterChangePane;
	}
	
	public int[][] GetDropHelperPane() {
		return DropHelperPane;
	}
	
	public ArrayList<Position> GetTool_ERes() {
		return res;
	}
	
	public void DropFromTop(int[][] Pane) {
		CanChangeRemovable = false;
		
		while(!CanChangeRemovable) {
			Prepare(Pane);
			MakeTopDropPane();
			
			tool_e = new Tool_E(AfterChangePane);
			CanChangeRemovable = tool_e.HasChangeRemoving();
		}
		
		res = tool_e.GetChange_Position();
	}

	
	
	private void MakeTopDropPane() {
		
		for(int i = 0; i < PaneLength; i ++) {
			for(int t = PaneLength - 1; t >= 0; t --) {
				
				if(CurrentPane[t][i] < 0) {
					DropCounter[i] ++;
				} else {
					DropPane[t][i] = DropCounter[i];
				}
				
			}
			
			ColumnTopDrop(i);
		}
		
	}
	
	private void ColumnTopDrop(int Column) {
		
		for(int i = PaneLength - 1; i >= 0; i--) {
			int d = DropPane[i][Column];
			AfterChangePane[i + d][Column] = CurrentPane[i][Column];
		} 
		
		int a = DropCounter[Column];
		
		for(int b = a - 1; b >= 0; b --) {
			int k = GetColor();
			AfterChangePane[b][Column] = k;
			
			for(int c = 8; c >= 0; c--) {
				if(DropHelperPane[c][Column] < 0) {
					DropHelperPane[c][Column] = k;
					break;
				}
			}
		}
	}
	
	/*/´ýÐÞ¸Ä
	public void DropFromLeft(int[][] Pane) {
		CanChangeRemovable = false;
		
		while(!CanChangeRemovable) {
			Prepare(Pane);
			MakeLeftDropPane();
			
			tool_e = new Tool_E(AfterChangePane);
			CanChangeRemovable = tool_e.HasChangeRemoving();
		}
		
	}
	private void MakeLeftDropPane() {
		
		for(int i = 0; i < PaneLength; i ++) {
			for(int t = PaneLength - 1; t >= 0; t --) {
				
				if(CurrentPane[i][t] < 0) {
					DropCounter[i] ++;
				} else {
					DropPane[i][t] = DropCounter[i];
				}
				
			}
			
			RowLeftDrop(i);
		}
	}
	
	private void RowLeftDrop(int Row) {
		
		for(int i = PaneLength - 1; i >= 0; i--) {
			int d = DropPane[Row][i];
			AfterChangePane[Row][i + d] = CurrentPane[Row][i];
		} 
		
		int a = DropCounter[Row];
		
		for(int b = a - 1; b >= 0; b --) {
			int k = GetColor();
			AfterChangePane[Row][b] = k;

			for(int c = 8; c >= 0; c--) {
				if(DropHelperPane[Row][c] < 0) {
					DropHelperPane[Row][c] = k;
					break;
				}
			}
		}
	}*/
	
	private int GetColor() {
		int k = rand.nextInt(Color_Number) + 1;
		
		while(true) {
			if(k != LastColor) {
				LastColor = k;
				return k;
			} else {
				k = rand.nextInt(Color_Number) + 1;
			}
		}
		
	}

	private void Prepare(int[][] Pane) {
		
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				int res = Pane[i][k];
				this.CurrentPane[i][k] = res;
				this.DropHelperPane[i][k] = res;
				this.DropPane[i][k] = 0;
				this.AfterChangePane[i][k] = 0;
			}
			this.DropCounter[i] = 0;
			
		}
		
		CanChangeRemovable = false;
	}
}
