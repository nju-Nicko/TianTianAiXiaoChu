package gamemessage;

import message.Message;

public class SingleGameOverMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String UserID;
	
	public SingleGameOverMessage() {
		type = 150;
	}

}
