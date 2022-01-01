package RecursionIntroduction;

import java.util.Scanner;

public class PowerLinear {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		int x = scn.nextInt();
		int n = scn.nextInt();

		System.out.println(power(x, n));

	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

		if (n == 1) {
			return x;
		}

		int xpown = power(x, n - 1);

		return xpown * x;

	}

}
