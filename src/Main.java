
public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		
	}

}

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cntP = 0;
        int cntY = 0;

        for(int i = 0 ; i < s.length() ; i++) {
        	if('p'==s.charAt(i) || 'P'==s.charAt(i)) {
        		cntP+=1;
        	} else if('y'==s.charAt(i) || 'Y'==s.charAt(i)) {
        		cntY+=1;
        	}
        }
        
        if(cntP != cntY) answer = false;
        return answer;
    }
}


