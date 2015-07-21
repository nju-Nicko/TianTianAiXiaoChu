package presentation_localgame;

import javax.swing.JFrame;

public class resultGUI_update extends Thread{
	resultGUI frame;
	public resultGUI_update(resultGUI frame){
		this.frame=frame;
	}
@Override
public void run(){
	while(true){
		
		
		try {
			frame.frame.repaint();
			frame.frame.validate();
			sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
