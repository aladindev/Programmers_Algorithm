import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		s.solution("aukks", "wbqd", 5);
	} 
}


class Solution {
	public String solution(String s, String skip, int index) {

		char[] cArr = s.toCharArray();

		for(int i = 0 ; i < cArr.length ; i++) {
			int k = 1;
			int idx = index;
			char tmp = 0;
			while(k <= idx) {
				tmp = (char)(cArr[i]+k);

				if((int)tmp > 122) {
					tmp = (char)97;
				}
				k++;
				if(skip.indexOf(tmp) > -1) {
					idx = idx + 1;
					continue;
				}
			}
			cArr[i] = tmp;
		}
		return String.valueOf(cArr);
	}
}