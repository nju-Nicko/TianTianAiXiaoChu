package gamemessage;

import message.Message;

public class SingleDirectremoveMessage extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String UserID;
	
	public SingleDirectremoveMessage(String UserID) {
		this.type = 105;
		this.UserID = UserID;
	}
	/*
	 * \//根据UserID找到GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.DirectRemove();
	 * 
	 * if(gg.getGrade() != 0) {
	 * 		Game_infoMessage mess = new Game_infoMessage();
	 * 		mess.gg = gg
	 * \//发送mess
	 * } 
	 */

}
