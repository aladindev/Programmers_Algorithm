import java.io.IOException;
import java.text.ParseException;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		s.solution(2);
	}
}

class Solution {
    public int solution(int n) {
        int answer = pibo(4);
        
        System.out.println(answer);
        return answer;
    }
    public int pibo(int n) {
    	if(n == 0) return 0;
    	if(n == 1) return 1;
    	
    	return pibo(n-1) + pibo(n-2);
    }
}