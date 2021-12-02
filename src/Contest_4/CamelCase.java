package Contest_4;

public class CamelCase {

	public static int camelcase(String s) {

		int len = s.length();

		int wordCount = 1;

		for (int idx = 0; idx < len; idx++) {
			char chr = s.charAt(idx);
			if (Character.isUpperCase(chr)) {
				wordCount++;
			}
		}

		return wordCount;

	}

}
