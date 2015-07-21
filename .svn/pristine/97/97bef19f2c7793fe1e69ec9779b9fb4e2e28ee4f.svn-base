package presentation.gameui;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class collaborationGameGUI_backgroundpane extends collaborationGameGUI {
public void initlizeBackgroundpane(){
	BackgroundPane backgroundPane = new BackgroundPane();
	backgroundPane.setBounds(0, 30, 1160, 600);
	
	//backgroundPanel.setOpaque(false);
	
	pane.add(backgroundPane);

}
class BackgroundPane extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		java.net.URL imgurl = collaborationGameGUI.class.getResource("/bin/cpGameBackground.jpg");
		Image image = new ImageIcon(imgurl).getImage();
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);

	}
	
}

}
