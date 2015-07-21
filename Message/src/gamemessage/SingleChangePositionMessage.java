package gamemessage;

import message.Message;
import game.Position;

public class SingleChangePositionMessage extends Message {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Position p1;
	public Position p2;
	public String UserID;
	
	public SingleChangePositionMessage(String UserID) {
		this.UserID = UserID;
		this.type = 110;
		p1 = new Position();
		p2 = new Position();
	}
	/*
	 * \//根据UserID找到GameState gamestate;
	 * Game_info gg = new Game_info(gamestate);
	 * RemoveAndDrop rad = new RemoveAndDrop(gg);
	 * rad.TwoPositionRemove(p1, p2);
	 * 
	 * if(gg.getGrade() != 0) {
	 * 		Game_infoMessage mess = new Game_infoMessage();
	 * 		mess.gg = gg
	 * \//发送mess
	 * } else {
	 * 		ChangePositionMessage mess = new ChangePositionMessage();
	 * 		mess.p1 = p1;
	 * 		mess.p2 = p2;
	 * \//发送mess
	 * }
	 */
}
