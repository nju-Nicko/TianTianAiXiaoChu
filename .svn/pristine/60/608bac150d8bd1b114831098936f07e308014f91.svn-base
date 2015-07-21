package presentation.mainui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

public class WhiteRoundRectBorder implements Border{
	
	public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
		g.setColor(Color.white);
		g.drawRoundRect(0, 0, w - 1, h - 1,5,5);
	}

	public Insets getBorderInsets(Component c) {
		return new Insets(1, 1, 1, 1);
	}

	public boolean isBorderOpaque() {
		return true;
	}

}
