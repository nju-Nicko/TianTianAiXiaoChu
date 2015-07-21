package game;

import java.io.Serializable;
import java.util.ArrayList;

public class Game_info implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient GameState gamestate;
	private int grade;
	
	private boolean canDirectRemove = false;
	private ArrayList<Position> ChangePosition;
	
	private int[][] afterdeleteRange = new int[9][9];
	private int[][] newAddRange = new int[9][9];
	
	private boolean ChangePos = false;
	private boolean RemoveAndDrop = false;
	private boolean ContainGameState = false;
	private boolean FirstState = true;
	
	public Game_info() {
		grade = 0;
		this.ChangePosition = new ArrayList<Position>();
	}
	
	public Game_info(GameState gamestate) {
		grade = 0;
		this.gamestate = gamestate;
		this.ChangePosition = new ArrayList<Position>();
	}
	public int[][] GetCurrentPane() {
		return gamestate.getCurrentPane();
	}
	
	public int[][] getAfterdeleteRange() {
		return afterdeleteRange;
	}
	
	public void setAfterdeleteRange(int[][] afterdeleteRange) {
		this.afterdeleteRange = afterdeleteRange;
	}
	public int[][] getNewAddRange() {
		return newAddRange;
	}
	public void setNewAddRange(int[][] newAddRange) {
		this.newAddRange = newAddRange;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void addGrade(int gra) {
		if(gamestate.isUseTool_D()) {
			gra = (int) (gra*1.1);
		}
		
		if(gamestate.isInSuperState()) {
			gra = gra*2;
		}
		 
		this.grade += gra;
		gamestate.AddGrade(gra);
	}
	
	public void AddLianji() {
		gamestate.AddLianji();
	}
	
	public void setCurrentPane(int[][] Pane) {
		gamestate.setCurrentPane(Pane);
	}
	
	public void ReserveTimeOfTool_E(ArrayList<Position> p) {
		gamestate.setNeedUseTool_E(false);
		gamestate.setTool_E(p);
	}

	public boolean isCanDirectRemove() {
		return canDirectRemove;
	}

	public void setCanDirectRemove(boolean canDirectRemove) {
		this.canDirectRemove = canDirectRemove;
	}

	public ArrayList<Position> getChangePosition() {
		return ChangePosition;
	}

	public void setChangePosition(ArrayList<Position> changePosition) {
		ChangePosition = changePosition;
	}
	
	public void AddChangePosition(Position p) {
		ChangePosition.add(p);
	}

	public boolean isChangePos() {
		return ChangePos;
	}

	public void setChangePos(boolean changePos) {
		ChangePos = changePos;
	}

	public boolean isRemoveAndDrop() {
		return RemoveAndDrop;
	}

	public void setRemoveAndDrop(boolean removeAndDrop) {
		RemoveAndDrop = removeAndDrop;
	}

	public boolean isContainGameState() {
		return ContainGameState;
	}

	public void setContainGameState(boolean containGameState) {
		ContainGameState = containGameState;
	}

	public boolean isFirstState() {
		return FirstState;
	}

	public void setFirstState(boolean firstState) {
		FirstState = firstState;
	}
}
