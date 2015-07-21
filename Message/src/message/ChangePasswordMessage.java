package message;

public class ChangePasswordMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String old_password;
	public String new_password;
	
	public ChangePasswordMessage(String old_password,String new_password){
		this.old_password = old_password;
		this.new_password = new_password;
		type = 888;
	}

}
