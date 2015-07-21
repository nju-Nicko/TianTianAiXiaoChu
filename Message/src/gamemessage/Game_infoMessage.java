package gamemessage;

import message.Message;
import game.Game_info;

public class Game_infoMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Game_info gg;
	
	public Game_infoMessage() {
		this.type = 115;
	}
}
