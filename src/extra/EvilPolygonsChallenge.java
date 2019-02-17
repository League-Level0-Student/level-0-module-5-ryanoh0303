package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot= new Robot();

		//2. Set the speed to 100
		robot.setSpeed(100);

		int colorChoice=JOptionPane.showOptionDialog(null, "What color do you want?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
			robot.setPenColor(255,0,0);
		}
		else if(colorChoice==1) {
			robot.setPenColor(0,255,0);
		}
		else {
			robot.setPenColor(0,0,255);
		}
		robot.setPenWidth(5);
		
		String number=JOptionPane.showInputDialog("How many polygons?");
		int x= Integer.parseInt(number);
		//4. Ask the use how many polygons they want to be drawn.
	      robot.setX(400);
	      robot.setY(200);
		//5. Use the robot to draw the number of polygons the user requested.
		
		for(int i=0; i<x; i++) {
			robot.penUp();
		    robot.turn(90);
			robot.move(150);
			robot.penDown();
			for(int j=0; j<4; j++) {
				robot.turn(90);
				robot.move(50);
			}
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

