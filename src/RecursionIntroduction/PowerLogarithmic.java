package RecursionIntroduction;

import java.util.Scanner;

public class PowerLogarithmic {

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

		int xpownby2 = power(x, n / 2);

		if (n % 2 == 0) {
			return (xpownby2 * xpownby2);
		} else {
			return (xpownby2 * xpownby2 * x);
		}

	}

}
