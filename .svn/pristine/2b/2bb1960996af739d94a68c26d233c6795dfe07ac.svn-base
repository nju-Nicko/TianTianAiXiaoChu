package presentation.mainui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PKToolPanel {
	
	private JPanel pkToolPanel = new JPanel();
	private chooseLabel tool1 = new chooseLabel("加强连击");
	private chooseLabel tool2 = new chooseLabel("得分UP");
	private chooseLabel tool3 = new chooseLabel("加强消除提示");
	
	public JPanel pkToolPanel() throws FontFormatException, IOException{
		
		pkToolPanel.setLayout(null);
		pkToolPanel.setBounds(0, 0, 847, 381);
		//pkToolPanel.setBackground(new Color(0,0,0,100));
		pkToolPanel.setBackground(new Color(86,205,250));
		//573598.jpg
		Image image = new ImageIcon(PKToolPanel.class.getResource("/bin/573598.jpg")).getImage();
		JLabel l = new aLabel(image, 847, 381);
		l.setBounds(0, 0, 847, 381);
		
		JLabel helpLabel = new JLabel("请选择道具：");
		helpLabel.setBounds(150, 50, 200, 40);
		helpLabel.setFont(new Font("文鼎CS舒同体",Font.PLAIN,20));
		helpLabel.setForeground(Color.red);
		pkToolPanel.add(helpLabel);
		
		tool1.setBounds(200, 150, 120, 40);
		tool1.setFont(new Font("文鼎CS舒同体",Font.PLAIN,20));
		pkToolPanel.add(tool1);
		Image image1 = new ImageIcon(PKToolPanel.class.getResource("/bin/prop2.png")).getImage();
		JLabel l1 = new aLabel(image1, 40, 40);
		l1.setBounds(160, 150, 40, 40);
		pkToolPanel.add(l1);
		
		tool2.setBounds(400, 150, 120, 40);
		tool2.setFont(new Font("文鼎CS舒同体",Font.PLAIN,20));
		pkToolPanel.add(tool2);
		Image image2 = new ImageIcon(PKToolPanel.class.getResource("/bin/prop3.png")).getImage();
		JLabel l2 = new aLabel(image2, 40, 40);
		l2.setBounds(360, 150, 40, 40);
		pkToolPanel.add(l2);
		
		tool3.setBounds(600, 150, 120, 40);
		tool3.setFont(new Font("文鼎CS舒同体",Font.PLAIN,20));
		pkToolPanel.add(tool3);
		Image image3 = new ImageIcon(PKToolPanel.class.getResource("/bin/prop1.png")).getImage();
		JLabel l3 = new aLabel(image3, 40, 40);
		l3.setBounds(560, 150, 40, 40);
		pkToolPanel.add(l3);
		
		JLabel button = new JLabel("准备完成");
		button.setBounds(350, 300, 147, 40);
		button.setFont(new Font("文鼎CS舒同体",Font.PLAIN,20));
		button.setHorizontalAlignment(SwingConstants.CENTER);
		pkToolPanel.add(button);
		
		tool1.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tool1.changeChooseState();
				pkToolPanel.remove(tool1);
				if(tool1.getChooseState() == true){
					tool1.setForeground(new Color(250,234,31));
				} else{
					tool1.setForeground(Color.black);
				}
				pkToolPanel.add(tool1);
				pkToolPanel.repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		tool2.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tool2.changeChooseState();
				pkToolPanel.remove(tool2);
				if(tool2.getChooseState() == true){
					tool2.setForeground(new Color(250,234,31));
				} else{
					tool2.setForeground(Color.black);
				}
				pkToolPanel.add(tool2);
				pkToolPanel.repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		tool3.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tool3.changeChooseState();
				pkToolPanel.remove(tool3);
				if(tool3.getChooseState() == true){
					tool3.setForeground(new Color(250,234,31));
				} else{
					tool3.setForeground(Color.black);
				}
				pkToolPanel.add(tool3);
				pkToolPanel.repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		
		button.addMouseListener(new MouseListener(){

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
			//	SendPKInvitationToolBackMessage = new SendPKInvitationToolBackMessage("","",tool1.chooseState,tool2.chooseState,tool3.chooseState);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				pkToolPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});

		pkToolPanel.add(l);
		return pkToolPanel;
	}

	private class chooseLabel extends JLabel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public boolean chooseState = false;
		public String name;

		public chooseLabel(String name) {
			this.name = name;
			setText(name);
		}

		public boolean getChooseState() {
			return chooseState;
		}

		public void changeChooseState() {
			if (chooseState == false) {
				chooseState = true;
			} else {
				chooseState = false;
			}
		}

	}
	
	private class aLabel extends JLabel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Image image;
		private int x;
		private int y;

		public aLabel(final Image image, int x, int y) {
			this.image = image;
			this.x = x;
			this.y = y;
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(image, 0, 0, x, y, null);
		}
	}

}
