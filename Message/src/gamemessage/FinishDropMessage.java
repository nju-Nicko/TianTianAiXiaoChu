package gamemessage;

import message.Message;

public class FinishDropMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String UserID;
	
	public FinishDropMessage() {
		this.type = 118;
	}
}
