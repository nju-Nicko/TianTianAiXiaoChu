package message;

public class RemoveOneFriendRequestMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String ID1,ID2;
	
	public RemoveOneFriendRequestMessage(String user,String friend){
		ID1=user;
		ID2=friend;
		type=-108;
	}

}
