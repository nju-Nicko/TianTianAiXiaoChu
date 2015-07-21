package message;

import java.util.ArrayList;

public class ShowOnlineFriendBackMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ArrayList<String> online_friends;
	
	public ShowOnlineFriendBackMessage(ArrayList<String> of){
		online_friends=of;
		type=-114;
	}

}
