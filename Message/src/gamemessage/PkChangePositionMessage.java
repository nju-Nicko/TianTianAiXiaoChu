package gamemessage;

import message.Message;
import game.Position;

public class PkChangePositionMessage extends Message {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Position p1 = new Position();
	public Position p2 = new Position();
	public String UserID;
	
	public PkChangePositionMessage(String UserID) {
		this.UserID = UserID;
		this.type = 101;
	}
	
	/*
	 * \//根据UserID找到GameState gamestate,先给另外pk的玩家发送交换信息;
	 * PkChangePositionMessage mess = new PkChangePositionMessage();
	 * mess.p1 = p1;
	 * mess.p2 = p2;
	 * 
	 * \//给其他玩家发送交换位置的信息
	 * 
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.TwoPositionRemove(p1, p2);
	 * 
	 * if(gg.getGrade() != 0) {
	 * 		Game_infoMessage mess1 = new Game_infoMessage();
	 * 		mess.gg = gg
	 * \//给消除玩家发送mess1
	 * 		PkGame_infoMessage mess2 = new PkGame_infoMessage();
	 * 		mess2.gg = gg
	 * \//给Pk玩家发送mess2
	 * } else {
	 * 		ChangePositionMessage mess1 = new ChangePositionMessage();
	 * 		mess1.p1 = p1;
	 * 		mess1.p2 = p2;
	 * \//给消除玩家发送mess1
	 * 
	 * 		PkChangePositionMessage mess2 = new PkChangePositionMessage();
	 * 		mess2.p1 = p1;
	 * 		mess2.p2 = p2;
	 * \//给Pk玩家发送mess2
	 * }
	 */
}
