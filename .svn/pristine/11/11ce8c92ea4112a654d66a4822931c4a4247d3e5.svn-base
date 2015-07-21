package presentation_localgame;

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
import javax.swing.JPanel;



public class singleGameGUI_infopane extends singleGameGUI {
public void initlizeInfopane(){
	final InfoPanel infopanel = new InfoPanel();
	infopanel.setBounds(140, 25, 450, 70);
	infopanel.setOpaque(false);
	infopanel.setBackground(Color.CYAN);
	pane.add(infopanel);
	// infopanelµÄ³õÊ¼»¯
	        infopanel.setLayout(null);
			ImageIcon fi=new ImageIcon("src/bin/playerImg1.jpg");
			final JLabel figurePhotoLabel=new JLabel(fi);
			figurePhotoLabel.setBounds(120, 20, 40, 40);
			infopanel.add(figurePhotoLabel);
	      gradelabel=new JLabel(" "+grade);
			gradelabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
			gradelabel.setBounds(330, 25, 100, 40);
			infopanel.add(gradelabel);
		// gradetimer=new Timer(true);
		//	gradetimer.schedule(new TimerTask(){

			//	@Override
			//	public void run() {
					// TODO Auto-generated method stub
				//	gradelabel.setText("   "+grade);
					
				//}
				
			//}, 0,40);
		}


class InfoPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		java.net.URL imgurl = singleGameGUI.class.getResource("/bin/info.png");
		Image image = new ImageIcon(imgurl).getImage();
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
}
