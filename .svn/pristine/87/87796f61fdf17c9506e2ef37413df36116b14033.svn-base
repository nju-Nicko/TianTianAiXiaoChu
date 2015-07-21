package presentation_localgame;

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
import javax.swing.*;

import main.Startup;
import presentation_localgame.singleGameGUI_gamepane.GamePanel;
import presentation_localgame.singleGameGUI_methon.gameFrame;

public class singleGameGUI {
	// 是否存在提示道具
	static JLayeredPane layeredpane;
	protected static JPanel pane;
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
	static int lastDoubleHitTime;// 上次连击时间
	static int lastTwoHitTime;// 倒数第二次连击时间
	static int doublehitCount;// 当前连击数
	static Boolean doublehitState;
	static int state;
	// 鼠标当前位置
	static int mousex;
	static int mousey;
	// 是否为完美状态连击五次后产生的
	static public Boolean perfectState;
	static public int perfectStateStartTime;
	public static Bl_Server blserver;
	static int emptyFirstLine;
	// private JPanel gamepanel;
	static int time;// 1s为一单位
	static protected int grade;// 分数

	static public guiUpdateObject gameRange = new guiUpdateObject();

	private String ID;
	public static GamePanel gamepanel;
	public static int[][] rebuildGameRange = new int[9][9];
	public static gameFrame frame;
	static JProgressBar timejpb;
	static gameTimer timerObject;
	//static Timer timeCaulater;
	//static Timer gradetimer;
	static JLabel timelabel3 ;
	static  JLabel gradelabel;
	static singleGameGUI_remindThread remindthread;
	static singleGameGUI_getMoveThread getMove;

	static singleGameGUI_updateThread updatethread;
	static singleGameGUI_methon sgg;

	public void initilize() {
		time=60;
		sgg = new singleGameGUI_methon();
		sgg.initlizeGameValue();
		sgg.initlizeGameFrame();
		layeredpane = new JLayeredPane(); // 重要
		layeredpane.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		// layeredpane.setLayout(null);
		frame.add(layeredpane);
		// layeredpane.setOpaque(false);
		pane = new JPanel();
		pane.setLayout(null);
		pane.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		// pane.setOpaque(false);
		pane.setLayout(null);

		layeredpane.add(pane, new Integer(10));
		// 窗口操作的添加
		singleGameGUI_exitepanel exite = new singleGameGUI_exitepanel();
		exite.initlizeExitepanel();
		// 成绩信息，头像信息展示panel
		singleGameGUI_infopane info = new singleGameGUI_infopane();
		info.initlizeInfopane();
		// 游戏界面的初始化，gamepanel已经封装好
		singleGameGUI_gamepane gamepane = new singleGameGUI_gamepane();
		gamepane.initlizeGamepane();
		// 游戏计时器的初始化
		singleGameGUI_timepane timepane = new singleGameGUI_timepane();
		timepane.initlizeTimepane();
		// 连击次数的记录器，和动态显示器
		singleGameGUI_powerpane powerpane = new singleGameGUI_powerpane();
		powerpane.initlizePowerpane();
		//
		 singleGameGUI_gamePerfectpane gamePerfectpane = new singleGameGUI_gamePerfectpane();
		gamePerfectpane.initlizegamePerfectpane();
		// 背景的动态效果
		singleGameGUI_aimationpane aimationpane = new singleGameGUI_aimationpane();
		aimationpane.initlizeAimationpane();
		// 游戏背景
		singleGameCUI_gameSurroundpane gameSurroundpane = new singleGameCUI_gameSurroundpane();
		gameSurroundpane.initlizeGameSurroundpane();
		// 边框的初始化
		singleGameGUI_backgroundpane backgroundpane = new singleGameGUI_backgroundpane();
		backgroundpane.initlizeBackgroundpane();
		// 动态小边框
		JPanel panellabel = new JPanel();
		panellabel.setBounds(520, 550, 70, 80);
		panellabel.setBackground(new Color(70, 70, 70));
		panellabel.add(new JLabel("动态小边框"));
		pane.add(panellabel);

		// ************************************************************************************
		getMove = new singleGameGUI_getMoveThread(Startup.window.ext.s);
		getMove.start();
		remindthread = new singleGameGUI_remindThread(Startup.window.ext.s);
		remindthread.start(); // 如果不存在提示道具则不启动线程
		updatethread = new singleGameGUI_updateThread(Startup.window.ext.s);
		updatethread.start();
	}

}
