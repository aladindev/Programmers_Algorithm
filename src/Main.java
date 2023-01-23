import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
	}
}

class Solution {
	boolean solution(String s) {
		boolean answer = true;

		// 문자열 첫 단어가 닫는 괄호이거나 마지막 단어가 여는 괄호이면 false
		if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;
		Stack<Character> stack = new Stack<>();

		// 스택에 담는다.
		for(char c : s.toCharArray()) {
			stack.add(c);
		}

		int cnt = 0; // 닫는괄호 갯수를 카운트
		for(int i = 0 ; i < stack.size() ; i++) {
			if(stack.peek() == ')') { // 닫는 괄호이면 갯수를 더하고 pop한다.
				cnt++;
				stack.pop();
			} else if(stack.peek() == '(') { // 여는 괄호일 때
				if(cnt > stack.size()) return false; // 닫는 괄호 갯수가 스택 사이즈 보다 크면 false(여는 괄호 갯수가 더 적은 경우)

				for(int j = 0 ; j < cnt ; j++) {// 닫는 괄호 갯수만큼 pop
					char c = stack.pop();
					if(c == ')') return false;// pop하는 과정에서 여는 괄호가 아닌 닫는 괄호를 만나면 false(닫는 괄호 갯수가 더 많은 경우)
				}
				if(stack.size() > 0) {// 오버플로우 방지
					if(stack.peek() == '(') return false;// 여는 괄호가 남은 경우 false(여는 괄호 갯수가 더 많은 경우)
				}
				cnt = 0;

			}
		}
		return answer;
	}
}


