package businesslogic.remove;

import game.Game_info;
import game.Position;

public class RemoveAndDrop {
	private Game_info gg;
	private Drop drop = new Drop();
	private int[][] Pane;
	private boolean RemoveTool_B;

	public RemoveAndDrop(Game_info gg) {
		gg.setGrade(0);
		this.setRemoveTool_B(false);
		this.gg = gg;
		this.Pane = gg.GetCurrentPane();
	}
	
	public void TwoPositionRemove(Position p1, Position p2) {
		Adjust.ChangePane(Pane, p1, p2);
		 
		Two_Position_Remove tpr = new Two_Position_Remove(gg);
		tpr.Remove(p1, p2);
		 
		 if(gg.getGrade() != 0) {
		  	int[][] res1 = tpr.GetAfterChangePane();
		 	Adjust.AdjustPane(res1, Pane);
		 	
		  	int[][] res2 = tpr.GetNewToolPane();
		 	drop.DropFromTop(res2);
		 	
		 	gg.setAfterdeleteRange(res1);
		 	gg.AddLianji();
		 	gg.setNewAddRange(drop.GetDropHelperPane());
		 	gg.setCurrentPane(drop.GetAfterChangePane());
		 	gg.ReserveTimeOfTool_E(drop.GetTool_ERes());
		 	gg.setCanDirectRemove(DirectRemoving.CanDirectRemoving(drop.GetAfterChangePane()));
		  }
	}
	
	public void DirectRemove() {
		DirectRemoving dr = new DirectRemoving(gg);
		
		boolean res = dr.CanDirectRemoving();
		
		int[][] p1 = new int[9][9];
		int[][] p2 = new int[9][9];
		
		if(res) {
			p1 = dr.GetAfterRemovingPane();
			p2 = dr.GetNewToolPane();
			
			Adjust.AdjustPane(p1, Pane);
			
			drop.DropFromTop(p2);
		
			gg.setAfterdeleteRange(p1);
			gg.AddLianji();
			gg.setNewAddRange(drop.GetDropHelperPane());
			gg.setCurrentPane(drop.GetAfterChangePane());
			gg.ReserveTimeOfTool_E(drop.GetTool_ERes());
			gg.setCanDirectRemove(DirectRemoving.CanDirectRemoving(drop.GetAfterChangePane()));
			/*
			System.out.println("\n\n-----------------------------\n\n无道具消除结果：");
			ShowPane(p1);
			
			System.out.println("\n\n-----------------------------\n\n有道具消除结果：");
			ShowPane(p2);
			
			System.out.println("\n\n-----------------------------\n\n掉落结果：");
			ShowPane(drop.GetDropHelperPane());
			*/
			
		} else {
			
			//System.out.println("无可消除的！！！！！！！！");
			gg.setAfterdeleteRange(Pane);
		}
	}
	
	public void UseToolToRemove(Position p) {
		RemoveHelper rh = new RemoveHelper(Pane, gg);
		
		int[][] res = null;
		
		if(Pane[p.Row][p.Column] == 20) {
			Tool_B tool_b = new Tool_B();
			res = tool_b.UseTool_B(Pane, p);
			
			rh.setAfterRemovingPane(res);
			res = rh.getAfterRemovingPane();
			
			Adjust.AdjustPane(res, Pane);
			
			res[p.Row][p.Column] = -20;
			RemoveTool_B = true;
			gg.addGrade(ScoreCounter.GetScore(5));
			
		} else {
			Tool_A tool_a = new Tool_A();
			res = tool_a.UseTool_A(Pane, p);
			
			rh.setAfterRemovingPane(res);
			res = rh.getAfterRemovingPane();
			
			Adjust.AdjustPane(res, Pane);
			gg.addGrade(ScoreCounter.GetScore(6));
		}
		
		if(gg.getGrade() != 0) {
			drop.DropFromTop(res);
			gg.AddLianji();
			gg.setAfterdeleteRange(res);
			gg.setNewAddRange(drop.GetDropHelperPane());
			gg.setCurrentPane(drop.GetAfterChangePane());
			gg.ReserveTimeOfTool_E(drop.GetTool_ERes());
			gg.setCanDirectRemove(DirectRemoving.CanDirectRemoving(drop.GetAfterChangePane()));
		}
		/*
		System.out.println("\n\n-----------------------------\n\n消除结果：");
		ShowPane(res);
		
		System.out.println("\n\n-----------------------------\n\n掉落结果：");
		ShowPane(drop.GetDropHelperPane());
		*/
	}

	public boolean isRemoveTool_B() {
		return RemoveTool_B;
	}

	public void setRemoveTool_B(boolean removeTool_B) {
		RemoveTool_B = removeTool_B;
	}
}
