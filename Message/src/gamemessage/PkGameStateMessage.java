package gamemessage;

import game.GameStateFuBen;
import message.Message;

public class PkGameStateMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isSelf;
	public GameStateFuBen self;
	public GameStateFuBen other;
	
	public PkGameStateMessage() {
		this.type = 118;
	}
}
