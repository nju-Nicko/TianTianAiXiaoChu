package businesslogic.remove;

import game.Position;

import java.util.ArrayList;
import java.util.Random;

public class MakeNewPane {
	private static final int Color_Number = 7;
	private static final int PaneLen = 9;
	
	private static Random rand = new Random();
	private static int[][] ip = new int[PaneLen][PaneLen];
	
	private static ArrayList<Position> tool_e;
		
		public static int[][] GetInitialPane() {
			boolean res = true;
			
			while(res) {
				MakePane();
				Tool_E tool = new Tool_E(ip);
				
				if(tool.HasChangeRemoving()) {
					setTool_e(tool.GetChange_Position());
					res = false;
				}
			}
			return ip;
		}
		
		private static void MakePane() {
			
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
		
		private static boolean RowRepeat(Position a) {
			int i = a.Row;
			int k = a.Column;
			
			if(k >= 2) {
				if((ip[i][k] == ip[i][k-1]) && (ip[i][k-1] == ip[i][k-2])) {
					return true;
				}
			}
			
			return false;
		}
		
		private static boolean ColumnRepeat(Position a) {
			int i = a.Row;
			int k = a.Column;
			
			if(i >= 2) {
				if((ip[i][k] == ip[i-1][k]) && (ip[i-1][k] == ip[i-2][k])) {
					return true;
				}
			}
			
			return false;
		}

		public static ArrayList<Position> getTool_e() {
			return tool_e;
		}

		public static void setTool_e(ArrayList<Position> tool_e) {
			MakeNewPane.tool_e = tool_e;
		}
}
