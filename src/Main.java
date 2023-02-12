import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		System.out.println(s.solution("z", "abcdefghij", 20));
	} 
}



class Solution {
	public String solution(String s, String skip, int index) {

		char[] cArr = s.toCharArray();

		for(int i = 0 ; i < cArr.length ; i++) {
			int idxTmp = index;
			char cTmp = 0;
			for(int j = 1 ; j <= idxTmp ; j++) {
				cTmp = (char)((int)cArr[i] + 1);

				if(cTmp > 122) {
					int a = cTmp - 122;
					cTmp = (char)(97 + a-1);
				}
				if(skip.indexOf(cTmp) > -1) {
					idxTmp++;
				}
				cArr[i] = cTmp;
			}

		}
		return String.valueOf(cArr);
	}
}