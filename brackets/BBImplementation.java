package lab3.brackets;

import java.util.Stack;

public class BBImplementation {
	public static String balancedOrNot(String brackets) {
		Stack<Character> stack = new Stack<>();
		String result = "The entered String has Balanced Brackets";
		for (char c : brackets.toCharArray()) {
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			else {
				if (stack.empty()) {
					result = "The entered String doesn't contain Balanced Brackets";
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
					result = "The entered String doesn't contain Balanced Brackets";
				}
			}
		}
		return result;
	}
}
