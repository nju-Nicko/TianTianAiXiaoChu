package game;

import java.util.TimerTask;

public class GameTime extends TimerTask{
	private GameState m;
	
	public GameTime(GameState m) {
		this.m = m;
	}
	
	public void run() {
		System.out.println("60s过去了，游戏结束！!");
		System.out.println("最大连击数： " + m.getMaxLianji());
		m.setFinished(true);
	}

}
