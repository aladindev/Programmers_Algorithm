import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		//5	[2, 4]	[1, 3, 5]
		int[] a = {1, 2};
		int[] b = {2, 3};
		s.solution(3, a, b);
	}
}


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0 ; i < lost.length ; i++) {
        	for(int j = 0 ; j < reserve.length ; j++) {
        		if(lost[i] == reserve[j]) {
        			reserve[j] = -1;
        			lost[i] = -1;
        			answer+=1;
        			break;
        		}
        	}
        }
        
        for(int i : reserve) {
        	System.out.println(">>" + i);
        }
        
        for(int i = 0 ; i < lost.length ; i++) {
        	int lostVal = lost[i];
        	
        	for(int j = 0 ; j < reserve.length ; j++) {
    			if(reserve[j]-1 == lostVal || reserve[j]+1 == lostVal) {
    				reserve[j] = -1;
    				answer += 1;
    				break;
    			}
        		
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}