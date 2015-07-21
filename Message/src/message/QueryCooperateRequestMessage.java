package message;

public class QueryCooperateRequestMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String ID;
	
	public QueryCooperateRequestMessage(String id){
		ID=id;
		type=-202;
	}

}
