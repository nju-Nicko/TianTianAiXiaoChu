package message;

public class ShowOnlineFriendMessage2 extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String ID;

	public ShowOnlineFriendMessage2(String id) {
		ID = id;
		type = -99999;
	}

}
