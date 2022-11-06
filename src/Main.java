import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println( s.solution(626331) );
		
	}

}

class Solution {
	
    public int solution(long num) {

    	long n = num;
    	
    	int answer = 0;

    	while(true) {
    		if(answer > 500) {
    			answer = -1; break;
    		}
    		
    		if(n == 1) break;
    		if(n % 2 == 0) n/=2;
    		else n=n*3+1;
    		
    		answer++;
    	}
    	
    	return answer;
    }
}