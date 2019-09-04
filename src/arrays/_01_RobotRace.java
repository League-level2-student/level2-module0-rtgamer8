package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];
		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		rob[1].moveTo(500, 500);
		rob[2].moveTo(450, 500);
		rob[3].moveTo(400, 500);
		rob[4].moveTo(350, 500);
		rob[0].moveTo(300, 500);

		rob[1].miniaturize();
		rob[2].miniaturize();
		rob[3].miniaturize();
		rob[4].miniaturize();
		rob[0].miniaturize();

		rob[1].penDown();
		rob[2].penDown();
		rob[3].penDown();
		rob[4].penDown();
		rob[0].penDown();

		rob[1].setSpeed(8);
		rob[2].setSpeed(8);
		rob[3].setSpeed(8);
		rob[4].setSpeed(8);
		rob[0].setSpeed(8);

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean whileraceinprogress = true;
		while (whileraceinprogress) {
			// For each robot
			for (int i = 0; i < rob.length; i++) {
				// move robot a random distance
				for (int j = 0; j < 1; j++) {
					Random r = new Random();
					int distance = r.nextInt(51);
					rob[i].move(distance);
				}
				// check if robot crossed finish line
				int num = rob[i].getY();
				if (num < 30) {
					whileraceinprogress = false;
					JOptionPane.showMessageDialog(null, "Robot " + i + " won");
					break;
				}
				;
			}
		}
	}

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
