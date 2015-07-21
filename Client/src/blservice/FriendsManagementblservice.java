package blservice;

import java.util.ArrayList;

public interface FriendsManagementblservice {
	
	public ArrayList<String> get_friend_list(String ID);
	
	public void add_friend(String ID1,String ID2);
	
	public String agree_friend_adding(String ID1,String ID2);
	
	public void refuse_friend_adding(String ID1,String ID2);
	
	public void delete_friend(String ID1,String ID2);
	
	public ArrayList<String> get_info(String ID);

	public void agree_game_invitation(String ID1,String ID2,String game_model,String IP);
	
	public void refuse_game_invitation(String ID);
	
	public void send_game_invitation(String ID1,String ID2,String game_model,String IP);
	
	
}
