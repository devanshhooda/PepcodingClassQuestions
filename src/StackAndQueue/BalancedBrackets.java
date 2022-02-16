package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();

		System.out.println(isBalancesParenthesis(str));

	}

	private static boolean isBalancesParenthesis(String str) {

		Stack<Character> stack = new Stack<>();
		int strlen = str.length();

		for (int idx = 0; idx < strlen; idx++) {

			char chr = str.charAt(idx);

			if (chr == '(' || chr == '[' || chr == '{')
				stack.push(chr);

			else if (chr == ')') {

				if (stack.isEmpty() || stack.peek() != '(')
					return false;
				else
					stack.pop();

			} else if (chr == ']') {

				if (stack.isEmpty() || stack.peek() != '[')
					return false;
				else
					stack.pop();

			} else if (chr == '}') {

				if (stack.isEmpty() || stack.peek() != '{')
					return false;
				else
					stack.pop();

			}

		}

		return stack.isEmpty();

	}

}
