package message;

public class GetRankListMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String user;
	
	public GetRankListMessage(String user){
		this.user = user;
		type = 777;
	}
}
