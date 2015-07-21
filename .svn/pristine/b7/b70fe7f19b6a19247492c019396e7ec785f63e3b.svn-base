package presentation_localgame;

import java.util.ArrayList;

public interface Bl_Service {
	
	//直接消除游戏界面可以消除的地方
	public Game_info single_game(int[][]game_range);
	
	//道具AB的调用
	public Game_info prop_AB(int[][] game_layout,int x,int y);
	
	//道具E的调用
	public ArrayList<Position> prop_E(int[][] game_layout);
	
	//生成出盘
	public int[][] GetNewPane();
	
	//交换两位置后消除，游戏界面已交换
	public Game_info single_game(int[][]game_range, Position p1, Position p2);
}
