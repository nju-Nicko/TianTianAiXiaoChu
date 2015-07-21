package presentation.mainui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JToolTip;

//自定义的提示框类
public class MyToolTip extends JToolTip{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyToolTip() {
		super();
		super.setBorder(null);
	}

	public Dimension getPreferredSize() {
		return new Dimension(getTipText().toCharArray().length * 15, 20);
	}

	public void paintComponent(Graphics g) {
		if (this.getTipText() != null) {
			g.setColor(new Color(0, 0, 0));
			g.fillRect(0, 0, getWidth(), getHeight());
			JLabel l = new JLabel(getTipText());
			l.setBounds(3, 0, getWidth(), getHeight() - 2);
			l.setForeground(Color.white);
			l.setFont(new Font("微软雅黑", Font.PLAIN, 14));
			add(l);
		}

  }
}
