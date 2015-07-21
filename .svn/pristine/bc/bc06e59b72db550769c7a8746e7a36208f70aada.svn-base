package businesslogic.remove;

import game.Position;

public class Tool_B {
	private int PaneLength = 9;
	private int[][] AfterChangePane = new int[9][9];
	private Position p;
	
	public int[][] UseTool_B(int[][] Pane, Position p) {
		this.p = p;
		
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				this.AfterChangePane[i][k] = Pane[i][k];
			}
		}
		
		AfterChangePane[p.Row][p.Column] = -1;
		JudgePosition();
		
		return AfterChangePane;
	}

	private void JudgePosition() {
		
		for(int i = 0; i < PaneLength; i ++) {
			AfterChangePane[i][p.Column] = -1;
			AfterChangePane[p.Row][i] = -1;
		}
		
	}
	
}
