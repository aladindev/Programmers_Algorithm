import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
	}
}

class Solution {
	public int solution(int n) {
		int answer = 1;

		for(int i = 1 ; i <= n ; i++) {
			int sum = i;
			for(int j = i+1 ; j <= n ; j++) {
				sum+=j;
				if(sum == n) {
					answer+=1;
					break;
				} else if(sum > n) break;
			}
		}

		return answer;
	}
}

