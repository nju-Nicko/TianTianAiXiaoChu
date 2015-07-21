package businesslogic.mainframebl;

import java.util.ArrayList;

import blservice.MainFrameblservice;

public class MainFrameblservice_Stub implements MainFrameblservice{
	
	public String get_photo(String ID){
		return "头像1";
	}
	
	public String get_name(String ID){
		return "Jane";
	}
	
	public ArrayList<String> get_friend_rank(String ID){
		ArrayList<String> list=new ArrayList<String>();
		list.add("头像1#Lucy#1200");
		list.add("头像2#Jane#1000");
		list.add("头像3#Bob#1000");
		return list;
	}

}
