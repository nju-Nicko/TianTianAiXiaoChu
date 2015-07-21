package message;

public class ShowUserInfoMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String username;
	
	public ShowUserInfoMessage(String str){
		username=str;
		type=-20000;
	}

}
