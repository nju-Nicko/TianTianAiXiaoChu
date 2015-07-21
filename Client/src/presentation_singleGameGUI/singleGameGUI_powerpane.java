package presentation_singleGameGUI;



import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class singleGameGUI_powerpane extends singleGameGUI {
public void initlizePowerpane(){
	PowerPanel powerpanel = new PowerPanel();
	powerpanel.setBounds(110, 560, 400, 60);
	// powerpanel.setOpaque(false);
	pane.add(powerpanel);
}
class PowerPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics h) {
		String powerName=null;
		switch(doublehitCount){
		case 0:powerName="power1.png";break;
		case 1:powerName="power2.png";break;
		case 2:powerName="power3.png";break;
		case 3:powerName="power4.png";break;
		case 4:powerName="power5.png";break;
		case 5:powerName="power.png";break;
		}
		if(perfectState){
			powerName="power.png";
		}
		h.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		// g.drawString("ÄÜÁ¿¶¯Ì¬Öá", 0, 10);
    
		java.net.URL imgurl = singleGameGUI.class
				.getResource("/bin/"+powerName);
		Image image = new ImageIcon(imgurl).getImage();
		h.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

}
