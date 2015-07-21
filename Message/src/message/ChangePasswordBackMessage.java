package message;

public class ChangePasswordBackMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//back_info: "ÃÜÂë´íÎó","ĞŞ¸Ä³É¹¦"
	public String back_info;
	
	public ChangePasswordBackMessage(String back_info){
		this.back_info = back_info;
		type = -888;
	}

}
