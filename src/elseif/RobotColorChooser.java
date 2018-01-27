
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot bob =new Robot("batman");
		for (int i = 0; i < 3; i++) {
		//3. ask the user what color they would like the robot to draw
		String color= JOptionPane.showInputDialog("What color do you want the robot to draw: Green, blue, or yellow?");
		//4. use an if/else statement to set the pen color that the user requested
		
			
		
if (color.equals("Green")) {
	bob.setPenColor(Color.GREEN);
}
else if (color.equals("Blue")) {
	bob.setPenColor(Color.blue);
}
else if (color.equals("Yellow")) {
	bob.setPenColor(Color.YELLOW);
}
        //5. if the user doesn’t enter anything, choose a random color
else {
	bob.setRandomPenColor();
}
		
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		bob.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
		bob.penDown();
		bob.setSpeed(10);
		for (int j = 0; j < 4; j++) {
			
		
bob.move(100);
bob.turn(90);
		}

	}
}
}
