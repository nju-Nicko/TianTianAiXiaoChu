package gamemessage;

import message.Message;

public class FinishMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String UserID;
	
	public FinishMessage() {
		this.type = 123;
	}
}
