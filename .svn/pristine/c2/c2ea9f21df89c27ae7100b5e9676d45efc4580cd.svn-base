package businesslogic.remove;

import game.Position;

public class Adjust {
	public static void AdjustPane(int[][] res, int[][] Pane) {
		for(int i = 0; i < 9; i++) {
			for(int m = 0; m < 9; m++) {
				
				if(res[i][m] == -1) {
					res[i][m] = -Pane[i][m];
				}
			}
		}
		
	}
	
	public static void ChangePane(int[][] Pane, Position p1, Position p2) {
		int a = Pane[p1.Row][p1.Column];
		
		Pane[p1.Row][p1.Column] = Pane[p2.Row][p2.Column];
		Pane[p2.Row][p2.Column] = a;
	}
}
