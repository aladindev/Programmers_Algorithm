import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		s.solution("banana");
	}
}


class Solution {
	public int solution(String s) {
		int answer = 0;

		char first = s.charAt(0);
		int eqCnt = 0;
		int neCnt = 0;

		if(s.length() == 1) return answer;
		String tmpStr = s;


		//banana
		int idx = 0;
		while( s.length() > 0) {
			
		}

		return answer;
	}
}
