package gamemessage;

import game.Position;
import message.Message;

public class SelectPositionMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Position p;
	public String UserID;
	
	public SelectPositionMessage(Position p) {
		this.p = p;
		this.type = 117;
	}
	
}
