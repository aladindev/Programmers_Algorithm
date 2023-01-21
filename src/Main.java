import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

		s.solution(5,3,2);
	}
}


class Solution {
	public int solution(int number, int limit, int power) {
		int answer = 0;
		int[] arr = new int[number+1];

		for(int i = 1 ; i < arr.length ; i++) {
			int cnt = 0;
			for(int j = 1 ; j*j <= i ; j++) {
				if(j*j==i) cnt++;
				else if(i%j==0) cnt+=2;
			}
			arr[i] = cnt>limit? power : cnt;
		}

		for(int a : arr) {
			answer += a;
		}

		return answer;
	}
}