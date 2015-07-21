package presentation.gameui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;







public class collaborationGameGUI_infopane extends collaborationGameGUI {
	static int playerNumber;
	
public void initlizeInfopane(){
	
	//infopanel.setBackground(Color.CYAN);
	
	playerNumber=2;
	
	// infopanelµÄ³õÊ¼»¯
	if(playerNumber==2){
		final Info2Panel infopanel = new Info2Panel();
		infopanel.setLayout(null);
		infopanel.setBounds(90, 25, 450, 70);
		infopanel.setOpaque(false);
		
		ImageIcon fi1=new ImageIcon(collaborationGameGUI_infopane.class.getResource("/bin/playerImg1.png"));
		final JLabel figurePhotoLabel1=new JLabel(fi1);
		figurePhotoLabel1.setBounds(93, 15, 45, 45);
		
		ImageIcon fi2=new ImageIcon(collaborationGameGUI_infopane.class.getResource("/bin/playerImg2.png"));
		 figurePhotoLabel2=new JLabel(fi2);
		figurePhotoLabel2.setBounds(228, 15, 45, 45);

		infopanel.add(figurePhotoLabel1);
        infopanel.add(figurePhotoLabel2);
        pane.add(infopanel);
        
    	 gradelabel=new JLabel("     "+grade);
		gradelabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		gradelabel.setBounds(380, 17, 100, 40);
		infopanel.add(gradelabel);
	  //  gradetimer=new Timer(true);
		//gradetimer.schedule(new TimerTask(){

		//		@Override
		//		public void run() {
					// TODO Auto-generated method stub
			//		gradelabel.setText("   "+grade);
		//			
		//		}
		//		
		//	}, 0,40);
        
       
	    }else if(playerNumber==3){
	    	final Info3Panel info3panel = new Info3Panel();
	    	info3panel.setLayout(null);
	    	info3panel.setBounds(50, 25, 500, 70);
	    	info3panel.setOpaque(false);
	    	
	    	ImageIcon fi1=new ImageIcon(collaborationGameGUI_infopane.class.getResource("/bin/playerImg1.png"));
			final JLabel figurePhotoLabel1=new JLabel(fi1);
			figurePhotoLabel1.setBounds(75, 15, 45, 45);
			
			ImageIcon fi2=new ImageIcon(collaborationGameGUI_infopane.class.getResource("/bin/playerImg2.png"));
			final JLabel figurePhotoLabel2=new JLabel(fi2);
			figurePhotoLabel2.setBounds(190, 15, 45, 45);
			
			ImageIcon fi3=new ImageIcon(collaborationGameGUI_infopane.class.getResource("/bin/playerImg3.png"));
			final JLabel figurePhotoLabel3=new JLabel(fi3);
			figurePhotoLabel3.setBounds(300, 15, 45, 45);

			info3panel.add(figurePhotoLabel1);
	        info3panel.add(figurePhotoLabel2);
	        info3panel.add(figurePhotoLabel3);
	       
	        pane.add(info3panel);
	        
	    	final JLabel gradelabel=new JLabel("     "+grade);
			gradelabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
			gradelabel.setBounds(430, 17, 100, 40);
			info3panel.add(gradelabel);
		 //   gradetimer=new Timer(true);
		//	gradetimer.schedule(new TimerTask(){

				//	@Override
				//	public void run() {
					//	// TODO Auto-generated method stub
					///	gradelabel.setText("   "+grade);
					//	
				///	}
			///		
			//	}, 0,40);
	  }
	

		}


class Info2Panel extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		java.net.URL imgurl = collaborationGameGUI.class.getResource("/bin/infoCop2.png");
		Image image = new ImageIcon(imgurl).getImage();
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class Info3Panel extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		java.net.URL imgurl = collaborationGameGUI.class.getResource("/bin/infoCop3.png");
		Image image = new ImageIcon(imgurl).getImage();
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
}
