import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		int[] a = {50, 70, 80, 50};
		int b = 143;
		s.solution(a, 100);
	}
}


class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;

		List<Integer> list = new ArrayList<>();

		for(int p : people) {
			list.add(p);
		}

		for(int i = 0 ; i < list.size() ; i++) {
			int f = list.get(i);

			int sum = f;
			for(int j = i+1 ; j < list.size() ; j++) {
				if(f+list.get(j) == limit) {
					answer+=1;
					list.remove(j);
					list.remove(i);
					break;
				}
			}
		}

		for(int a : list) {
			System.out.println(a);
		}
		System.out.println(answer);

		return answer;
	}
}