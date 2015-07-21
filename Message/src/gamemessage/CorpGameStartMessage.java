package gamemessage;

import java.util.ArrayList;

import message.Message;

//协作模式游戏开始信息
public class CorpGameStartMessage extends Message {
	
	private static final long serialVersionUID = 1L;
	
	public boolean UseTool_C;
	public boolean UseTool_D;
	public boolean UseTool_E;
	
	//public boolean DropFromTop;
	
	public ArrayList<String> UseID;
	
	public CorpGameStartMessage() {
		this.type = 112;
	}
	/*
	 * GameState gamestate = new GameState();
	 * \//保存UserID和gamestate,下次你要能根据UserID找到GameState并转发给另一个人
	 * GameStateMessage mess = new GameStateMessage();
	 * mess.CurrentGameState = gamestate;
	 * \//给协作的玩家返回mess;
	 */
}
