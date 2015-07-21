package gamemessage;

import message.Message;

public class DirectRemoveMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String UserID;

	public DirectRemoveMessage(String UserID) {
		this.UserID = UserID;
		this.type = 114;
	}
}
