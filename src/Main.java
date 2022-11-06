import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println( s.solution("027778888") );
		
	}

}

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        answer = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]", "*");
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
}