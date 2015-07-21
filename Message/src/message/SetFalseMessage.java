package message;

public class SetFalseMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	
	public SetFalseMessage(String i){
		this.id=i;
		type=1999;
	}

}
