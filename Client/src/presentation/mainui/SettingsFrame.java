package presentation.mainui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import main.Startup;

public class SettingsFrame {

	private JFrame frame;
	JCheckBox chckbxNewCheckBox;
	JRadioButton rb1, rb2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public SettingsFrame() {
		initialize();
		load_settings();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0, 0, 0, 0));

		JPanel panel = new MyPanel();
		panel.setBounds(0, 0, 360, 209);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		rb1 = new JRadioButton("横向消除");
		rb1.setOpaque(false);
		rb1.setBounds(166, 56, 103, 23);
		rb1.setForeground(Color.white);

		rb2 = new JRadioButton("竖向消除");
		rb2.setOpaque(false);
		rb2.setBounds(270, 56, 103, 23);
		rb2.setForeground(Color.white);
		rb2.setSelected(true);

		panel.add(rb1);
		panel.add(rb2);

		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);

		JLabel lblNewLabel = new MyLabel("消除方向");
		lblNewLabel.setBounds(34, 56, 54, 15);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new MyLabel("声音");
		lblNewLabel_1.setBounds(34, 110, 54, 15);
		panel.add(lblNewLabel_1);

		chckbxNewCheckBox = new JCheckBox("开闭声音");
		chckbxNewCheckBox.setBounds(166, 106, 103, 23);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setForeground(Color.white);
		panel.add(chckbxNewCheckBox);

		final JButton btnNewButton = new JButton("保存设置");
		btnNewButton.setBounds(133, 156, 93, 23);
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setForeground(Color.white);
		btnNewButton.addMouseListener(new MouseListener() {

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
				File file = new File(Startup.window.uif.name + "_settings.dat");
				if (file.exists()) {
					try {
						FileWriter fw = new FileWriter(file);
						String settings = "";
						if (rb1.isSelected()) {
							settings = "横向消除 ";
						} else {
							settings = "竖向消除 ";
						}
						if (chckbxNewCheckBox.isSelected()) {
							settings = settings + "true";
						} else
							settings = settings + "false";
						fw.write(settings);
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Startup.window.mainframe
							.load_settings(Startup.window.uif.name);
				} else {
					try {
						file.createNewFile();
						FileWriter fw = new FileWriter(file);
						String settings = "";
						if (rb1.isSelected()) {
							settings = "横向消除 ";
						} else {
							settings = "竖向消除 ";
						}
						if (chckbxNewCheckBox.isSelected()) {
							settings = settings + "true";
						} else
							settings = settings + "false";
						fw.write(settings);
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				frame.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnNewButton.setForeground(new Color(36, 85, 141));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btnNewButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnNewButton.setForeground(Color.white);
			}

		});
		panel.add(btnNewButton);

		frame.setLocationRelativeTo(null);
		panel.repaint();
		frame.setVisible(true);
	}
	
	public void load_settings(){
		File file = new File(Startup.window.uif.name + "_settings.dat");
		if(file.exists()){
			FileReader fr;
			try {
				fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String s = br.readLine();
				String[] split = s.split(" ");
				switch (split[0]) {
				case "横向消除":
					rb1.setSelected(true);
					break;
				case "竖向消除":
					rb2.setSelected(true);
					break;
				}
				switch (split[1]) {
				case "true":
					chckbxNewCheckBox.setSelected(true);
					break;
				case "false":
					chckbxNewCheckBox.setSelected(false);
					break;
				}
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public class MyPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {
			g.setColor(new Color(25, 29, 118));
			g.fillRect(0, 0, getWidth(), getHeight());
		}

	}
}
