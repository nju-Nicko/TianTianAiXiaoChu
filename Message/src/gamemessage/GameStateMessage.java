package gamemessage;

import game.GameStateFuBen;

import java.io.Serializable;

import message.Message;

public class GameStateMessage extends Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GameStateFuBen CurrentGameState;
	
	public GameStateMessage() {
		this.type = 100;
	}
 
}
