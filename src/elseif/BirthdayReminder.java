
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "March 16th";
		String dadsBirthday = "March 26th";
		String myBirthday = "January 1st";
		String sistersBirthday = "August 21st";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String birthday = JOptionPane.showInputDialog("What birthday do you want? Mom, Dad, Sophia, or Izi?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (birthday.equals("Mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (birthday.equals("Dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (birthday.equals("Izi")) {
			System.out.println(myBirthday);
		} else if (birthday.equals("Sophia")) {
			System.out.println(sistersBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
	}
}
