package businesslogic.login_register;

import blservice.Register_loginblservice;

public class Register_loginblservice_Stub implements Register_loginblservice{
	
	public String register(String name,String password){
		return "注册成功";
	}
	
	public String login(String ID,String password){
		return "登陆成功";
	}

}
