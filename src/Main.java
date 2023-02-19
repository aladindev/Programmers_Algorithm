import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		String[] a = {"i", "drink", "water"};
		String[] b = {"want", "to"};
		String[] c = {"i", "want", "to", "drink", "water"};

		s.solution(b,a,c);
	}
}


class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";

		String[] start = null;
		String[] next = null;
		String[] result = new String[cards1.length + cards2.length];

		if(goal[0].equals(cards1[0])) {
			start = cards1.clone();
			next = cards2.clone();
		} else {
			start = cards2.clone();
			next = cards2.clone();
		}
		result[0] = start[0];
		int idx = 1;
		for(int i = 0 ; i < next.length ; i++) {
			result[idx++] = next[i];
		}
		for(int j = 1 ; j < start.length ; j++) {
			result[idx++] = start[j];
		}
		for(int j = 0 ; j < goal.length ; j++) {
			if(!goal[j].equals(result[j])) {
				answer = "No";
				break;
			}
		}

		return answer;
	}
}