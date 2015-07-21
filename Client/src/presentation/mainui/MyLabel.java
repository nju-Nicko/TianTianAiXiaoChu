package presentation.mainui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JToolTip;

//自定义的标签类
public class MyLabel extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public MyLabel() {
		super();
	}

	public MyLabel(String str) {
		super(str);
		setForeground(new Color(240,206,0));
	}

	public JToolTip createToolTip() {
		JToolTip tip = new MyToolTip();
		return tip;
	}
	
	public void setForeground(Color color){
		super.setForeground(color);
	}

}
