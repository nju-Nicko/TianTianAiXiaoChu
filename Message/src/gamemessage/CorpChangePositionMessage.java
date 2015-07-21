package gamemessage;

import message.Message;
import game.Position;

public class CorpChangePositionMessage extends Message {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Position p1 = new Position();
	public Position p2 = new Position();
	public String UserID;
	
	public CorpChangePositionMessage(String UserID) {
		this.UserID = UserID;
		this.type = 109;
	}
	/*
	 * \//根据UserID找到GameState gamestate,先给另外的玩家发送交换信息;
	 * ChangePositionMessage mess = new ChangePositionMessage();
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
	 * 		Game_infoMessage mess = new Game_infoMessage();
	 * 		mess.gg = gg
	 * \//给所有玩家发送mess
	 * } else {
	 * 		ChangePositionMessage mess = new ChangePositionMessage();
	 * 		mess.p1 = p1;
	 * 		mess.p2 = p2;
	 * \//给所有玩家发送mess
	 * }
	 */
}
