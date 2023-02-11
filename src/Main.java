import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
	} 
}


class Solution {
	public String solution(String s, String skip, int index) {
		String answer = "";
		char[] arr1 = s.toCharArray();

		for(char c : arr1) {
			for(int i = 1 ; i <= index ; i++) {
				int add = (int)c + i;
				if(add > 122) {
					c = (char)97;
				}
				char ct = (char)add;
				if(String.valueOf(ct).equals(skip)) {

				}
			}
		}
		return answer;
	}
}