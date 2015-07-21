package presentation.mainui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

public class ButtonLabel extends JLabel{
      String text;
      public boolean selected=false;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ButtonLabel(String text){
		super(text);
		this.text=text;
	}
	
	public void paintComponent(Graphics g){
		removeAll();
		if(!selected){
		g.setColor(new Color(19,34,53));
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
		JLabel l=new JLabel(text);
		l.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,14));
		l.setForeground(Color.white);
		l.setBounds(40,0,getWidth(),getHeight());
		add(l);
		}
		else{
			g.setColor(new Color(7,20,36));
			g.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
			JLabel l=new JLabel(text);
			l.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,14));
			l.setForeground(Color.white);
			l.setBounds(40,0,getWidth(),getHeight());
			add(l);
		}
		g.setColor(new Color(58,69,87));
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 5,5);
	}
	
}