package presentation_localgame;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class singleGameGUI_backgroundpane extends singleGameGUI {
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
		//g.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		//g.setColor(new Color(55, 58, 77));
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
		java.net.URL imgurl = singleGameGUI.class.getResource("/bin/background.jpg");
		Image image = new ImageIcon(imgurl).getImage();
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);

	}
	
}

}
