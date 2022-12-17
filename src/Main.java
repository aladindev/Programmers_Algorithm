import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] a = {1, 2, 3, 1, 2, 3, 1};
		//int[] a = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		//System.out.println(s.solution(4, 3, a));
		
		int k = 3; int[] score = {10, 100, 20, 150, 1, 100, 200};
		s.solution(k, score);

	}
}

class Solution {
    public int[] solution(int k, int[] score) {
    	
        int[] answer = new int[score.length];
        
        //k = 3	 score = {10, 100, 20, 150, 1, 100, 200}
        int[] arr = new int[k];

        answer[0] = score[0];
      	arr[0] = score[0];
      	int min = arr[0];
      	
        for(int i = 1 ; i < k ; i++) {
        	if(min < score[i]) {
        		answer[i] = min;
        		arr[i] = score[i];
        	} else {
        		answer[i] = score[i];
        		int tmp = arr[i-1];
        		arr[i-1] = score[i];
        		arr[i] = tmp;
        	}
        }
        //test
//        for(int i : arr) System.out.print(i + " ");
//        System.out.println();
//        for(int i : answer) System.out.print(i + " ");
//        System.out.println();
        
        
        for(int i = k ; i < score.length ; i++) {
        	if(arr[0] <= score[i]) {
        		arr[0] = score[i];
        		Arrays.sort(arr);
        	} 
        	answer[i] = arr[0];
        }

        
        return answer;
    }
}







