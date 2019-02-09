package algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		int sum = 0;
		int x = 0;
		int y = 1;
		System.out.println(0);
		System.out.println(1);
		for (int i = 0; i < 11; i++) {
			sum = x + y;

			System.out.println(sum);
			x = y;
			y = sum;

		}

	}

}
