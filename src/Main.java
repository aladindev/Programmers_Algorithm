import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

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
    
    	/* Queue는 FIFO(First In First Out)구조로 먼저들어온 순서대로 데이터가 나가게 되지만 
    	 * Priority Queue란 데이터의 우선순위를 정해 우선순위가 높은 순서대로 나가게됩니다 */
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    	int[] answer = new int[score.length];
 
    	for(int i = 0 ; i < score.length ; i++) {
    		
    		queue.add(score[i]);
    		if(queue.size() > k) {
    			queue.poll();
    		}
    		
    		answer[i] = queue.peek();
    	}
    	
    	return answer;
    }
}







