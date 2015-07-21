package presentation.gameui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import presentation_localgame.singleGameGUI;


public class collaborationGameGUI_gamePerfectpane extends collaborationGameGUI {
	public void initlizegamePerfectpane(){
		GamePerfectpane gamePerfectpane = new GamePerfectpane();
		gamePerfectpane.setBounds(70, 90, 475, 475);
			// powerpanel.setOpaque(false);
		pane.add(gamePerfectpane);
		
		

	}
	class GamePerfectpane extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics h) {
			String name="unperfect.png";
			if(perfectState){
				name="perfect.jpg";
			}else{
			    name="unperfect.png";
			}
				
			java.net.URL imgurl = singleGameGUI.class
					.getResource("/bin/"+name);
			Image image = new ImageIcon(imgurl).getImage();
			h.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	}