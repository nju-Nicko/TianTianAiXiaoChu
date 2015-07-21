package presentation.gameui;

import gamemessage.ChangePositionMessage;
import gamemessage.CloseNetMessage;
import gamemessage.CorpGameOverMessage;
import gamemessage.GameStateMessage;
import gamemessage.Game_infoMessage;
import gamemessage.ReNetMessage;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import main.Startup;
import message.QueryNeedToChangeBackMessage;
import net.Net;
import presentation.gameresultui.resultGUI;

public class updategui extends Thread{
	collaborationGameGUI game;
	static boolean ggg=false;
	static boolean  yyy=false;
	public updategui(collaborationGameGUI game){
		this.game=game;
	}
	@Override
	public void run(){
		ggg=false;
		while(true){
			if(game.playerExit){
				ImageIcon fi2=new ImageIcon(updategui.class.getResource("/bin/playerOff.png"));
				game.figurePhotoLabel2.setIcon(fi2);
			}
			game.frame.repaint();
			game.frame.validate();
			if(!ggg&&game.time<=60)
			{
				game.layeredpane.remove(game.topPane);
				ggg=true;
			}
			game.gradelabel.setText("   "+game.grade);
			game.timejpb.setValue(game.time);
			game.timelabel3.setText("   " + game.time);
			// timejpb.setToolTipText(""+time);
		
		if (game.time<= 0) {
			
		game.frame.dispose();
			//	gradetimer.cancel();
			//timeCaulater.cancel();	
			game.remindthread.stop();
			game.updatethread.stop();
			if(game.playerIdentify.equals("房主")){
				Startup.net.sendMessage(new CorpGameOverMessage());
				System.out.println("房主");
				}else{
					System.out.println("成员");
				}
			JOptionPane.showMessageDialog(game.frame, "游戏结束");
			
			/*while(game.sendnumber>game.receivenumber){
				System.out.println("开始清空");
				Game_infoMessage gamems = (Game_infoMessage) Startup.net
						.getMessage(115);
				if(gamems==null){
					ChangePositionMessage ppms = (ChangePositionMessage) Startup.net
							.getMessage(108);
					if(ppms==null){
						GameStateMessage message = (GameStateMessage) Startup.net
								.getMessage(100);
						if(message!=null){
							game.receivenumber++;
						}else{
							QueryNeedToChangeBackMessage  tt=(QueryNeedToChangeBackMessage) Startup.net.getMessage(300000);
							if(tt==null){
								System.out.println("位置类型");
							}
						}
					}
				}
			}*/
		System.out.println(game.sendnumber+"::::"+game.receivenumber);
		    //  CloseNetMessage close=new CloseNetMessage();
			//	Startup.net.sendMessage(close);
			//	System.out.println("closeNetMessage 发送 ");
				//try {
				//	Startup.net=new Net();
				//	ReNetMessage renet=new ReNetMessage();
				//	renet.UserID=Startup.window.uif.name;
				//	System.out.println(renet.UserID);
					
				//	Startup.net.sendMessage(renet);
				//	} catch (IOException e) {
					//	e.printStackTrace();
					//}
				//System.out.println(game.ID + "ooooooooooooooooooooooooooooooooooo");
				resultGUI   resultgui=new resultGUI(game.grade,game.ID,"头像",false);
				resultGUI.showtime(game.grade);
				yyy=true;
		}
		if(yyy){
			System.out.println("确定brek");
			break;
		}
			try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		}
}
