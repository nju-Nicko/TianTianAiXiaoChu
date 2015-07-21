package presentation.loginui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Album {

	private JFrame frame;
	private AlbumPanel panel;
	private Image[] images;
	private int i=0,j=0;
	private int counter=0;
	private String[] names;
	private Repaint thread;
	private boolean finished=true;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Album() {
		initialize();
		thread=new Repaint();
		thread.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("关于");
		frame.setForeground(new Color(0, 0, 0));
		frame.setBounds(400, 200, 316, 338);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		images=new Image[6];
		for(int i=0;i<=5;i++){
			images[i]=new ImageIcon(Album.class.getResource("/img/img"+i+".jpg")).getImage();
		}
		
		names=new String[6];
		names[0]="马  超";
		names[1]="李隆隆";
		names[2]="倪陆章";
		names[3]="任羡纲";
		names[4]="李明伟";
		names[5]="陆  生";
		
		panel = new AlbumPanel();
		panel.setBounds(0, 0, 300, 300);
		frame.getContentPane().add(panel);	
	}
	
	public class AlbumPanel extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * 
		 */

		    synchronized public void paintComponent(Graphics g){
		    finished=false;
			GradientPaint gradient=new GradientPaint(150,280,Color.white,150,70,new Color(20,20,20));
			Graphics2D g2=(Graphics2D)g;
			g2.setPaint(gradient);
			g2.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.white);
			g.setFont(new Font("宋体",Font.PLAIN,13));
			g.drawString("天天爱消除",10,30);
			g.drawString("nju.se.Team Tiantian",15,50);
			if(j<=60){
			g2.drawImage(images[i], 90-j*1,110+j*1,120-j*1,120-j*1,this);
             if(i!=5){
			g2.drawImage(images[i+1],270-j,170,j,60,this);
            }
            else if(i==5){
            g2.drawImage(images[0],270-j,170,j,60,this);
            }
					}
			
			else{
			 g2.drawImage(images[i],30,170,120-j,60,this);
			  if(i!=5){
			  g2.drawImage(images[i+1],330-2*j,230-j,j,j,this);
				     }
			  else{
			 g2.drawImage(images[0],330-2*j,230-j,j,j,this);
			  }
	           if(j==120){
				   j=-1;
				   i++;
				   if(i==6)
					   i=0;
				   g.setColor(Color.black);
				   g.setFont(new Font(null,Font.PLAIN,15));
				   g.drawString(names[i], 125, 255);
			   }
			}		
		    j++;
           counter++;
           
           if(counter==1){
        	   g.setColor(Color.black);
			   g.setFont(new Font(null,Font.PLAIN,15));
			   g.drawString(names[0], 125, 255);
			   
			   synchronized(thread){
				   thread.notify();
			   }
           }
           finished=true;
		}
				}	

	
	public class Repaint extends Thread{
		public synchronized void run(){
           if(counter==0){
        	   try{
        		   this.wait();
        	   }catch(Exception e){
        		   e.printStackTrace();
        	   }
           }
			while(true){
		    	if(finished){
				if(j==0){
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
			}
			if(counter==1){
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			panel.repaint();
			try{
				Thread.sleep(10);
			}catch(Exception e){
				e.printStackTrace();
			}
		
			if(!frame.isVisible()){
				break;
			}
			}
			}
		}
	}
}
