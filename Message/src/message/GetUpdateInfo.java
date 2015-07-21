package message;

public class GetUpdateInfo extends Message {
//���ڲ�ͣ��ȡ��Ϸ    �ɼ�grade ��Ϸʱ�� gameTime �������� doubleHitNumber  ����״̬ superState
	private static final long serialVersionUID = 1L;
	private int grade;
	private int gameTime;
	private int doubleHitNumber;
	private boolean superState;

	public GetUpdateInfo(int grade, int gameTime, int doubleHitNumber, boolean superState){
		type=10;
		this.doubleHitNumber=doubleHitNumber;
		this.gameTime=gameTime;
		this.grade=grade;
		this.superState=superState;
	}
	public int getGrade(){
		return grade;
	}
	public int getGameGrade(){
		return gameTime;
	}
	public int getDoubleHitNumber(){
		return doubleHitNumber;
	}
	public Boolean getDoubleHitState(){
		return superState;
	}
}