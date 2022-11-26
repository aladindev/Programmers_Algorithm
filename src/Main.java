import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
	}
}

class Solution {
    public int[] solution(int n, int m) {
    	
    	//18, 4
    	int maxGong = 0; //최대공약수
    	int tmp;
    	
        if(n<m){
            tmp = n;
            n = m;
            m = tmp;
        }
        int minGong = n%m==0 ? n : n*m; //최소공배수
        
        while(m!=0){
        	n = n%m;
            tmp = m;
            m = n;
        }
        maxGong = m;
    	
        int[] answer = {maxGong, minGong};
        return answer;
    }
}