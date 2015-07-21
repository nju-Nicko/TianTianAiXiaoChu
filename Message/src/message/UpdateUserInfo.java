package message;

public class UpdateUserInfo extends Message{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String id;
	public String img;
	
    public UpdateUserInfo(String id, String i){
    	this.id=id;
        this.img=i;
        type=-40000;
    }
}
