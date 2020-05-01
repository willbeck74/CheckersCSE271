import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;

public class CheckerGame extends JFrame {
	char [][] boardStatus = new char[][] {
		{'e','b','e','b','e','b','e','b'},
		{'b','e','b','e','b','e','b','e'},
		{'e','b','e','b','e','b','e','b'},
		{'e','e','e','e','e','e','e','e'},
		{'e','e','e','e','e','e','e','e'},
		{'r','e','r','e','r','e','r','e'},
		{'e','r','e','r','e','r','e','r'},
		{'r','e','r','e','r','e','r','e'}
	};
	public CheckerGame() {
		JFrame frame = new JFrame();
		
		Container window = getContentPane();
		window.setSize(505, 585);
		window.setLayout(new BorderLayout());
		
		JMenuBar menu = new JMenuBar();
		JMenu secondMenu = new JMenu("Game");
		JMenuItem newGame = new JMenuItem("New");
		JMenuItem exit = new JMenuItem("Exit");
		
		secondMenu.add(newGame);
		secondMenu.add(exit);
		menu.add(secondMenu);
		
		JMenu help = new JMenu("Help");
		JMenuItem gameRules = new JMenuItem("Checker Game Rules");
		JMenuItem about = new JMenuItem("About Checker Game App");
		
		help.add(gameRules);
		help.add(about);
		menu.add(help);
		
		window.add(menu, BorderLayout.NORTH);
		JPanel game = new JPanel();
		
		
		try {
			frame.getContentPane().add(new CheckerBoard(boardStatus));
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		window.add(frame, BorderLayout.CENTER);
		
		JPanel playerStatus = new JPanel();
		playerStatus.setLayout(new GridLayout());
		JLabel status = new JLabel("Red: 12 --- Black: 12");
		JLabel name = new JLabel("Developed by Will Beck");
		playerStatus.add(status);
		playerStatus.add(name);
		window.add(playerStatus, BorderLayout.SOUTH);

	}
	
	public static void main(String[] args) {
		CheckerGame game = new CheckerGame();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);

	}

}
