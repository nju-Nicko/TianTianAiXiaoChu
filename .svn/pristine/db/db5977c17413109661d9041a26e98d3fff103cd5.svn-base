package presentation_singleGameGUI;

import gamemessage.Game_infoMessage;
import gamemessage.SingleDirectremoveMessage;

import java.io.IOException;
import java.util.Scanner;

import main.Startup;
import net.Net;
/*该方法类实现功能：
 * 1，每当有移动产生时即gameRange发生变化时，lastDoubleHitTime和lastTwoHitTime刷新
 * */
public class singleGameGUI_getMoveThread extends Thread implements Runnable {
	private singleGameGUI game;
	public singleGameGUI_getMoveThread(singleGameGUI game){
		this.game=game;
	}
	public boolean getfalse(int[][] check
			){
		int count=0;
		for (int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(check[i][j]==0){
					count++;
				}
			}
		}
		if(count>=81){
			return false;
		}else{
		return true;
		}
	}

	@Override
	public void run(){

			//获得移动 来源两个发面方法返回和对面远程获得
		while(true){
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//接受对面移动的信息
			synchronized (game.pVlock) {
				game.pVlock.notifyAll();
			game.gamepanel.getIsmovestate();
			if (game.iscanreceived) {
			        
				
				SingleDirectremoveMessage	sendms=new SingleDirectremoveMessage(game.ID);
				 Startup.net.sendMessage(sendms);
				Game_infoMessage message=(Game_infoMessage)  Startup.net.getMessage(115);
				if(message!=null){
					if(getfalse(message.gg.getAfterdeleteRange())){
            
				game.gameRange.gameRange=message.gg.getAfterdeleteRange();
				game.gameRange.guiUpdateCount=0;
				game.rebuildGameRange=message.gg.getNewAddRange();
				game.isNextDelete=message.gg.isCanDirectRemove();
					}
				}
			}
		
			try {
				game.pVlock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
			
			}
			
		}
				
			
		
	}


