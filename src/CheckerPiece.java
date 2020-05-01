import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

/**
 * This class represents a square in the checkerboard that extends the JComponent class.
 * It drays a square if it is empty (e) or a square with a black(b) and red(r) checkers if it is 
 * red or black respectively. It overrides the paintComponent(Graphics g) method to draw. 
 * @author willbeck
 *
 */
public class CheckerPiece extends JComponent{
	private char status;
	private int row = 0;
	private int column = 0; 

	public CheckerPiece(int row, int column, char status) throws IllegalCheckerboardArgumentException {
		setRow(row);
		setColumn(column);
		setStatus(status);
	}

	public void paintComponent(Graphics g) {
		if(getStatus() == 'e') {
			g.setColor(Color.white);
			g.fillRect(480/getRow(), 480/getColumn(), 60, 60);
		}else if(getStatus() == 'r') {
			g.setColor(Color.green);
			g.fillRect(480/getRow(), 480/getColumn(), 60, 60);
			g.setColor(Color.black);
			g.fillOval(480/getRow(), 480/getColumn(), 40, 40);
		}else {
			g.setColor(Color.green);
			g.fillRect(480/getRow(), 480/getColumn(), 60, 60);
			g.setColor(Color.red);
			g.fillOval(480/getRow(), 480/getColumn(), 40, 40);
		}
	}
	
	/**
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 * @throws Exception 
	 */
	public void setStatus(char status) throws IllegalCheckerboardArgumentException {
		if(status == 'r' || status == 'b' || status == 'e')
			this.status = status;
		else throw new IllegalCheckerboardArgumentException("Invalid CheckerPiece status");
	}

	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @param row the row to set
	 * @throws IllegalCheckerboardArgumentException 
	 */
	public void setRow(int row) throws IllegalCheckerboardArgumentException {
		if(row >=0 && row <= 7)
			this.row = row;
		else throw new IllegalCheckerboardArgumentException("Invalid CheckerPiece Row");
	}

	/**
	 * @return the column
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * @param column the column to set
	 * @throws IllegalCheckerboardArgumentException 
	 */
	public void setColumn(int column) throws IllegalCheckerboardArgumentException {
		if(column >= 0 && column <= 7)
			this.column = column;
		else throw new IllegalCheckerboardArgumentException("Invalid CheckerPiece Column");
	}
	
}
