package gamemessage;

import game.Position;
import message.Message;

public class SingleUseToolMessage extends Message {

	/**
	 * 是指使用道具A或者道具B
	 */
	private static final long serialVersionUID = 1L;
	
	public Position p;
	public String UserID;
	
	public SingleUseToolMessage(String UserID) {
		this.type = 107;
		this.UserID = UserID;
		p = new Position();
	}
	
	/*
	 * \//根据UserID找到GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.UseToolToRemove(Position p);
	 * 
	 * Game_infoMessage mess = new Game_infoMessage();
	 * mess.gg = gg
	 * \//发送mess
	 */
}
