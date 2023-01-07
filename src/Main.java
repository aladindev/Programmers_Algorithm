import java.io.IOException;
import java.text.ParseException;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		s.solution(15);
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String org = Integer.toString(n, 2);
        StringBuilder sb = new StringBuilder();
        
        System.out.println(org);
        
        if(org.indexOf("0") < 0) {
        	sb.append("10");
        	sb.append(org.substring(1, org.length()));
        }
        
        System.out.println(sb.toString());
        
        
        return answer;
    }
}