package presentation_singleGameGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

public class MyBorder implements Border {
	public void paintBorder(Component c, Graphics g, int x, int y, int w,
			int h) {
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 2, 2);
	}

	public Insets getBorderInsets(Component c) {
		return new Insets(1, 1, 1, 1);
	}

	public boolean isBorderOpaque() {
		return false;
	}
}
