package presentation_localgame;

import java.util.ArrayList;

public class RemoveHelper {

	private Tool_A tool_a = new Tool_A();
	private Game_info gg = new Game_info();
	private ScoreCounter sc = new ScoreCounter();
	private Check_Tools check_tool = new Check_Tools();
	
	private Boolean NeedUseTool_A = true;
	private int[][] BeforeRemovingPane = new int[9][9];
	private int[][] AfterRemovingPane = new int[9][9];
	
	private ArrayList<Position> Tool_A_Positions = new ArrayList<Position>();
	private ArrayList<Position> Tool_B_Positions = new ArrayList<Position>();
	
	private ArrayList<Position> HasUsed_Tool_A_Position = new ArrayList<Position>();
	
	public RemoveHelper(int[][] Pane, Game_info gg) {
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				this.BeforeRemovingPane[i][k] = Pane[i][k];
			}
		}
		this.gg = gg;
		BeforeRemoving();
	}
	
	public int[][] getAfterRemovingPane() {
		return AfterRemovingPane;
	}
	
	public Game_info getGame_Info() {
		return gg;
	}
	
	public void setAfterRemovingPane(int[][] Pane) {
		
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				this.AfterRemovingPane[i][k] = Pane[i][k];
			}
		}
		
		if(Tool_A_Positions.size() != 0) {
			while(NeedUseTool_A) {
				UseTool_A();
			}
		}
			
		if(Tool_B_Positions.size() != 0) {
				
			for(Position p : Tool_B_Positions) {
					
				if(AfterRemovingPane[p.Row][p.Column] < 0) {
					AfterRemovingPane[p.Row][p.Column] = 20;
				}
					
			}
		}
		
	}
	
	private void BeforeRemoving() {
		Tool_A_Positions = check_tool.Check_Tool_A(BeforeRemovingPane);
		Tool_B_Positions = check_tool.Check_Tool_B(BeforeRemovingPane);
	}
	
	private void UseTool_A() {
		boolean UsedTool_A = false;
		
		for(Position p : Tool_A_Positions) {
			boolean boo1 = HasUsed_Tool_A_Position.contains(p);
			boolean boo2 = (AfterRemovingPane[p.Row][p.Column] < 0);
			
			if( boo2 && !boo1) {
				AfterRemovingPane = tool_a.UseTool_A(AfterRemovingPane, p);
				HasUsed_Tool_A_Position.add(p);
				UsedTool_A = true;
				
				int Score = sc.GetScore(6);
				gg.addGrade(Score);
			}
			
		}
		
		if(UsedTool_A) {
			NeedUseTool_A = true;
		} else {
			NeedUseTool_A = false;
		}
	}
	
}
