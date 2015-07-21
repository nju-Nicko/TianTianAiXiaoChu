package presentation_localgame;

import java.util.Random;

public class MakeNewPane {
	private int Color_Number = 7;
	private int PaneLen = 9;
	private static Random rand = new Random();
	private int[][] ip = new int[PaneLen][PaneLen];
		
		public int[][] GetInitialPane() {
			MakePane();
			return ip;
		}
		
		private void MakePane() {
			
			for(int i = 0; i < PaneLen; i ++) {

				for(int t = 0; t < PaneLen; t ++) {
					
					Position a =new Position(i, t);
					ip[i][t] = rand.nextInt(Color_Number) + 1;

					boolean res = RowRepeat(a) || ColumnRepeat(a);
					
					while(res) {
						ip[i][t] = rand.nextInt(Color_Number) + 1;
						res = RowRepeat(a) || ColumnRepeat(a);
					}
				}
			}
		}
		
		private boolean RowRepeat(Position a) {
			int i = a.Row;
			int k = a.Column;
			
			if(k >= 2) {
				if((ip[i][k] == ip[i][k-1]) && (ip[i][k-1] == ip[i][k-2])) {
					return true;
				}
			}
			
			return false;
		}
		
		private boolean ColumnRepeat(Position a) {
			int i = a.Row;
			int k = a.Column;
			
			if(i >= 2) {
				if((ip[i][k] == ip[i-1][k]) && (ip[i-1][k] == ip[i-2][k])) {
					return true;
				}
			}
			
			return false;
		}
}
