import java.io.IOException;
import java.text.ParseException;



public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
//		String a = "3people unFollowed me";

		String a = "  3peoPle";

		s.solution(78);
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String n2 = Integer.toString(n, 2);
        n2 = n2.replaceAll("0", "");
        
        int cnt = n2.length();
        
        String tmp = "";
        for(int i = n+1 ; i <= 1000000 ; i++) {
        	tmp = Integer.toString(i, 2);
        	tmp = tmp.replaceAll("0", "");
        	
        	if(cnt == tmp.length()) {
        		answer = i;
        		break;
        	}
        		
        }
        return answer;
    }
}