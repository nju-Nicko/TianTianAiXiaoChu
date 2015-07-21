package game;

import java.io.Serializable;

/**
 * @author StartDust
 *
 */
public class Position implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int Column;
	public int Row;
	
	public Position(int a, int b) {
		this.Row = a;
		this.Column = b;
	}
	
	public Position() {}
	
	public int[] toInt() {
		return new int[]{Row, Column};
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Position p = (Position) obj;
		return (Row == p.Row) && (Column == p.Column);
	}
	
}
