import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		System.out.println( s.solution(" asdf asdf asdf a a a  a "));
		
		
	}
}

class Solution {
    public String solution(String s) {
    	
    	String[] sArr = s.split(" ", -1); // 공백 단위로 쪼개서 배열 저장 
    	String answer = "";

    	
    	for(int j = 0 ; j < sArr.length ; j++) {
    		//최초에는 전부 소문자로 초기화해서 캐릭터 배열에 담는다.
    		char[] cArr = sArr[j].toLowerCase().toCharArray();
    		
    		for(int i = 0 ; i < cArr.length ; i++) {
    			//짝수이면 아스키코드 -32빼서 대문자로 치환 
    			if(i%2==0) cArr[i]-=32;
    			
    		}
    		sArr[j] = String.valueOf(cArr);
    	}
    	
    	for(int z = 0 ; z < sArr.length ; z++) {
    		if(z == sArr.length-1) {
    			answer += sArr[z];
    		} else {
    			answer += sArr[z] + " ";
    		}
    	}
        
        return answer;
    }
}