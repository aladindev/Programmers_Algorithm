import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		System.out.println(s.solution("a", 4));
		//e F d
		// 122 + 4 = 126 
	}
}

class Solution {
    public String solution(String s, int n) {
        char[] cArr = s.toCharArray();
        
        for(int i = 0 ; i < cArr.length ; i++) {
        	if(cArr[i] == ' ') continue;
        
        	cArr[i] += n;
        	
        	if( (cArr[i]-n < 91 && cArr[i] > 90) || (cArr[i]-n < 123 && cArr[i] > 122)) {
        		cArr[i] -= 26;
        	}
        }
        return String.valueOf(cArr);
    }
}