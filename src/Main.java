import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		String[] ba = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

		String[] tt = {"ac", "ca", "ac", "ac"};

		s.solution(ba);

	}
}
class Solution {
	public int solution(String[] babbling) {
		String[] can = {"aya", "ye", "woo", "ma"};
		int answer = 0;

		for(String b : babbling) {
			for(String c : can) {
				StringBuilder sb = new StringBuilder(c);
				sb.append(c);
				if(b.indexOf(c) > -1 && b.indexOf(sb.toString()) < 0) {
					b = b.replaceAll(c, " ");
				}
			}
			answer = "".equals(b.replaceAll(" ", "")) ? answer+1 : answer;
		}

		return answer;
	}
}