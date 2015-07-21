package presentation_localgame;

import javax.swing.JLabel;
import javax.swing.JToolTip;



class MyLabel extends JLabel {

	private static final long serialVersionUID = 1L;

		public MyLabel() {
			super();
		}

		public MyLabel(String str) {
			super(str);
		}

		public JToolTip createToolTip() {
			JToolTip tip = new MyToolTip();
			tip.setBorder(new MyBorder());
			return tip;
		}
	}
