package presentation_localgame;

import java.util.ArrayList;


public class Bl_Server implements Bl_Service {
	private MakeNewPane mnp;
	private DirectRemoving dr;
	private Two_Position_Remove tpr;
	private Drop drop;
	private RemoveHelper rh;
	private Game_info gg;
	
	private Tool_A tool_a;
	private Tool_B tool_b;
	private Tool_E Tool_e;
	
	public Bl_Server() {
		gg = new Game_info();
		drop = new Drop();
	}
	
	@Override
	public Game_info single_game(int[][] game_range, Position p1, Position p2) {
		gg.setGrade(0);
		
		tpr = new Two_Position_Remove(game_range, gg);
		tpr.single_game(p1, p2);
		
		if(gg.getGrade() != 0) {
			int[][] DeletePane = tpr.GetAfterChangePane();
			DeletePane = Adjust(DeletePane, game_range);
			
			int[][] NewToolPane = tpr.GetNewToolPane();
			drop.DropFromTop(NewToolPane);
			
			gg.setAfterdeleteRange(DeletePane);
			gg.setNewAddRange(drop.GetDropHelperPane());
		}
		
		return gg;
	}
	
	@Override
	public Game_info single_game(int[][] game_range) {
		gg.setGrade(0);
		dr = new DirectRemoving(game_range, gg);
		
		boolean res = dr.CanDirectRemoving();
		
		int[][] p1 = new int[9][9];
		int[][] p2 = new int[9][9];
		
		if(res) {
			p1 = dr.GetAfterRemovingPane();
			p2 = dr.GetNewToolPane();
			
			p1 = Adjust(p1, game_range);
			
			drop.DropFromTop(p2);
		
			gg.setAfterdeleteRange(p1);
			gg.setNewAddRange(drop.GetDropHelperPane());
			/*
			System.out.println("\n\n-----------------------------\n\n无道具消除结果：");
			ShowPane(p1);
			
			System.out.println("\n\n-----------------------------\n\n有道具消除结果：");
			ShowPane(p2);
			
			System.out.println("\n\n-----------------------------\n\n掉落结果：");
			ShowPane(drop.GetDropHelperPane());
			*/
			return gg;
		} else {
			
			gg.setAfterdeleteRange(game_range);
			
			return gg;
		}
		
	}

	@Override
	public Game_info prop_AB(int[][] game_layout, int x, int y) {
		//gg.setGrade(0);
		rh = new RemoveHelper(game_layout, gg);
		
		Position p = new Position(x, y);
		int[][] res = null;
		
		if(game_layout[x][y] == 20) {
			tool_b = new Tool_B();
			res = tool_b.UseTool_B(game_layout, p);
			
			rh.setAfterRemovingPane(res);
			res = rh.getAfterRemovingPane();
			
			res = Adjust(res, game_layout);
			res[x][y] = -20;
			
		} else {
			tool_a = new Tool_A();
			res = tool_a.UseTool_A(game_layout, p);
			
			rh.setAfterRemovingPane(res);
			res = rh.getAfterRemovingPane();
			
			res = Adjust(res, game_layout);
		}
		
		drop.DropFromTop(res);
		gg.setAfterdeleteRange(res);
		gg.setNewAddRange(drop.GetDropHelperPane());
		/*
		System.out.println("\n\n-----------------------------\n\n消除结果：");
		ShowPane(res);
		
		System.out.println("\n\n-----------------------------\n\n掉落结果：");
		ShowPane(drop.GetDropHelperPane());*/
		
		return gg;
	}

	@Override
	public ArrayList<Position> prop_E(int[][] game_layout) {
		
		Tool_e = new Tool_E(game_layout);
		Tool_e.HasChangeRemoving();
		ArrayList<Position> r =  Tool_e.GetChange_Position();
		
		return r;
	}

	@Override
	public int[][] GetNewPane() {
		mnp = new MakeNewPane();
		
		return mnp.GetInitialPane();
	}

	private int[][] Adjust(int[][] res, int[][] Pane) {
		for(int i = 0; i < 9; i++) {
			for(int m = 0; m < 9; m++) {
				
				if(res[i][m] == -1) {
					res[i][m] = -Pane[i][m];
				}
			}
		}
		
		return res;
	}
	
	private void ShowPane(int[][] p) {
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				System.out.print(p[i][k] + "  ");
			}
			
			System.out.println();
		}
	}
	
}
