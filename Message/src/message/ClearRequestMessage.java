package message;

//清空好友请求消息类
public class ClearRequestMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String ID;
	
	public ClearRequestMessage(String id){
		ID=id;
		type=-106;
	}

}
