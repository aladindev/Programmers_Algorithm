import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		s.solution("ZbcdDefg");
	}

}

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6) {
        	String pattern = "^[0-9]*$";
            
            answer = Pattern.matches(pattern, s);
            return answer;	
        } else {
        	answer = false;
        	return answer;
        }
        
    }
}