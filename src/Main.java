import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

		int[] a = {1,2,3,4};
		s.solution(a);
	}
}


class Solution {
	public int solution(int[] nums) {
		int answer = 0;

		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < nums.length ; i++) {
			int f = nums[i];
			for(int j = i+1 ; j < nums.length ; j++) {
				int s = nums[j];
				for(int k = j+1 ; k < nums.length ; k++) {
					int t = nums[k];
					answer = isSosu(f+s+t) ? answer+=1 : answer;
					set.add(f+s+t);
				}
			}
		}

		return answer;
	}

	public Boolean isSosu(int a) {

		Boolean result = true;
		for(int i = 2 ; i < a ; i++) {
			if(a%i==0) {
				return false;
			}
		}
		return result;
	}
}