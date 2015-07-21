package presentation_localgame;

public class Tool_A {
	private int PaneLength = 9;
	private int[][] AfterChangePane = new int[9][9];
	private Position cp;
	private int c = 0;
	
	public int[][] UseTool_A(int[][] Pane, Position p) {
		this.cp = p;
		
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
		int p = PaneLength - 1;
		
		boolean b1 = (cp.Row == 0) && (cp.Column == 0);
		boolean b2 = (cp.Row == 0) && (cp.Column == p);
		boolean b3 = (cp.Row == p) && (cp.Column == 0);
		boolean b4 = (cp.Row == p) && (cp.Column == p);
		
		boolean b5 = (cp.Row == 0) && ((cp.Column != 0) && (cp.Column != p) );
		boolean b6 = (cp.Row == p) && ((cp.Column != 0) && (cp.Column != p) );
		boolean b7 = (cp.Column == 0) && ((cp.Row != 0) && (cp.Row != p) );
		boolean b8 = (cp.Column == p) && ((cp.Row != 0) && (cp.Row != p) );
		
		boolean b9 = ((cp.Column != 0) && (cp.Column != p)) && ((cp.Row != 0) && (cp.Row != p) );
		
		if(b1) {
			A_LU();
		}
		
		if(b2) {
			A_RU();
		}
		
		if(b3) {
			A_LD();
		}
		
		if(b4) {
			A_RD();
		}

		if(b5) {
			A_UM();
		}
		
		if(b6) {
			A_DM();
		}
		
		if(b7) {
			A_LM();
		}
		
		if(b8) {
			A_RM();
		}

		if(b9) {
			A_Middle();
			
		}
	}
	
	//左上角
	private void A_LU() {
		AfterChangePane[0][1] = -1;
		AfterChangePane[1][0] = -1;
		AfterChangePane[1][1] = -1;
	}
	
	//右上角
	private void A_RU() {
		AfterChangePane[0][PaneLength - 2] = -1;
		AfterChangePane[1][PaneLength - 2] = -1;
		AfterChangePane[1][PaneLength - 1] = -1;
	}
		
	//左下角
	private void A_LD() {
		AfterChangePane[PaneLength - 2][0] = -1;
		AfterChangePane[PaneLength - 2][1] = -1;
		AfterChangePane[PaneLength - 1][1] = -1;
	}
		
	//右下角
	private void A_RD() {
		AfterChangePane[PaneLength - 2][PaneLength - 2] = -1;
		AfterChangePane[PaneLength - 2][PaneLength - 1] = -1;
		AfterChangePane[PaneLength - 1][PaneLength - 2] = -1;
	}
	
	//左中部
	private void A_LM() {
		AfterChangePane[cp.Row - 1][cp.Column] = -1;
		AfterChangePane[cp.Row + 1][cp.Column] = -1;
		
		AfterChangePane[cp.Row][cp.Column + 1] = -1;
		AfterChangePane[cp.Row - 1][cp.Column + 1] = -1;
		AfterChangePane[cp.Row + 1][cp.Column + 1] = -1;
	}
		
	//右中部
	private void A_RM() {
		AfterChangePane[cp.Row - 1][cp.Column] = -1;
		AfterChangePane[cp.Row + 1][cp.Column] = -1;
		
		AfterChangePane[cp.Row][cp.Column - 1] = -1;
		AfterChangePane[cp.Row - 1][cp.Column - 1] = -1;
		AfterChangePane[cp.Row + 1][cp.Column - 1] = -1;
	}
			
	//上中部
	private void A_UM() {
		AfterChangePane[cp.Row][cp.Column - 1] = -1;
		AfterChangePane[cp.Row][cp.Column + 1] = -1;
		
		AfterChangePane[cp.Row + 1][cp.Column - 1] = -1;
		AfterChangePane[cp.Row + 1][cp.Column] = -1;
		AfterChangePane[cp.Row + 1][cp.Column + 1] = -1;		
	}
			
	//下中部
	private void A_DM() {
		AfterChangePane[cp.Row][cp.Column - 1] = -1;
		AfterChangePane[cp.Row][cp.Column + 1] = -1;
		
		AfterChangePane[cp.Row - 1][cp.Column - 1] = -1;
		AfterChangePane[cp.Row - 1][cp.Column] = -1;
		AfterChangePane[cp.Row - 1][cp.Column + 1] = -1;	
	}
	
	//中部
	private void A_Middle() {
		AfterChangePane[cp.Row - 1][cp.Column - 1] = -1;
		AfterChangePane[cp.Row - 1][cp.Column] = -1;
		AfterChangePane[cp.Row - 1][cp.Column + 1] = -1;
		
		AfterChangePane[cp.Row][cp.Column - 1] = -1;
		AfterChangePane[cp.Row][cp.Column + 1] = -1;
		
		AfterChangePane[cp.Row + 1][cp.Column - 1] = -1;
		AfterChangePane[cp.Row + 1][cp.Column] = -1;
		AfterChangePane[cp.Row + 1][cp.Column + 1] = -1;
	}
 }
