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
    public long solution(int price, int money, int count) {
        long answer = -1;

        long needMoney = 0;
        
        for(int i = 1 ; i <= count ; i ++) {
        	needMoney += price * i;
        }
        
        answer = needMoney - money > 0 ? needMoney-money : 0; 
        return answer;
    }
}