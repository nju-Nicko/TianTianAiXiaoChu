package presentation_singleGameGUI;

import gamemessage.CloseNetMessage;
import gamemessage.ReNetMessage;
import gamemessage.SingleGameOverMessage;

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
import presentation.mainui.MainFrame;
import main.Startup;

public class singleGameGUI_timepane extends singleGameGUI {

	public void initlizeTimepane() {
		// timepanel的初始化
		/*final TimePanel timepanel = new TimePanel();
		timepanel.setBounds(520, 35, 70, 515);
		timepanel.setOpaque(false);
		// timepanel.setBackground(Color.orange);
		pane.add(timepanel);
		timejpb = new JProgressBar();
		timejpb.setStringPainted(true);
		timejpb.setBackground(new Color(55, 58, 77));
		timejpb.setPreferredSize(new Dimension(35, 300));
		timejpb.setOrientation(JProgressBar.VERTICAL);
		JLabel timelabel1 = new JLabel(" ");
		timelabel1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		timelabel1.setPreferredSize(new Dimension(50, 30));
		timepanel.add(timelabel1);
		JLabel timelabel2 = new JLabel("  游戏");
		timelabel2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		timelabel2.setPreferredSize(new Dimension(50, 30));
		timepanel.add(timelabel2);
		JLabel timelabel = new JLabel("  时间");
		timelabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		timelabel.setPreferredSize(new Dimension(50, 30));
		timepanel.add(timelabel);
		final JLabel timelabel3 = new JLabel("   " + time);
		timelabel3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		timelabel3.setPreferredSize(new Dimension(50, 20));
		timepanel.add(timelabel3);
		timepanel.add(timejpb);*/
		// timepanel的初始化
				final TimePanel timepanel = new TimePanel();
				timepanel.setBounds(530, 90, 70, 445);
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
				timelabel3 = new JLabel("   " );
				timelabel3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				timelabel3.setPreferredSize(new Dimension(50, 15));
				timepanel.add(timelabel3);
				timepanel.add(timejpb);

		

		timejpb.setMaximum(60);
		
		doublehitCount = 0; // 同时连击数目初始化
	
		
		//timeCaulater = new Timer(true);
		doublehitState = false;
		// System.out.println("DDD");
		
	
	}

	class TimePanel extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g) {
			// super.paint(g);
			// g.drawString("时间轴", 0, 10);
			java.net.URL imgurl = singleGameGUI.class
					.getResource("/bin/timePane.png");
			Image image = new ImageIcon(imgurl).getImage();
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);

		}
	}
	
}
