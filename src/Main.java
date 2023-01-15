import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

		System.out.println( s.solution("abracadabra"));


	}
}
class Solution {
	public int solution(String s) {
		int answer = 0;

		while(s.length() > 0) {
			if(s.length() == 1) {
				answer+=1;
				break;
			}
			char x = s.charAt(0);
			int eqCnt = 0;
			int neCnt = 0;
			for(int i = 0 ; i < s.length() ; i++) {

				if(x == s.charAt(i)) eqCnt++;
				else neCnt++;

				if(eqCnt == neCnt) {
					answer += 1;
					s=s.substring(i+1, s.length());
					break;
				}
			}
		}

		return answer;
	}
}