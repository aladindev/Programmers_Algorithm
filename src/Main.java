import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
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

		double half = limit/2;
		int overCnt = 0;
		int underCnt = 0;
		for(int i = 0 ; i < list.size() ; i++) {

		}
		return list.size()>0 ? answer+1 : answer;
	}
}