package presentation_singleGameGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JToolTip;
import javax.swing.border.Border;

class MyToolTip extends JToolTip {

	/**
 * 
 */
	private static final long serialVersionUID = 1L;

	public MyToolTip() {
		super();
	}

	public void paintComponent(Graphics g) {
		g.setColor(new Color(255, 255, 255, 240));
		g.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 10, 10);
		g.setColor(Color.black);
		g.drawString(getTipText(), 4, 13);
	}
	
}

