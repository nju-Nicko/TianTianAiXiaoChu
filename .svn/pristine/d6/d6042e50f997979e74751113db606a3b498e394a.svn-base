package presentation_localgame;



import java.util.Scanner;


/*该方法类实现功能：
 * 1，每当有移动产生时即gameRange发生变化时，lastDoubleHitTime和lastTwoHitTime刷新
 * */
public class singleGameGUI_getMoveThread extends Thread {
	private singleGameGUI game;
	public singleGameGUI_getMoveThread(singleGameGUI game){
		this.game=game;
	}
	@Override
	public void run(){

			//获得移动 来源两个发面方法返回和对面远程获得
		while(true){
			//接受对面移动的信息
			
			
				if(game.gamepanel.getIsmovestate()==2&&game.state==1){
					Bl_Server blserver=new Bl_Server();
					Game_info gameinfo=blserver.single_game(game.gameRange.gameRange);
					if(gameinfo.getGrade()!=0){
					game.grade+=gameinfo.getGrade();
					game.lastTwoHitTime=game.lastDoubleHitTime;
					game.lastDoubleHitTime=game.timerObject.getTime();
					game.doublehitState=false;
					System.out.println("ssssss");
					}
					game.gameRange.gameRange=gameinfo.getAfterdeleteRange();
					game.rebuildGameRange=gameinfo.getNewAddRange();
					game.gameRange.guiUpdateCount=0;
	            
				}
				
			try {
				sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
			
		
	}

}
