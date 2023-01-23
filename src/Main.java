import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		int[] a = {70, 80, 50};
		int b = 143;
		//s.solution(a, 100);
	}
}


class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;

		int u = 0, o = 0, e = 0;
		double stdr = limit/2;
		List<Integer> list = new ArrayList<>();

		for(int p : people) {
			list.add(p);
		}

		for(Integer i : list) {
			if(list.contains(limit-i)) {
				e++;
			} 
		}

		return answer;
	}
}