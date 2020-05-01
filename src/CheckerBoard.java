import java.awt.GridLayout;

import javax.swing.JPanel;

public class CheckerBoard extends JPanel{
	private char [][] boardStatus 
	= new char[][] {
		{'e','b','e','b','e','b','e','b'},
		{'b','e','b','e','b','e','b','e'},
		{'e','b','e','b','e','b','e','b'},
		{'e','e','e','e','e','e','e','e'},
		{'e','e','e','e','e','e','e','e'},
		{'r','e','r','e','r','e','r','e'},
		{'e','r','e','r','e','r','e','r'},
		{'r','e','r','e','r','e','r','e'}
	};
	
	private JPanel gameBoard;
	
	public CheckerBoard(char [][] boardStatus) throws Exception{
		
		JPanel gameBoard = new JPanel();
		gameBoard.setLayout(new GridLayout(8,8));
		
		for(int row = 0; row < 8; row++) {
			for(int column = 0; column < 8; column++) {
				gameBoard.add(new CheckerPiece(row, column, boardStatus[row][column]));
			}
		}
		gameBoard.setVisible(true);
	}
	
	public void setBoardStatus(char [][] boardStatus) throws Exception{
		this.boardStatus = boardStatus;
		repaint();
	}
	
	public void setCheckerPiece(int row, int column, char status) {
		boardStatus[row][column] = status;
		repaint();
		
	}
	
	public JPanel getPanel() {
		return gameBoard;
	}
	
}
