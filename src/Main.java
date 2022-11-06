import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
	}

}

class Solution {
    public String solution(String s) {
        String answer = "";

        answer = s.length()%2==0 ? s.substring(s.length()/2-1, s.length()/2+1) 
        						 : s.substring(s.length()/2, s.length()/2+1);
        return answer;
    }
}