package net;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import po.UserState;

public class User {

	public Socket sock;
	public String id;
	public ObjectOutputStream oos;
	public UserState state;
	public boolean CanReceiveMessage = true;
	public boolean needToUpdateInfo=false;
	
	public User(String id,Socket sock){
		this.sock=sock;
		this.id=id;
		this.state = UserState.OnLine;
		try {
			this.oos=new ObjectOutputStream(sock.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public boolean equals(Object u) {
		User p = (User) u;
		return p.id.equals(id);
	}
}
