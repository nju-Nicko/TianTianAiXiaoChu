package message;

public class SendPKInvitationMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String user;
	public String friend;
	
	public SendPKInvitationMessage(String u,String f){
		user = u;
		friend = f;
		type = 1111;
	}

}
