import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(118372));
	}

}

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] arr = String.valueOf(n).toCharArray();

        Arrays.sort(arr);
        String result = "";
        for(int i = arr.length-1 ; i >= 0 ; i--) {
        	result += arr[i];
        }
        
        return Long.parseLong(result);
    }
}