package presentation.mainui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BodyPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public BodyPanel(){
		
		setLayout(null);

	/*	final JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(465, 340, 21, 23);
		radioButton.setOpaque(false);
		radioButton.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				radioButton.setSelected(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseReleased(MouseEvent e) {

			}

			public void mouseClicked(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {
				radioButton.setSelected(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			public void mousePressed(MouseEvent e) {

			}
		});
		add(radioButton);

		final JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(488, 340, 21, 23);
		radioButton_1.setOpaque(false);
		radioButton_1.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				radioButton_1.setSelected(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseReleased(MouseEvent e) {

			}

			public void mouseClicked(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {
				radioButton_1.setSelected(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			public void mousePressed(MouseEvent e) {

			}
		});
        add(radioButton_1);

		final JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(511, 340, 21, 23);
		radioButton_2.setOpaque(false);
		radioButton_2.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				radioButton_2.setSelected(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseReleased(MouseEvent e) {

			}

			public void mouseClicked(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {
				radioButton_2.setSelected(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			public void mousePressed(MouseEvent e) {

			}
		});
		add(radioButton_2);

		ButtonGroup group = new ButtonGroup();
		group.add(radioButton);
		group.add(radioButton_1);
		group.add(radioButton_2);
		

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(27, 27, 505, 307);
		add(panel_7);
		panel_7.setLayout(null);
		*/
	}

	public void paintComponent(Graphics g) {
		Image image = new ImageIcon(
				MainFrame.class.getResource("/img/body.jpg")).getImage();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}
