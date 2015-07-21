package message;

import java.util.ArrayList;

public class ShowOfflineFriendBackMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public ArrayList<String> offline_friends;
	
	public ShowOfflineFriendBackMessage(ArrayList<String> of){
		offline_friends=of;
		type=-116;
	}

}
