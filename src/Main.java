import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static <K> void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		//s.solution("(())()");
		int[][] t = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		s.solution(t);
	}
}


class Solution {
	public int solution(int[][] sizes) {
		int answer = 0;

		for(int i = 0 ; i < sizes.length ; i++) {
			int tmp = 0;
			if(sizes[i][1] > sizes[i][0]) {
				tmp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tmp;
			}
		}
		int xMax = 0;
		Arrays.sort(sizes, new CustomXComparator());
		xMax = sizes[0][0];
		int yMax = 0;
		Arrays.sort(sizes, new CustomYComparator());
		yMax = sizes[0][1];

		return xMax * yMax;
	}
}

class CustomXComparator implements Comparator<int[]> {

	@Override
	public int compare(int[] o1, int[] o2) {
		return o2[0]-o1[0];
	}
}

class CustomYComparator implements Comparator<int[]> {

	@Override
	public int compare(int[] o1, int[] o2) {
		return o2[1]-o1[1];
	}
}