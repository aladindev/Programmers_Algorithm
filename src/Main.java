import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		int[] a = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		String b = "211231231";
		System.out.println(b.substring(0, 0));
		s.solution(a);
	}
}


class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < ingredient.length ; i++) {
			sb.append(ingredient[i]);
		}
		String str = sb.toString();
		sb.setLength(0);
		int idx = str.indexOf("1231");

		while(idx > -1) {
			answer++;
			sb.setLength(0);
			sb.append(str.substring(0, idx));
			sb.append(str.substring(idx+"1231".length()));
			str = sb.toString();
			idx = str.indexOf("1231");
		}

		return answer;
	}
}