package message;

public class MainUIMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String mainUI_ID;
	
	public MainUIMessage(String ID){
		this.mainUI_ID = ID;
		type = 4;
	}

}
