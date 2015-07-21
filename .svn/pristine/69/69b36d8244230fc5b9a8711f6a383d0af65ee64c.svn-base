package gamemessage;

import game.Position;
import message.Message;

public class PkUseToolMessage extends Message {

	/**
	 * 是指使用道具A或者道具B
	 */
	private static final long serialVersionUID = 1L;
	
	public Position p = new Position();
	public String UserID;
	
	public PkUseToolMessage(String UserID) {
		this.type = 104;
		this.UserID = UserID;
	}

	/*
	 * \//根据UserID找到GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.UseToolToRemove(Position p);
	 * 
	 * Game_infoMessage mess1 = new Game_infoMessage();
	 * mess1.gg = gg
	 * \//发送给消除玩家mess1
	 * 
	 * PkGame_infoMessage mess2 = new PkGame_infoMessage();
	 * mess2.gg = gg
	 * \//发送给Pk玩家mess2
	 */
}
