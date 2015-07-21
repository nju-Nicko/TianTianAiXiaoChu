package presentation_singleGameGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class singleGameCUI_gameSurroundpane extends singleGameGUI{
	public void initlizeGameSurroundpane(){
		 final GameSurroundpane gameSurroundpane=new GameSurroundpane();
		gameSurroundpane.setBounds(0, 25, 670, 600);
		gameSurroundpane.setOpaque(false);
	    pane.add(gameSurroundpane);
	    
	}
	class GameSurroundpane extends JPanel{
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics g) {
				java.net.URL imgurl1 = singleGameGUI.class.getResource("/bin/gameSurround.png");
				Image image1 = new ImageIcon(imgurl1).getImage();
				g.drawImage(image1, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		}
	
}
