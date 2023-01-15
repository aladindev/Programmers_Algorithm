import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		s.solution("(())()");

	}
}

class Solution {
	boolean solution(String s) {
		boolean answer = true;

		Stack<Character> st = new Stack<>();

		for(char c : s.toCharArray()) {
			st.add(c);
		}
		int cnt = 0;
		while(st.size() > 0) {

			if(cnt == 0) {
				if(st.peek() == '(') return false;
				cnt++;
				char c = st.pop();
			}

			if(st.peek() == '(') {
				if(cnt>=st.size()) {
					cnt = st.size();
				}
				for(int j = 0 ; j < cnt ; j++) {
					char p = st.pop();
					if(p == ')') return false;
				}
				cnt = 0;
			} else {
				cnt+=1;
				st.pop();
			}
		}

		return st.size() == 0 ? true : false;
	}
}