import java.io.IOException;
import java.text.ParseException;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		s.solution("110010101001");
	}
}


class Solution {
    public int[] solution(String s) {
    	
        int[] answer = new int[2];
        
        int cnt = 0;
        int delZeroCnt = 0;
        String tmp = s;
        
        StringBuilder sb = new StringBuilder();
//        while(tmp.length() > 1) {
        while(tmp.length()>1) {
        	cnt++;
        	for(char c : tmp.toCharArray()) {
            	if(c=='0') delZeroCnt ++;
            	else sb.append("1");
            }
        	tmp = Integer.toString(sb.toString().length(), 2);
        	sb.setLength(0);
        }
        answer[0] = cnt;
        answer[1] = delZeroCnt;
        
        return answer;
    }
}