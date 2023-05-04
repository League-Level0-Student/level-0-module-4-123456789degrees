package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String stringTest = JOptionPane.showInputDialog("Enter test score (decimal):");
		double test = Double.parseDouble(stringTest);
		if (test >= 85) {
			JOptionPane.showMessageDialog(null, test + " was a great score! Wow! You must have studied really hard for that test!");
		}
		else if (test >= 70 && test < 85) {
			JOptionPane.showMessageDialog(null, test + " was a decent score.");
		}
		else {
			JOptionPane.showMessageDialog(null, test + " was a bad score. You didn't study enough.");
		}
	}
}
