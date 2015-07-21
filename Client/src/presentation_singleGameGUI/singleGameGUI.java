package presentation_singleGameGUI;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JToolTip;
import javax.swing.border.Border;
import javax.swing.*;

import presentation_singleGameGUI.singleGameGUI_gamepane.GamePanel;
import presentation_singleGameGUI.singleGameGUI_methon.gameFrame;
import net.Net;

public class singleGameGUI {
	// �Ƿ������ʾ����
	static  JLabel timelabel3 ;
	static JLabel gradelabel;
	static updategui up;
	public static Object pVlock=new Object();
	static Boolean iscanreceived;
	static Boolean isNextDelete;//�Ƿ���ڴ�������������ڴ�����������Ҳ����ƶ�
	static JLayeredPane layeredpane;
	static JPanel pane;
	static JPanel topPane;
	static int dropdirection;
	static private Boolean isHaveRemind;
	// ��ʾ���ߵ�ʹ������
	static int remindx1;
	static int remindy1;
	static int remindx2;
	static int remindy2;
	// ���ѡ������
	protected static int last_x;
	protected static int last_y;
	protected static int now_x;
	protected static int now_y;
	// �ϴ�������ʱ�� ʱ�䶨ʱ���Լ������gameTimer ����ֱ�ӻ�ȡ��ǰʱ����������ֻ��ȷ����
	
	static int doublehitCount;// ��ǰ������
	static Boolean doublehitState;
	static int state;
	// ��굱ǰλ��
	static int mousex;
	static int mousey;
	// �Ƿ�Ϊ����״̬������κ������
	static public Boolean perfectState;
	

	static int emptyFirstLine;
	// private JPanel gamepanel;
	static int time = 65;// 1sΪһ��λ
	static protected int grade;// ����

	static public guiUpdateObject gameRange = new guiUpdateObject();

	 static String ID;
	public static int[][] rebuildGameRange = new int[9][9];
	public static gameFrame frame;
	//������
	//ʱ����
	static JProgressBar timejpb;
	
	//static Timer timeCaulater	static Timer gradetimer;
	
	static singleGameGUI_getMoveThread getMove;

	static singleGameGUI_updateThread updatethread;
	static singleGameGUI_methon sgg;
	public boolean UseTool_C;
	public boolean UseTool_D;
	public boolean UseTool_E;
	static GamePanel gamepanel;//��Ϸpanel
	public  void singlenamestart(String playerid,boolean c,boolean d,boolean e) {
		singleGameGUI singlegame = new singleGameGUI();
		sgg = new singleGameGUI_methon();
		 UseTool_C=c;
		 UseTool_D=d;
		 UseTool_E=e;
		singlegame.initilize(playerid);
		getMove = new singleGameGUI_getMoveThread(singlegame);
		getMove.start();
		up=new updategui(singlegame);
		up.start();
		updatethread = new singleGameGUI_updateThread(singlegame);
		updatethread.start();
	}

	public void initilize(String playerid) {
		sgg.initlizeGameValue(playerid);
		sgg.initlizeGameFrame();
		layeredpane = new JLayeredPane(); // ��Ҫ
		layeredpane.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		layeredpane.setLayout(null);
		frame.add(layeredpane);
		layeredpane.setOpaque(true);
		pane = new JPanel();
		pane.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		//pane.setOpaque(false);
		pane.setLayout(null);
		topPane= new JPanel();
		topPane.setBounds(0, 0, frame.getWidth(), frame.getHeight());
	    topPane.setLayout(null);
		
		layeredpane.add(pane,new Integer(10));
		layeredpane.add(topPane,new Integer(100));
		
		singleGameCUI_waitPane wait = new singleGameCUI_waitPane();
		wait.initlizewaitPane();
		// ���ڲ���������
		singleGameGUI_exitepanel exite = new singleGameGUI_exitepanel();
		exite.initlizeExitepanel();
		// �ɼ���Ϣ��ͷ����Ϣչʾpanel
		singleGameGUI_infopane info = new singleGameGUI_infopane();
		info.initlizeInfopane();
		// ��Ϸ����ĳ�ʼ����gamepanel�Ѿ���װ��
		singleGameGUI_gamepane gamepane = new singleGameGUI_gamepane();
		gamepane.initlizeGamepane();
		// ��Ϸ��ʱ���ĳ�ʼ��
		singleGameGUI_timepane timepane = new singleGameGUI_timepane();
		timepane.initlizeTimepane();
		// ���������ļ�¼�����Ͷ�̬��ʾ��
		singleGameGUI_powerpane powerpane = new singleGameGUI_powerpane();
		powerpane.initlizePowerpane();
		singleGameGUI_gamePerfectpane gamePerfectpane = new singleGameGUI_gamePerfectpane();
		gamePerfectpane.initlizegamePerfectpane();
		//�����Ķ�̬Ч��
				singleGameGUI_aimationpane aimationpane = new singleGameGUI_aimationpane();
				aimationpane.initlizeAimationpane();
				singleGameCUI_gameSurroundpane gameSurroundpane = new singleGameCUI_gameSurroundpane();
				gameSurroundpane.initlizeGameSurroundpane();
				singleGameGUI_backgroundpane backgroundpane = new singleGameGUI_backgroundpane();
				backgroundpane.initlizeBackgroundpane();
		
		// ��̬С�߿�
		JPanel panellabel = new JPanel();
		panellabel.setBounds(520, 550, 70, 80);
		panellabel.setBackground(new Color(70, 70, 70));
		panellabel.add(new JLabel("��̬С�߿�"));
		pane.add(panellabel);

		// ************************************************************************************

	}

}