import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		
		//String[] arr = {"sun", "bed", "car"};
		String[] arr = {"abcd", "abce", "cdx"};
		//String[] arr = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		s.solution(arr, 2);
		
		//s.solution(6, arr1, arr2);
	}
}


class Solution {
    public String[] solution(String[] strings, int n) {
        
    	String[] arr = strings.clone();
    	
    	for(int i = 0 ; i < arr.length ; i++) {
    		arr[i] = arr[i].charAt(n) + arr[i];
    	}
    	Arrays.sort(arr);
    	
    	for(int j = 0 ; j < arr.length ; j++) {
    		arr[j] = arr[j].substring(1, arr[j].length());
    	}
    	return arr;
    }
}