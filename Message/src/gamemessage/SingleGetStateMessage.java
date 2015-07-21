package gamemessage;

import message.Message;

public class SingleGetStateMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String UserID;
	
	public SingleGetStateMessage() {
		this.type = 119;
	}

}
