import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		s.solution("ZbcdDefg");
	}

}

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] arr = s.toCharArray();
        
        // Zbcdefg 오름차순 정렬 후 reverse
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(String.valueOf(arr)).reverse();
        answer = sb.toString();
        return answer;
    }
}