package presentation_localgame;

import java.util.ArrayList;

public class GetRpositons {
	
	public ArrayList<int[]> GetRemovablePositions(int[][] Pane) {
		ArrayList<int[]> res = new ArrayList<int[]>();
		
		for(int i = 0; i < Pane.length; i++) {
			for(int t = 0; t < Pane[0].length; t++) {
				
				if(Pane[i][t] < 0) {
					int[] m = new int[]{i, t};
					res.add(m);
				}
			}
			
		}
		
		return res;
	}
	
}
