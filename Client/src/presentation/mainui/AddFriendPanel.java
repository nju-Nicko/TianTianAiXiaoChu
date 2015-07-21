package presentation.mainui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Startup;
import message.RequestFriendBackMessage;
import message.RequestFriendMessage;

import presentation.loginui.LoginUI;
import presentation.loginui.MyTextField;

public class AddFriendPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddFriendPanel() {
		setOpaque(false);
		setSize(200, 400);
		setLayout(null);

		JLabel l = new MyLabel("好友ID:");
		l.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		l.setBounds(10, 38, 50, 20);
		add(l);

		final JTextField text = new MyTextField();
		text.setBounds(60, 35, 132, 28);
		text.setOpaque(false);
		add(text);

		final JLabel add = new MyLabel("添加");
		add.setForeground(Color.white);
		add.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		add.setBounds(80, 66, 50, 20);
		add.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				if (text.getText().equals(Startup.window.uif.name)) {
					JOptionPane.showMessageDialog(
							null,
							"您不能添加自己为好友",
							"",
							JOptionPane.ERROR_MESSAGE,
							new ImageIcon(LoginUI.class
									.getResource("/img/error.png")));
				} else if (text.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(
							null,
							"请填写对方用户名称",
							"",
							JOptionPane.ERROR_MESSAGE,
							new ImageIcon(LoginUI.class
									.getResource("/img/error.png")));
				} else {

					Startup.net.sendMessage(new RequestFriendMessage(
							Startup.window.uif.name, text.getText()));
					RequestFriendBackMessage rfb = (RequestFriendBackMessage) Startup.net
							.getMessage(-30001);
					while (rfb == null)
						rfb = (RequestFriendBackMessage) Startup.net
								.getMessage(-30001);
					if (rfb.ok) {
						JOptionPane.showMessageDialog(null, "请求已发送");
					} else {
						JOptionPane.showMessageDialog(
								null,
								"好友已经存在",
								"",
								JOptionPane.ERROR_MESSAGE,
								new ImageIcon(LoginUI.class
										.getResource("/img/error.png")));
					}
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				add.setForeground(new Color(36, 85, 141));
				Startup.window.mainframe.panel.repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				add.setForeground(Color.white);
				Startup.window.mainframe.panel.repaint();
			}

		});
		add(add);

		JLabel mini = new JLabel("-");
		mini.setBounds(170, 0, 22, 22);
		mini.setForeground(new Color(189, 180, 123));
		mini.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		mini.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseReleased(MouseEvent e) {
				Startup.window.mainframe.panel
						.remove(Startup.window.mainframe.afp);
				Startup.window.mainframe.afp = null;
				Startup.window.mainframe.afb.bg = 0;
				Startup.window.mainframe.panel.repaint();
			}

			public void mouseClicked(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			public void mousePressed(MouseEvent e) {

			}
		});
		add(mini);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(0, 0, 0));
		g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);

		g2.setStroke(new BasicStroke(1)); // 设置笔触宽度
		g2.setColor(new Color(84, 116, 157));
		g2.drawRoundRect(4, 4, getWidth() - 9, getHeight() - 9, 10, 10);
	}

}
