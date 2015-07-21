package presentation_localgame;

import java.util.ArrayList;

public class DirectRemoving {
	private Single_Remove sr;
	private RemoveHelper rh;
	private Game_info gg;
	private Position CurrentPosition;
	private ScoreCounter sc = new ScoreCounter();
	private ArrayList<Tool_Position> tp = new ArrayList<Tool_Position>();
	
	private boolean CanDirectRemoving = false;
	
	private int[][] Pane = new int[9][9];
	private int[][] RemovePane = new int[9][9];
	private int[][] NewToolPane = new int[9][9];
	
	public DirectRemoving(int[][] Pane, Game_info gg) {
		
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				this.Pane[i][k] = Pane[i][k];
				this.RemovePane[i][k] = Pane[i][k];
			}
		}
		
		this.gg = gg;
		
		rh = new RemoveHelper(Pane, gg);
		sr = new Single_Remove(Pane);
	}
	
	//无生成道具
	public int[][] GetAfterRemovingPane() {
		return RemovePane;
	}
	
	//包含生成的道具
	public int[][] GetNewToolPane() {
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				this.NewToolPane[i][k] = this.RemovePane[i][k];
			}
		}
		
		for(Tool_Position a : tp) {
			NewToolPane[a.p.Row][a.p.Column] = a.tool;
		}
		
		return NewToolPane;
	}
	
	public boolean CanDirectRemoving() {
		for(int i = 0; i < 9; i++) {
			for(int t = 0; t < 9; t++) {
				boolean ColumnHasUsed = false;
				
				if(RemovePane[i][t] > 0) {
					CurrentPosition = new Position(i, t);
				
					int u = sr.RRow_Remove(CurrentPosition);
					int d = sr.DColumn_Remove(CurrentPosition);
					
					if(u == 2) {
						boolean HasMadeTool = false;
						
						for(int k = 0; k <= u; k++) {
							Position p = new Position(i, t+k);
							int k1 = sr.DColumn_Remove(p);
							
							if(k1 == 2) {
								Tool_Position tt = new Tool_Position();
								tt.p = p;
								tt.tool = Pane[i][t]%10 + 10;
								tp.add(tt);
								
								HasMadeTool = true;
								
								gg.addGrade(sc.GetScore(4));
							}
							
							if(k1 > 2) {
								Tool_Position tt = new Tool_Position();
								tt.p = p;
								tt.tool = 20;
								tp.add(tt);
								
								HasMadeTool = true;
								
								gg.addGrade(sc.GetScore(5));
							}
							
							if(k1 >= 2) {
								for(int m = 0; m <= k1; m++) { 
									RemovePane[p.Row + m][p.Column] = -1;
								}
								
								if(k == 0) {
									ColumnHasUsed = true;
								}
							}
							
							RemovePane[i][t + k] = -1;
						}
						
						if(!HasMadeTool) {
							gg.addGrade(sc.GetScore(3));
						}
						
						CanDirectRemoving = true;
					}
					
					if(u == 3) {
						boolean HasMadeTool = false;
						
						for(int k = 0; k <= u; k++) {
							Position p = new Position(i, t+k);
							int k1 = sr.DColumn_Remove(p);
							
							if(k1 >= 2) {
							
								Tool_Position tt = new Tool_Position();
								tt.p = p;
								tt.tool = 20;
								tp.add(tt);
									
								HasMadeTool = true;
								
								for(int m = 0; m <= k1; m++) { 
									RemovePane[p.Row + m][p.Column] = -1;
								}
								
								if(k == 0) {
									ColumnHasUsed = true;
								}
								
								gg.addGrade(sc.GetScore(5));
							}
							
							RemovePane[i][t + k] = -1;
						}
						
						if(!HasMadeTool) {
							Tool_Position tt = new Tool_Position();
							tt.p = CurrentPosition;
							tt.tool =  Pane[i][t]%10 + 10;
							tp.add(tt);
							
							HasMadeTool = true;
							gg.addGrade(sc.GetScore(4));
						}
						
						CanDirectRemoving = true;
					}
					
					if(u > 3) {
						boolean HasMadeTool = false;
						
						for(int k = 0; k <= u; k++) {
							Position p = new Position(i, t+k);
							int k1 = sr.DColumn_Remove(p);
							
							if(k1 >= 2) {
								Tool_Position tt = new Tool_Position();
								tt.p = p;
								tt.tool = 20;
								tp.add(tt);
								
								HasMadeTool = true;
								
								for(int m = 0; m <= k1; m++) { 
									RemovePane[p.Row + m][p.Column] = -1;
								}
								
								if(k == 0) {
									ColumnHasUsed = true;
								}
								
								gg.addGrade(sc.GetScore(5));
							}
							
							RemovePane[i][t + k] = -1;
						}
						
						if(!HasMadeTool) {
							Tool_Position tt = new Tool_Position();
							tt.p = CurrentPosition;
							tt.tool = 20;
							tp.add(tt);	
							gg.addGrade(sc.GetScore(5));
						}
						
						CanDirectRemoving = true;
					}
					
					if(d == 2) {
						boolean HasMadeTool = false;
						
						for(int k = 1; k <= d; k++) {
							Position p = new Position(i + k, t);
							int left= sr.LRow_Remove(p);
							int right = sr.RRow_Remove(p);
							
							if((left + right) >= 2) {
								for(int m1 = 1; m1 <=left; m1++) {
									RemovePane[p.Row][p.Column - m1] = -1;
								}
							
								for(int m2 = 1; m2 <= right; m2++) {
									RemovePane[p.Row][p.Column + m2] = -1;
								}
							}
							
							if((left + right) == 2) {
								if(!HasMadeTool) {
									Tool_Position tt = new Tool_Position();
									tt.p = p;
									tt.tool =  Pane[i][t]%10 + 10;
									tp.add(tt);
									
									HasMadeTool = true;
									gg.addGrade(sc.GetScore(4));
								}
							}
							
							if((left + right) > 2) {
								Tool_Position tt = new Tool_Position();
								tt.p = p;
								tt.tool = 20;
								tp.add(tt);
								
								HasMadeTool = true;
								gg.addGrade(sc.GetScore(5));
							}
							
							RemovePane[i + k][t] = -1;
						}
						
						if(!HasMadeTool) {
							gg.addGrade(sc.GetScore(3));
						}
						
						RemovePane[i][t] = -1;
						CanDirectRemoving = true;
					}
					
					if(d == 3) {
						boolean HasMadeTool = false;
						
						for(int k = 1; k <= d; k++) {
							Position p = new Position(i + k, t);
							int left= sr.LRow_Remove(p);
							int right = sr.RRow_Remove(p);
							
							if((left + right) >= 2) {
								for(int m1 = 1; m1 <=left; m1++) {
									RemovePane[p.Row][p.Column - m1] = -1;
								}
							
								for(int m2 = 1; m2 <= right; m2++) {
									RemovePane[p.Row][p.Column + m2] = -1;
								}
								
								Tool_Position tt = new Tool_Position();
								tt.p = p;
								tt.tool =  20;
								tp.add(tt);
								
								HasMadeTool = true;
								
								gg.addGrade(sc.GetScore(5));
							}
							RemovePane[i + k][t] = -1;
						}
						
						if((!HasMadeTool) && (!ColumnHasUsed)) {
							Tool_Position tt = new Tool_Position();
							tt.p = CurrentPosition;
							tt.tool =  Pane[i][t]%10 + 10;
							tp.add(tt);
							
							HasMadeTool = true;
							gg.addGrade(sc.GetScore(4));
						}
						
						RemovePane[i][t] = -1;
						CanDirectRemoving = true;
					}
					
					if(d > 3) {
						boolean HasMadeTool = false;
						
						for(int k = 1; k <= d; k++) {
							Position p = new Position(i + k, t);
							int left= sr.LRow_Remove(p);
							int right = sr.RRow_Remove(p);
							
							if((left + right) >= 2) {
								for(int m1 = 1; m1 <=left; m1++) {
									RemovePane[p.Row][p.Column - m1] = -1;
								}
							
								for(int m2 = 1; m2 <= right; m2++) {
									RemovePane[p.Row][p.Column + m2] = -1;
								}
								
								Tool_Position tt = new Tool_Position();
								tt.p = p;
								tt.tool =  20;
								tp.add(tt);
								
								HasMadeTool = true;
								gg.addGrade(sc.GetScore(5));
							}
							
							RemovePane[i + k][t] = -1;
						}
						
						if((!HasMadeTool) && (!ColumnHasUsed)) {
							Tool_Position tt = new Tool_Position();
							tt.p = CurrentPosition;
							tt.tool =  20;
							tp.add(tt);
							
							HasMadeTool = true;
							gg.addGrade(sc.GetScore(5));
						}
						
						RemovePane[i][t] = -1;
						CanDirectRemoving = true;
					}
					
				} 
			}
		} 
		
		rh.setAfterRemovingPane(RemovePane);
		RemovePane = rh.getAfterRemovingPane();
		
		return CanDirectRemoving;
	}
	
}
