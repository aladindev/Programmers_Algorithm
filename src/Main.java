import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static <K> void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		//s.solution("(())()");
	}
}


class Solution {
	public int solution(int[] nums) {
		int answer = 0;

		int n2 = nums.length/2;

		Set<Integer> set = new HashSet<>();

		for(int n : nums) {
			set.add(n);
		}

		return set.size()>=n2 ? n2 : set.size();
	}
}