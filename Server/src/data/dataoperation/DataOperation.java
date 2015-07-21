package data.dataoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import po.RecordPO;
import po.UserPO;
import data.databaseconnection.DatabaseConnection;
import dataservice.DataService;

public class DataOperation implements DataService {

	@Override
	public UserPO queryUserByName(String name) {
		// TODO Auto-generated method stub
        UserPO userPO = null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet =null;
		String sql = "select * from user where name =?";
		try {
			connection=DatabaseConnection.getConnection();
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				userPO=new UserPO(resultSet.getString("name"),
						resultSet.getString("password"),resultSet.getString("photo"),resultSet.getInt("maxscore"));
			}
	//		System.out.println("找到用户了" + userPO.getName() + "------" + userPO.getPassword());
			return userPO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DatabaseConnection.free(resultSet, connection, preparedStatement);
		}
		System.out.println("没找到用户了");
		return null;
	}

	@Override
	public boolean addUser(UserPO userPO) {
		// TODO Auto-generated method stub
		Connection connection1=null;
		PreparedStatement preparedStatement1=null;
		ResultSet resultSet1=null;
		String sql1= "insert into user(name,password,photo) values(?,?,?)";
		try {
			connection1=DatabaseConnection.getConnection();
			preparedStatement1 =connection1.prepareStatement(sql1);
			preparedStatement1.setString(1, userPO.getName());
			preparedStatement1.setString(2, userPO.getPassword());
			preparedStatement1.setString(3, userPO.getPhoto());
			preparedStatement1.executeUpdate();
		    System.out.println("写入数据库成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			DatabaseConnection.free(resultSet1, connection1, preparedStatement1);
		}
		return true;
	}
	
	public boolean updateUserByName(String name,UserPO userPO){
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet =null;
		String sql = "update user set password=?,photo=?,maxscore=? where name=?";
		try {
			connection=DatabaseConnection.getConnection();
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, userPO.getPassword());
			preparedStatement.setString(2, userPO.getPhoto());
			preparedStatement.setInt(3, userPO.getMaxScore());
			preparedStatement.setString(4, name);
			
			preparedStatement.executeUpdate();
		    System.out.println("更新数据库成功！");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("该记录不存在");
		}finally{
			DatabaseConnection.free(resultSet, connection, preparedStatement);
		}
		return false;
	}
	
	@Override
	public ArrayList<RecordPO> getAllrecordByUserName(String userName) {
		// TODO Auto-generated method stub
		ArrayList<RecordPO> recordList = new ArrayList<RecordPO>();
		RecordPO recordPO = null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet =null;
		String sql = "select * from gamerecord where name=?";
		try {
			connection=DatabaseConnection.getConnection();
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				recordPO=new RecordPO(resultSet.getInt("score"),
						resultSet.getString("name"),resultSet.getInt("maxcombonum"),resultSet.getString("time"));
				recordList.add(recordPO);
			}
			return recordList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DatabaseConnection.free(resultSet, connection, preparedStatement);
		}
		return null;
	}

	
	@Override
	public boolean addRecord(RecordPO recordPO) {
		// TODO Auto-generated method stub
	
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet =null;
		String sql = "insert into gamerecord(score,name,maxcombonum,time) values(?,?,?,?)";
		try {
			connection=DatabaseConnection.getConnection();
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setInt(1, recordPO.getScore());
			preparedStatement.setString(2, recordPO.getUserName());
			preparedStatement.setInt(3, recordPO.getMaxComboNum());
			preparedStatement.setString(4, recordPO.getTime());
			preparedStatement.executeUpdate();
		    System.out.println("写入数据库成功！");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DatabaseConnection.free(resultSet, connection, preparedStatement);
		}
		return false;
	}

	@Override
	public ArrayList<UserPO> getAllUser() {
		// TODO Auto-generated method stub
		ArrayList<UserPO> userList = new ArrayList<UserPO>();
		UserPO userPO = null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet =null;
		String sql = "select * from user ";
		try {
			connection=DatabaseConnection.getConnection();
			preparedStatement =connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				userPO=new UserPO(resultSet.getString("password"),
						resultSet.getString("name"),resultSet.getString("photo"),resultSet.getInt("maxscore"));
				userList.add(userPO);
			}
			return userList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DatabaseConnection.free(resultSet, connection, preparedStatement);
		}
		return null;
	}
	
}
