/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] button;
	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String words = JOptionPane.showInputDialog("Please enter a positive number");
		int num = Integer.parseInt(words);
		// 4. Initialize the array of JButtons to be the size of the int created in step
		button = new JButton[50];
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton();

		}
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton();
			button[i].addActionListener(this);
			panel.add(button[i]);
		}
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		// JFrame.MAXIMIZED_BOTH;
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null,
				"If you want to know how to play this game read this. A group of buttons will appear on the screen."
						+ " There will also be a button that says hidden button for a split second. "
						+ "Then it will... go away. Your job is to click the button that used to say hidden button."
						+ " Keep on doing this and you will win the game! "
						+ "If you do not read this you will most likley fail at this game so you should read this because it is very important... "
						+ "And if you have not and have'nt had the time to read this this please read it right now so you know how to play. "
						+ "Anyway those are all the rules. Good Luck!");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random r = new Random();
		
		hiddenButton = r.nextInt(num);
		
//14. Set the text of the JButton located at hiddenButton to "ME"

		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this

		// 16. Set the text of the JButton located at hiddenButton to be blank.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.

		// 18. else tell them to try again
	}s
}
