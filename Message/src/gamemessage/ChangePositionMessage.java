package gamemessage;

import game.Position;
import message.Message;

public class ChangePositionMessage extends Message{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Position p1 = new Position();
	public Position p2 = new Position();
	
	public ChangePositionMessage() {
		this.type = 108;
	}
}
