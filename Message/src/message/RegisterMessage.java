package message;

//×¢²á£¨·¢ËÍĞÅÏ¢£©
public class RegisterMessage extends Message {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String register_name;
	public String register_password;

	public RegisterMessage(String name, String password) {
		this.register_name = name;
		this.register_password = password;
		type = 0;
	}

}
