package message;

public class RequestFriendBackMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean ok;
	
	public RequestFriendBackMessage(boolean ok){
		this.ok=ok;
		type=-30001;
	}

}
