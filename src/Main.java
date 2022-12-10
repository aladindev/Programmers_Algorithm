import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		
		String c = "banana";
		s.solution(c);

	}
}


class Solution {
    public int[] solution(String s) {
    	
    	char[] cArr = s.toCharArray();
        int[] answer = new int[cArr.length];
        
        for(int i = 0 ; i < s.length() ; i++) {
        	String tmp = s.substring(0, i);
        	int lIdx = tmp.lastIndexOf(cArr[i]);
        	
        	answer[i] = lIdx!=-1 ? i-lIdx : -1;
        }
        return answer;
    }
}