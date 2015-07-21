package presentation_localgame;

public class Single_Remove {
	private int[][] AfterChangePane;
	
	public Single_Remove(int[][] Pane) {
		AfterChangePane = Pane;
	}
	
	public int LRow_Remove(Position p) {
		int res = 0;
		boolean Continued = true;
		
		int a = p.Row;
		int b = p.Column;
		int c = AfterChangePane[a][b]%10;
		
		while((b >= 1) && (Continued)) {
			if(AfterChangePane[a][b - 1]%10 == c) {
				res++;
			} else {
				Continued = false;
			}
			b--;
		}
		
		return res;
	}
	
	public int RRow_Remove(Position p) {
		int res = 0;
		boolean Continued = true;
		
		int a = p.Row;
		int b = p.Column;
		int c = AfterChangePane[a][b]%10;
		
		while((b <= 7) && (Continued)) {
			if(AfterChangePane[a][b + 1]%10 == c) {
				res++;
			} else {
				Continued = false;
			}
			b++;
		}
		
		return res;
	}
	
	public int UColumn_Remove(Position p) {
		int res = 0;
		boolean Continued = true;
		
		int a = p.Row;
		int b = p.Column;
		int c = AfterChangePane[a][b]%10;
		
		while((a >= 1) && (Continued)) {
			if(AfterChangePane[a - 1][b]%10 == c) {
				res++;
			} else {
				Continued = false;
			}
			a--;
		}
		
		return res;
	}

	public int DColumn_Remove(Position p) {
		int res = 0;
		boolean Continued = true;
		
		int a = p.Row;
		int b = p.Column;
		int c = AfterChangePane[a][b]%10;
		
		while((a <= 7) && (Continued)) {
			if(AfterChangePane[a + 1][b]%10 == c) {
				res++;
			} else {
				Continued = false;
			}
			a++;
		}
		
		return res;
	}
}
