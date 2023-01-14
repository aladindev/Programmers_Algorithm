import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

//		[1, 4, 2]	[5, 4, 4]	29
//				[1,2]	[3,4]	10

		int[] a = {1,2};
		int[] b = {3,4};
		System.out.println(s.solution(a,b));

	}
}

class Solution
{
	public int solution(int []A, int []B)
	{
		int answer = 0;

		Arrays.sort(A);
		Integer[] arr = new Integer[B.length];

		int idx = 0;
		for(int i : B) {
			arr[idx++] = i;
		}
		Arrays.sort(arr, new CustomComparator());

		for(int i = 0 ; i < A.length ; i++) {
			answer += A[i]*arr[i];
		}
		return answer;
	}
}

class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}

}