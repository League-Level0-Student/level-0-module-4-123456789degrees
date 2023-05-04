package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String stringNickels = JOptionPane.showInputDialog("How many nickels do you have? ");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickels = Integer.parseInt(stringNickels);
		// Ask the user how many dimes they have, and convert their answer
		String stringDimes = JOptionPane.showInputDialog("How many dimes do you have? ");
		// Ask the user how many quarters they have, and convert their answer
		int dimes = Integer.parseInt(stringDimes);
		// Calculate how much money the user has.  Hint: Use a double variable 
		String stringQuarters = JOptionPane.showInputDialog("How many dimes do you have? ");
		// Ask the user how many quarters they have, and convert their answer
		int quarters = Integer.parseInt(stringQuarters);
		double money = dimes * 0.1 + nickels * 0.05 + quarters * 0.25;
		JOptionPane.showMessageDialog(null, ("$" + String.format("%.2f", money)));
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

