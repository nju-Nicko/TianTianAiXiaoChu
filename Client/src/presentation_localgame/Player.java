package presentation_localgame;

public class Player {
	private String playerid;
	private boolean isReceived;
	
	public Player(String playerid,boolean isReceived){
		this.playerid=playerid;
		this.isReceived=isReceived;
		
	}
	public void setState(boolean state){
		this.isReceived=state;
	}
	public void setPlayerId(String id){
		this.playerid=id;
	}
	public boolean getState(){
		return this.isReceived;
	}
	
	
}
