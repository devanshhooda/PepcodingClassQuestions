package FunctionAndArrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();

		System.out.println(convertAnyToAnyBase(num, sourceBase, destBase));

	}

	private static int convertAnyToAnyBase(int num, int srcBase, int dstBase) {

		int decimalEquivalent = srcBase == 10 ? num : anyBaseToDecimal(num, srcBase);

		int ans = decimalToAnyBase(decimalEquivalent, dstBase);

		return ans;

	}

//	Any Base To Decimal
	private static int anyBaseToDecimal(int num, int srcBase) {

		int val = 0;

		int mul = 1;

		while (num != 0) {

			int rem = num % 10;

			val += (rem * mul);

			num = num / 10;

			mul *= srcBase;

		}

		return val;

	}

//	Decimal To Any Base
	private static int decimalToAnyBase(int num, int dstBase) {

		int val = 0;

		int mul = 1;

		while (num != 0) {

			int rem = num % dstBase;

			val += (rem * mul);

			num = num / dstBase;

			mul *= 10;

		}

		return val;

	}

}
