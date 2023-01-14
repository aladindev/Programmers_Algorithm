import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		String[] ba = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

		System.out.println(s.solution(ba));
	}
}

class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] can = { "aya", "ye", "woo", "ma" };

		for(String b : babbling) {
			for(String c : can) {
				if(b.indexOf(c) > -1) {
					b.replaceAll(c, "");
				}
			}
			answer = b.length() > 0 ? answer : ++answer;
		}

		return answer;
	}
}