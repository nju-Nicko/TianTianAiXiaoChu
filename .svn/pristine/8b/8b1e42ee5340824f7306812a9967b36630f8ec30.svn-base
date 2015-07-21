package presentation.mainui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToolTip;

import main.Startup;

public class AddFriendButton extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int bg=0;
	
	public AddFriendButton(){
		setOpaque(true);
		setBackground(new Color(0,0,0,0));
		
		addMouseListener(new MouseListener(){

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
				if(Startup.window.mainframe.afp==null){
				if(Startup.window.mainframe.fl!=null){
					 Startup.window.mainframe.panel.remove(Startup.window.mainframe.fl);
					 Startup.window.mainframe.fl=null;
					 Startup.window.mainframe.friend.bg=0;
				}
				if(Startup.window.mainframe.mp!=null){
					 Startup.window.mainframe.panel.remove(Startup.window.mainframe.mp);
					 Startup.window.mainframe.mp=null;
					 Startup.window.mainframe.mb.bg=0;
				}
				bg=1;
				Startup.window.mainframe.afp=new AddFriendPanel();
				Startup.window.mainframe.panel.add(Startup.window.mainframe.afp,new Integer(1));
				Startup.window.mainframe.afp.setLocation(648,110);
				 Startup.window.mainframe.panel.repaint();
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				Startup.window.mainframe.panel.repaint(); 
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				Startup.window.mainframe.panel.repaint(); 
			}
			
		});
	}
	
	public JToolTip createToolTip(){
		return new MyToolTip();
	}
	
	public void paintComponent(Graphics g){
		if(bg==1){
			g.setColor(new Color(0,0,0));
			g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 8, 8);
		}
		else if(bg==0){
			g.setColor(new Color(0,0,0,0));
			g.fillRect(0, 0, getWidth(), getHeight());
		}
		Image i=new ImageIcon(MainFrame.class.getResource("/img/addFriend.png")).getImage();
		g.drawImage(i,3,3,this);
	}
	
}
