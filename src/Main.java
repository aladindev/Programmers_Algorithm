import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		String[] a = {"i", "drink", "water"};
		String[] b = {"want", "to"};
		String[] c = {"i", "want", "to", "drink", "water"};

		System.out.println(s.solution(b,a,c));
	}
}


class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";

		String[] start = null;
		String[] next = null;
		if(goal[0].equals(cards1[0])) {
			start = cards1.clone();
			next = cards2.clone();
		} else if(goal[0].equals(cards2[0])) {
			start = cards2.clone();
			next = cards1.clone();
		} else {
			return "No";
		}

		int i = 1;
		int j = 0;
		int idx = 1;
		while(idx < goal.length) {
			String g = goal[idx++];
			if(i < start.length) {
				if(g.equals(start[i])) {
					i++;
					continue;
				}
			}
			if(j < next.length) {
				if(g.equals(next[j])) {
					j++;
					continue;
				}
			}
			return "No";
		}
		return answer;
	}
}