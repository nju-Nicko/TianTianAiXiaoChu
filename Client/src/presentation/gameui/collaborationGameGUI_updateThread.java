package presentation.gameui;

//注意事项：
//         重点
//此处接受消息不能出现等待，如果接收不到就跳过继续刷新
//网络添加有两处
import game.Position;
import gamemessage.CorpGetStateMessage;
import gamemessage.GameStateMessage;
import java.util.ArrayList;
import main.Startup;
public class collaborationGameGUI_updateThread extends Thread {
	collaborationGameGUI game;

	public collaborationGameGUI_updateThread(collaborationGameGUI game) {
		this.game = game;
	}

	@Override
	public void run() {
	while (true) {
			game.frame.repaint();
			game.frame.validate();
			synchronized (game.pVlock) {
				game.pVlock.notifyAll();
				try {
			//game.up.run();
				sleep(5);
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
               game.isStateReceibe=false;
				// 发送项初始化 获取协作游戏状态 例如分数 时间
               if(game.iscansendstate){
				CorpGetStateMessage sendms = new CorpGetStateMessage();
				game.sendnumber++;
				sendms.UserID = game.ID;
				// 发送接受游戏状态的请求
				// 发送消息类型：121 发送给服务器 接受游戏状态请求
				Startup.net.sendMessage(sendms);
               
				
				GameStateMessage message = (GameStateMessage) Startup.net
						.getMessage(100);
				
				// 数据的接受
				if (message != null) {
					game.isStateReceibe=true;
					game.receivenumber++;
					game.doublehitCount = message.CurrentGameState.Lianji;
					game.doublehitState = message.CurrentGameState.InSuperState;
					game.grade = message.CurrentGameState.TotalGrade;
					game.time = message.CurrentGameState.Time;
					game.playerExit=message.CurrentGameState.HasUserOffLine;
					if(message.CurrentGameState.NeedUseTool_E){
						if(game.dropdirection==2){
						ArrayList<Position> psi=message.CurrentGameState.Tool_E;
						game.remindx1=psi.get(0).Row;
						game.remindy1=psi.get(0).Column;
						game.remindx2=psi.get(1).Row;
						game.remindy2=psi.get(1).Column;
						}else{
							ArrayList<Position> psi=message.CurrentGameState.Tool_E;
							game.remindy1=psi.get(0).Row;
							game.remindx1=psi.get(0).Column;
							game.remindy2=psi.get(1).Row;
							game.remindx2=psi.get(1).Column;	
						
					}
					}else{
						game.remindx1=-1;
						game.remindy1=-1;
						game.remindx2=-1;
						game.remindy2=-1;
					}
					
				} else {
				//	System.out.println("update thread 获取为空陷入等待");
					game.isStateReceibe=false;
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
