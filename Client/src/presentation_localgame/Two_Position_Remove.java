package presentation_localgame;

public class Two_Position_Remove {
	private int Tool_p1 = 0;
	private int Tool_p2 = 0;
	
	private int[][] AfterChangePane = new int[9][9];
	private int[][] NewToolPane = new int[9][9];
	
	private Game_info gg;
	private RemoveHelper rh;
	
	private Row_Double_Remove rdr;
	private Column_Double_Remove cdr;
	
	public Two_Position_Remove(int[][] game_layout, Game_info gg) {
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				AfterChangePane[i][k] = game_layout[i][k];
			}
		}
		
		this.gg = gg;
	}
	
	public int[][] GetAfterChangePane() {
		return AfterChangePane;
	}
	
	public int[][] GetNewToolPane() {
		return NewToolPane;
	}
	
	public void single_game(Position p1,Position p2) {
		rh = new RemoveHelper(AfterChangePane, gg);
		
		//同一行
		if(p1.Row == p2.Row) {
			rdr = new Row_Double_Remove(AfterChangePane, gg);
			
			if(p1.Column < p2.Column) {
				rdr.Row_Remove(p1, p2);
				Tool_p1 = rdr.GetTool_p1();
				Tool_p2 = rdr.GetTool_p2();
				
			} else {
				rdr.Row_Remove(p2, p1);
				Tool_p1 = rdr.GetTool_p2();
				Tool_p2 = rdr.GetTool_p1();
			}
		
			AfterChangePane = rdr.GetPane();
		}
		
		//同一列
		else {
			cdr = new Column_Double_Remove(AfterChangePane, gg);
			if(p1.Row < p2.Row) {
				cdr.Column_Remove(p1, p2);
				Tool_p1 = cdr.GetTool_p1();
				Tool_p2 = cdr.GetTool_p2();
				
			} else {
				cdr.Column_Remove(p2, p1);
				Tool_p1 = cdr.GetTool_p2();
				Tool_p2 = cdr.GetTool_p1();
			}
			
			AfterChangePane = cdr.GetPane();
			
		}
		
		rh.setAfterRemovingPane(AfterChangePane);
		AfterChangePane = rh.getAfterRemovingPane();
		
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				NewToolPane[i][k] = AfterChangePane[i][k];
			}
		}
		
		if(Tool_p1 != 0) {
			NewToolPane[p1.Row][p1.Column] = Tool_p1;
		}
		
		if(Tool_p2 != 0) {
			NewToolPane[p2.Row][p2.Column] = Tool_p2;
		}
		
	}
}
