package dataservice;

import java.util.ArrayList;

import po.RecordPO;
import po.UserPO;

public interface DataService {
	
    //返回指定id的用户对象
	public UserPO queryUserByName(String name);
	
	//向数据库中添加一个用户
	public boolean addUser(UserPO userPO);
	
	//更新指定id用户的数据
	public boolean updateUserByName(String name,UserPO userPO);
	
	//返回所有数据库中用户的列表
	public ArrayList<UserPO> getAllUser();
	
	//返回包含指定id用户所有游戏记录对象的列表
	public ArrayList<RecordPO> getAllrecordByUserName(String userName);
	
	//向数据库中添加一个游戏记录
	public boolean addRecord(RecordPO recordPO);
	
}
