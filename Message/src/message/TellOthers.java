package message;

public class TellOthers extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String user;
	
	public TellOthers(String user){
		this.user=user;
		type=10000;
	}

}
