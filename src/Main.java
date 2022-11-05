import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		
	}

}

class Solution {
    public long solution(int input1, int input2) {
        long answer = 0;
        
        int s = input1 > input2 ? input2 : input1;
        int b = input1 > input2 ? input1 : input2;
        
        for(int i = s ; i <= b ; i++) {
        	answer += i;
        }
        return answer;
    }
}