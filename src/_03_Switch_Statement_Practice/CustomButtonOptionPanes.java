package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Uh oh, tomorrow is Monday");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Mondays suck");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Tuesdays are eh");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Wednesdays are HUMPDAYS");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Tomorrow will be Friday!!!");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Time to PARTAY");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "TIME TO PARTY EVEN MORE");
			break;
		}

	}
}
