package Contest_4;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrquencyCharacter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		int strlen = str.length();

		HashMap<Character, Integer> tracker = new HashMap<>();

		for (int idx = 0; idx < strlen; idx++) {
			if (tracker.containsKey(str.charAt(idx))) {
				int prev = tracker.get(str.charAt(idx));
				tracker.put(str.charAt(idx), prev + 1);
			} else {
				tracker.put(str.charAt(idx), 1);
			}
		}

		char maxFreqChar = getMaxFreqCharacter(tracker);

		System.out.println(maxFreqChar);

	}

	private static char getMaxFreqCharacter(HashMap<Character, Integer> tracker) {
		int maxFreq = Integer.MIN_VALUE;
		char ans = 'a';

		for (char chr : tracker.keySet()) {
			if (tracker.get(chr) > maxFreq) {
				maxFreq = tracker.get(chr);
				ans = chr;
			}
		}

		return ans;
	}

}
