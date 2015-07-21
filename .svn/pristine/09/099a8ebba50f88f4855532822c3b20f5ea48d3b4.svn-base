package gamemessage;

import game.Position;
import message.Message;

public class CorpUseToolMessage extends Message {

	/**
	 * 是指使用道具A或者道具B
	 */
	private static final long serialVersionUID = 1L;
	
	public Position p = new Position();
	public String UserID;
	
	public CorpUseToolMessage(String UserID) {
		this.type = 113;
		this.UserID = UserID;
	}

	/*
	 * \//根据UserID找到GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.UseToolToRemove(Position p);
	 * 
	 * Game_infoMessage mess = new Game_infoMessage();
	 * mess.gg = gg
	 * \//发送给所有协作的玩家mess
	 */
}
