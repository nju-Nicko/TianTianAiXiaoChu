package game;

import java.util.TimerTask;

public class SuperState extends TimerTask{
	private GameState m;
	
	public SuperState(GameState m) {
		this.m = m;
	}
	
	@Override
	public void run() {
		System.out.println("In SuperState,ÎŞµĞ×´Ì¬½áÊøÁË£¡!");
		m.setInSuperState(false);
	}

}
