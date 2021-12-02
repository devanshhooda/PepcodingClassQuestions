package StringStringBuilderAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

	public static void removePrimes(ArrayList<Integer> al) {
		// write your code here

		int idx = 0;

		while (idx < al.size()) {
			if (isPrime(al.get(idx))) {
				al.remove(idx);
			} else {
				idx++;
			}
		}

	}

	private static boolean isPrime(int num) {

		for (int div = 2; div * div <= num; div++) {
			if (num % div == 0) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(scn.nextInt());
		}

		removePrimes(al);
		System.out.println(al);

	}

}
