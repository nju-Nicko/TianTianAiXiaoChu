package game;

import java.util.TimerTask;

public class Tool_E_Timer extends TimerTask{
	private GameState m;
	
	public Tool_E_Timer(GameState m) {
		this.m = m;
	}
	@Override
	public void run() {
		m.setNeedUseTool_E(true);
	}	
}
