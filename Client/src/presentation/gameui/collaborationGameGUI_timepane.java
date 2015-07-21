package presentation.gameui;
/*
 * *
 * 添加了gradetimer  程序
 */
import gamemessage.ChangePositionMessage;
import gamemessage.CloseNetMessage;
import gamemessage.CorpGameOverMessage;
import gamemessage.GameStateMessage;
import gamemessage.Game_infoMessage;
import gamemessage.ReNetMessage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import net.Net;
import presentation.gameresultui.resultGUI;
import main.Startup;



public class collaborationGameGUI_timepane extends collaborationGameGUI {
	static boolean ggg=false;
	public void initlizeTimepane() {
		// timepanel的初始化
		final TimePanel timepanel = new TimePanel();
		timepanel.setBounds(515, 95, 70, 445);
		timepanel.setOpaque(true);
		// timepanel.setBackground(Color.orange);
		pane.add(timepanel);
		timejpb = new JProgressBar();
		timejpb.setStringPainted(true);
		timejpb.setBackground(Color.yellow);
		timejpb.setForeground(Color.pink);
		timejpb.setPreferredSize(new Dimension(20, 370));
		timejpb.setOrientation(JProgressBar.VERTICAL);
		
		//timejpb.paint(g);
		final JLabel timelabel1 = new JLabel("   " );
		timelabel1.setPreferredSize(new Dimension(50, 40));
		timepanel.add(timelabel1);
		timelabel3 = new JLabel("   " +time);
		timelabel3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		timelabel3.setPreferredSize(new Dimension(50, 15));
		timepanel.add(timelabel3);
		timepanel.add(timejpb);

		timejpb.setMaximum(60);
		 //计时器的启动必须等待通信的建立完成，并且使双方的时间保持一致
		doublehitCount = 0; // 同时连击数目初始化
		
		
		doublehitState = false;
		
		// System.out.println("DDD");
	
		
		
	}

	class TimePanel extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g) {
			// super.paint(g);
			// g.drawString("时间轴", 0, 10);
			java.net.URL imgurl = collaborationGameGUI.class
					.getResource("/bin/timePane.png");
			Image image = new ImageIcon(imgurl).getImage();
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);

		}
	}
}
