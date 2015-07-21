package message;

public class QueryNeedToChange extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	
	public QueryNeedToChange(String i){
		id=i;
		type=-200000;
	}

}
