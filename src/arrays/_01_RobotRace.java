package arrays;

import java.util.Random;

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

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean whileraceinprogress = true;
		while(whileraceinprogress) {
		

		for (int i = 0; i < 1; i++) {
			Random r = new Random();
			int distance = r.nextInt(51);
			rob[i].move(distance);
		}

		}
		}
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		}
	

