package presentation.gameui;

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
import java.io.IOException;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JToolTip;
import javax.swing.border.Border;
import javax.swing.*;

import net.Net;
import presentation.gameui.collaborationGameGUI_gamepane.GamePanel;
import presentation.gameui.collaborationGameGUI_methon.gameFrame;
import presentation_singleGameGUI.singleGameCUI_waitPane;

public class collaborationGameGUI {
	// 是否存在提示道具
	static JLabel figurePhotoLabel2;
	static boolean playerExit;
	static  JLabel timelabel3 ;
	static JLabel gradelabel;
	static updategui up;
	public static boolean iscansendstate;
	public static boolean isStateReceibe;
	public static int sendnumber;
	public static int receivenumber;
	public static Object pVlock=new Object();
	static Boolean iscanreceived;
	public static String playerIdentify;
	static Boolean isNextDelete;//是否可在此消除，如果可在此消除，则玩家不可移动
	static JLayeredPane layeredpane;
	static JPanel pane;
	static JPanel topPane;
	static int dropdirection;
	static private Boolean isHaveRemind;
	// 提示道具的使用坐标
	static int remindx1;
	static int remindy1;
	static int remindx2;
	static int remindy2;
	// 鼠标选中坐标
	protected static int last_x;
	protected static int last_y;
	protected static int now_x;
	protected static int now_y;
	// 上次连击的时间 时间定时器自己定义的gameTimer 由于直接获取当前时间慢，而且只精确到秒
	
	static int doublehitCount;// 当前连击数
	static Boolean doublehitState;
	static int state;
	// 鼠标当前位置
	static int mousex;
	static int mousey;
	// 是否为完美状态连击五次后产生的
	static public Boolean perfectState;
	
	
	// private JPanel gamepanel;
	static int time = 65;// 1s为一单位
	static protected int grade=0;// 分数

	static public guiUpdateObject gameRange = new guiUpdateObject();

	static String ID;
	public static int[][] rebuildGameRange = new int[9][9];
	public static gameFrame frame;
	static JProgressBar timejpb;
	
//	static Timer timeCaulater;
//	static Timer gradetimer;
	static collaborationGameGUI_remindThread remindthread;
	

	static collaborationGameGUI_updateThread updatethread;
	static collaborationGameGUI_methon sgg;
	static GamePanel gamepanel;
	
	public boolean UseTool_C;
	public boolean UseTool_D;
	public boolean UseTool_E;
	
	public static void colgamemain(String playerID,String playerIdf,Boolean c,Boolean d,Boolean e) throws IOException {
		System.out.println("-sd--------------------------------------");
		 collaborationGameGUI singlegame = new collaborationGameGUI();
		 singlegame.ID=playerID;
		  singlegame.playerIdentify=playerIdf;
		  singlegame.UseTool_E=e;
		  singlegame.UseTool_D=d;
		  singlegame.UseTool_C=c;
			System.out.println("-sd--------------------------------------<<<<");
		sgg = new collaborationGameGUI_methon();
		singlegame.initilize();
		up=new updategui(singlegame);
		up.start();
		updatethread = new collaborationGameGUI_updateThread(singlegame);
		updatethread.start();
		remindthread = new collaborationGameGUI_remindThread(singlegame);
		remindthread.start(); // 如果不存在提示道具则不启动线程
		
	}

	public void initilize() throws IOException {
		sgg.initlizeGameValue();
		sgg.initlizeGameFrame();
		layeredpane = new JLayeredPane(); // 重要
		layeredpane.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		layeredpane.setLayout(null);
		frame.add(layeredpane);
		// layeredpane.setOpaque(false);
		pane = new JPanel();
		pane.setBounds(0, 0, 1160, 630);
		pane.setOpaque(false);
		pane.setLayout(null);
		
		pane.setLayout(null);
		topPane= new JPanel();
		topPane.setBounds(0, 0, frame.getWidth(), frame.getHeight());
	    topPane.setLayout(null);
		
		layeredpane.add(pane,new Integer(10));
		layeredpane.add(topPane,new Integer(100));
		
		
		collaborationGameCUI_waitPane wait = new collaborationGameCUI_waitPane();
		wait.initlizewaitPane();
		// 窗口操作的添加
		collaborationGameGUI_exitepanel exite = new collaborationGameGUI_exitepanel();
		exite.initlizeExitepanel();
		// 成绩信息，头像信息展示panel
		collaborationGameGUI_infopane info = new collaborationGameGUI_infopane();
		info.initlizeInfopane();
		// 游戏界面的初始化，gamepanel已经封装好
		collaborationGameGUI_gamepane gamepane = new collaborationGameGUI_gamepane();
		gamepane.initlizeGamepane();
		// 游戏计时器的初始化
		collaborationGameGUI_timepane timepane = new collaborationGameGUI_timepane();
		timepane.initlizeTimepane();
		// 连击次数的记录器，和动态显示器
		collaborationGameGUI_powerpane powerpane = new collaborationGameGUI_powerpane();
		powerpane.initlizePowerpane();
		// 
		collaborationGameGUI_aimationpane aimationpane = new collaborationGameGUI_aimationpane();
		aimationpane.initlizeAimationpane();
		
		collaborationGameGUI_gamePerfectpane gamePerfectpane = new collaborationGameGUI_gamePerfectpane();
		gamePerfectpane.initlizegamePerfectpane();
		
		collaborationGameGUI_backgroundpane backgroundpane = new collaborationGameGUI_backgroundpane();
		backgroundpane.initlizeBackgroundpane();
		// 动态小边框
		JPanel panellabel = new JPanel();
		panellabel.setBounds(520, 550, 70, 80);
		panellabel.setBackground(new Color(70, 70, 70));
		panellabel.add(new JLabel("动态小边框"));
		pane.add(panellabel);

		// ************************************************************************************

	}

}
