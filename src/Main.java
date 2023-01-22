import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		int[] a = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		String b = "211231231";
		System.out.println(b.substring(0, 0));
		System.out.println(s.solution(a));
	}
}


class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for(int i : ingredient) {
			stack.add(i);

			if(stack.size() > 3) {
				if(stack.get(stack.size()-4) == 1
				 &&stack.get(stack.size()-3) == 2
				 &&stack.get(stack.size()-2) == 3
				 &&stack.get(stack.size()-1) == 1 ) {
					answer++;
					stack.pop();stack.pop();stack.pop();stack.pop();
				}
			}
		}
		return answer;
	}
}