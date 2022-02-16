package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();

		System.out.println(isRedundantParenthesis(str));

	}

	private static boolean isRedundantParenthesis(String str) {

		Stack<Character> stack = new Stack<>();
		int strlen = str.length();

		for (int idx = 0; idx < strlen; idx++) {

			char chr = str.charAt(idx);

			if (chr == ' ') {
				continue;
			}

			if (chr == ')') {

				if (stack.peek() == '(') {
					return true;
				}

				// pop till opening bracket is not found
				while (stack.peek() != '(') {
					stack.pop();
				}

				// pop that opening bracket too
				stack.pop();

			} else {
				stack.push(chr);
			}

		}

		return false;

	}

}
