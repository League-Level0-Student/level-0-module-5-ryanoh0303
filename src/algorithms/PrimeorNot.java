package algorithms;

import javax.swing.JOptionPane;

public class PrimeorNot {

	public static void main(String[] args) {
		int z = 0;
		String y = JOptionPane.showInputDialog("What is the number?");
		int x = Integer.parseInt(y);

		for (int i = 2; i < x; i++) {
			if (x % i == 0 && x != 1) {
				z = z + 1;
			}
		}

		if (x < 0) {
			System.out.println("Invalid Value");
		} else if (z > 0 || x == 1) {
			System.out.println("It is not a prime number");
		} else if (z == 0 && x != 1) {
			System.out.println("It is a prime number");
		}

	}
}
