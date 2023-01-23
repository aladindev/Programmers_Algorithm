import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
	}
}

class Solution { //
	boolean solution(String s) {
		boolean answer = true;

		// 문자열 첫 단어가 닫는 괄호이거나 마지막 단어가 여는 괄호이면 false
		if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;

		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.add(c);
			} else if(c == ')') {
				if(stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}

		return stack.size() > 0 ? false : true;
	}
}


