import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String notation3 = Integer.toString(n, 3); //3진법
        String reverseStr = new StringBuilder(notation3).reverse().toString();
        answer = Integer.parseInt(reverseStr, 3);
        
        return answer;
    }
}