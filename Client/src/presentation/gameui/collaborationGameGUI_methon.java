package presentation.gameui;
//�����ʼ������
//�˴��������������Ӳ���
//��������һЩ���ݵĳ�ʼ��
import gamemessage.CorpGameStartMessage;
import gamemessage.CorpGetStateMessage;
import gamemessage.CorpTestMessage;
import gamemessage.FinishDropMessage;
import gamemessage.GameStateMessage;
import gamemessage.Game_infoMessage;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



import main.Startup;
import net.Net;
public class collaborationGameGUI_methon extends collaborationGameGUI{
	public void initlizeGameValue() throws IOException{
		playerExit=false;
		isStateReceibe=false;
		iscansendstate=true;
		sendnumber=0;
		receivenumber=0;
		iscanreceived=true;
		isNextDelete=false;
		state = 0;
        dropdirection=Startup.window.mainframe.direction;
		last_x = -1;// Ϊ-1ʱ��ʾ��ʼʱ
		last_y = -1;//
		// ����ĵ�ǰλ��
		now_x = -1;// -1��ʾ��ʼλ��
		now_y = -1;
		// ��ʾ���ߵĳ�ʼ��
		remindx1 = -1;
		remindx2 = -1;
		remindy1 = -1;
		remindy2 = -1;
		// ������ʼ��
		doublehitCount = 0;
		//�����ĳ�ʼ��
		grade=0;
		time=65;
		// ���������ĵ���
		perfectState = false;
		 
		 System.out.println("��ʼ��λ��"+ID);
		 //�������ʼ��
		 
		
		 
		 
		 
		 System.out.println("λ��3");
		 
			
			 
			 //�������ʼ��������Ϣ���͹�ȥ��������Ϸ��ʼ�������ĵ���
			 CorpGetStateMessage sendms=new CorpGetStateMessage ();
			
			
			 
		sendms.UserID=ID;
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7
		//���ͷ�����Ϣ���͹�ȥ
		//��Ϣ���ͣ�112  �ÿͻ���Ϊ���������͸��������þ���Ϸ����ʹ�����������ʼ��Ϸ
		Startup.net.sendMessage(sendms);
		System.out.println("-sd-------------------------------------->???????????");
		 /*else{
			 FinishDropMessage sendms=new  FinishDropMessage();
				sendms.UserID=ID;
				//System.out.println("finish drop   �ƶ�"+ID);
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				//�����ƶ���Ϣ����������
				//��ʱ�������      �ͻ��˷���������
				//��Ϣ���ͣ�118    ���߷������ͻ��˵�ǰ����״̬
				Startup.net.sendMessage(sendms);
		 }*/
		
		//���� ���Կͻ��˵ĳ�ʼ������
		 
		 
		Boolean receivedB=true;
		while(receivedB){
			//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7&&&&&&
			//���ܷ���������Ϣ��������ܲ��ɹ����ͼ�������
			//������Ϣ���ͣ�100�����ڻ�ȡ�����ʼ������
			
		GameStateMessage message=(GameStateMessage) Startup.net.getMessage(100);
		if(message!=null){
		//rebuildGameRange = message.CurrentGameState.g;// ��ʼ�����棬���ں��ڻ����Ϸ��ʼ����
		gameRange.gameRange=message.CurrentGameState.CurrentPane;
		gameRange.guiUpdateCount=0;
		state=0;
		System.out.println("��ʼ�����յ�");
		
		print(gameRange.gameRange,9);
		receivedB=false;
		}else{
			System.out.println("�޻ظ�"+ID);
		}
		}
		
	
		 //rebuildGameRange = getinitlizeGame();// ��ʼ�����棬���ں��ڻ����Ϸ��ʼ����
		//	gameRange.gameRange=getinitlizeGame();
		// changeGameGUI();//���ڻ�ȡ�����㷨����Ľ���
	}
	public void initlizeGameFrame(){
		// frame���ĳ�ʼ��
		frame = new gameFrame();
		frame.setSize(1160, 630);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		ImageIcon titlepicture = new ImageIcon("src/bin/title.jpg");
		frame.setIconImage(titlepicture.getImage());
		frame.setBackground(new Color(0,0,0,0));
		frame.setLocationRelativeTo(null);
		frame.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		frame.setVisible(true);
		frame.setDragable();
	}
	public int[][] getinitlizeGame(){
		//System.out.println("��ʼ��");
		int[][] result=new int[9][9];
		for (int i=0;i<9;i++){
			//System.out.println("");
			for(int j=0;j<9;j++){
				
				result[i][j]=(int) (Math.random()*7+1);
				//System.out.print("    "+result[i][j]);
			}
		}
		return result;
	}
	public void print(int[][] game,int length){
		System.out.println("AAA");
		for(int i=0;i<length;i++){
			System.out.println("");
			for(int j=0;j<length;j++){
				System.out.print(game[i][j]+"  ");
			}
		}
		
	}
	public int[][] getRebuildGame(){
		int[][] result=new int[9][9];
		for (int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				result[i][j]=0;
			}
		}
		return result;
	}

class gameFrame extends JFrame{
	Point loc = null;
    Point tmp = null;
    boolean isDragged = false;
    public void setDragable() {
    frame.addMouseListener(new java.awt.event.MouseAdapter() {
    	public void mouseReleased(java.awt.event.MouseEvent e) {
    		isDragged = false;
    		frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    		}
    	public void mousePressed(java.awt.event.MouseEvent e) {
    		tmp = new Point(e.getX(), e.getY());
    		isDragged = true;
    		frame.setCursor(new Cursor(Cursor.MOVE_CURSOR));
    		}
    	});
    frame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
    	public void mouseDragged(java.awt.event.MouseEvent e) {
    		if(isDragged) {
    			loc = new Point(frame.getLocation().x + e.getX() - tmp.x,
    					frame.getLocation().y + e.getY() - tmp.y);
    			frame.setLocation(loc);
    			}
    		}
    	});
    }
    }
}