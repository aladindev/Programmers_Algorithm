import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		System.out.println(s.solution(5, 25));
	}
}


class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left ; i <= right ; i++) {
        	answer = getCnt(i)%2==0 ? answer+i : answer-i;
        }
        return answer;
    }
    
   public int getCnt(int num) {
	   int cnt = 0;
	   
	   for(int i = 1 ; i <= num ; i ++) {
		   cnt = num%i==0 ? cnt+1 : cnt;
	   }
	   return cnt;
   }
}