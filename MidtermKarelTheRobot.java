package Midterm;
import stanford.karel.*;
public class MidtermKarelTheRobot extends SuperKarel {
	public void run() {
		firstMove();
		moveUntilWall();
		resetPosition();
		moveUntilWall();
		resetPosition();
		moveUntilWall();
		resetPosition();
		moveUntilWall();
	}
	
	public void firstMove() {
		turnLeft();
		move();
		turnRight();
		move();	
		putBeeper();
	}
	
	public void moveUntilWall() {
		while(frontIsClear()) {
			move();
				if(frontIsClear()) {
					if(beepersPresent()) {
						continue;
					}
					putBeeper();
			}
		}
	}
	public void resetPosition() {
		turnLeft();
		turnLeft();
		move();
		turnRight();
	}
}