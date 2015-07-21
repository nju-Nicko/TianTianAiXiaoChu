package message;

import java.util.ArrayList;


public class MainUIBackMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String mainUI_photo_number;
	String mainUI_name;
	ArrayList<String> mainUI_friend_rank;
	ArrayList<String> mainUI_friend_list;

	public MainUIBackMessage(String photo_number, String name,
			ArrayList<String> friend_rank, ArrayList<String> friend_list) {
		this.mainUI_friend_list = friend_list;
		this.mainUI_friend_rank = friend_rank;
		this.mainUI_name = name;
		this.mainUI_photo_number = photo_number;
		type = 5;
	}
}
