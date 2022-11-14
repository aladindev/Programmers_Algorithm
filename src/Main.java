import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		s.solution(5, arr1, arr2);
		
	}
}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0 ; i < n ; i++) {
        	String a = Integer.toString(arr1[i], 2);
        	String b = Integer.toString(arr2[i], 2);
        	String result = "";
        	
        	a = lpad(a, n);
        	b = lpad(b, n);
        	
        	
        	for(int j = 0 ; j < n ; j++) {
        		if(a.charAt(j) == '1' || b.charAt(j) == '1') {
        			result += "#";
        		} else {
        			result += " ";
        		}
        	}
        	answer[i] = result;
        }
        return answer;
    }
    
    public String lpad(String input, int n) {
    	
    	String result = input;
    	for(int i = input.length() ; i < n ; i++) {
    		result = "0" + result;
    	}
    	return result;
    }
}