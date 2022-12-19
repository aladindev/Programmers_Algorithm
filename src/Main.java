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
    
    	//k:3	score[10, 100, 20, 150, 1, 100, 200]
    	ArrayList<Integer> rank = new ArrayList<Integer>();
    	int[] answer = new int[score.length];
    	
    	
    	for(int i = 0 ; i < score.length ; i++) {
    		if(rank.size() < k) {
    			rank.add(score[i]);
    			
    		} else {
    			if(rank.get(0) < score[i]) {
    				rank.remove(0);
    				rank.add(score[i]);
    			}
    		}
    		Collections.sort(rank);
    		answer[i] = rank.get(0);
    	}
    	return answer;
    }
}







