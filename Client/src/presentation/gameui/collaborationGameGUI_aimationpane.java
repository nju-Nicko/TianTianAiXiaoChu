package presentation.gameui;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class collaborationGameGUI_aimationpane extends collaborationGameGUI {
public void initlizeAimationpane(){
	AimationPane aimationPane1=new AimationPane();
	aimationPane1.setBounds(600, 20, 318, 158);
	AimationPane aimationPane2=new AimationPane();
	aimationPane2.setBounds(800, 168, 318, 158);
	AimationPane aimationPane3=new AimationPane();
	aimationPane3.setBounds(700, 300, 318, 158);
	AimationPane aimationPane4=new AimationPane();
	aimationPane4.setBounds(600, 440, 318, 158);
	AimationPane aimationPane5=new AimationPane();
	aimationPane5.setBounds(482, 168, 318, 158);
	pane.add(aimationPane1);
	pane.add(aimationPane2);
	pane.add(aimationPane3);
	pane.add(aimationPane4);
	pane.add(aimationPane5);

	
	}
class AimationPane extends JPanel{
		private static final long serialVersionUID = 1L;

		@Override
		public void paint(Graphics g) {
		//	java.net.URL imgurl1 = collaborationGameGUI.class.getResource("/bin/failflower.gif");
		//	Image image1 = new ImageIcon(imgurl1).getImage();
		//	g.drawImage(image1, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

}
