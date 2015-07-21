package presentation_localgame;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		int[][] res = new int[][]{{1,1,3,2,1,6,7,5,5},{1,2,6,7,4,7,4,6,7},{4,3,7,5,5,3,1,2,3},{6,6,2,5,3,6,2,2,7},{7,4,2,4,2,7,1,4,1},{2,5,6,3,3,2,5,7,3},{3,7,5,3,7,4,1,2,4},{6,1,4,4,5,6,3,2,3},{5,1,3,6,1,7,3,5,6}};
		Tool_E t = new Tool_E(res);
		
		boolean p = t.HasChangeRemoving();
		
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				System.out.print(res[i][k] + "   ");
			}
			System.out.println();
		}
		
		if(p) {
			ArrayList<Position> gg = t.GetChange_Position();
			for(Position x : gg) {
				System.out.println(x.Row + " " + x.Column);
			}
		}
	}
}
