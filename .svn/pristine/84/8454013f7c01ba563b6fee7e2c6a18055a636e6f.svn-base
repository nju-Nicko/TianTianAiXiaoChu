package presentation.mainui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.border.Border;

public class BlueRectBorder implements Border{

	public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
		Graphics2D g2=(Graphics2D)g;
		g2.setColor(Color.blue);
		g2.setStroke(new BasicStroke(6));
		g2.drawRect(0, 0, w - 1, h - 1);
	}

	public Insets getBorderInsets(Component c) {
		return new Insets(1, 1, 1, 1);
	}

	public boolean isBorderOpaque() {
		return true;
	}
}
