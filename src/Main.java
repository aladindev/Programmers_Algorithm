import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] nums = {3,3,3,2,2,4};
	}
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pLeng = p.length();
        long pLong = Long.parseLong(p);
        for(int i = 0 ; i < t.length() ; i++) {
        	int idx  = i+pLeng;
        	if(idx > t.length()) break;
        	
        	long l = Long.parseLong(t.substring(i, idx));
        	answer = l<=pLong ? answer+1 : answer;
        }
        return answer;
    }
}