package gamemessage;

import message.Message;

public class PkGetStateMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String UserID;
	
	public PkGetStateMessage() {
		this.type = 120;
	}

}
