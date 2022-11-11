import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();
		int[] arr = {4, 3, 2, 1};
		s.solution(arr);
		
		
	}
}

class Solution {
    public int[] solution(int[] arr) {
        
    	int[] answer = null;
    	
    	if(arr.length == 1) {
    		answer = new int[1];
    		answer[0] = -1;
    		
    		return answer;
    	} 
    	answer = new int[arr.length-1];
    	int[] tmp = arr.clone();
    	
    	Arrays.sort(arr);//가장 작은 수 구하기 
    	int min = arr[0];
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	int keyIdx = 0;
    	for(int i = 0 ; i < tmp.length ; i++) {
    		if(tmp[i] != min) {
    			map.put(keyIdx++, tmp[i]);
    		}
    		
    	}
    	for(int j = 0 ; j < answer.length ; j++) {
    		answer[j] = map.get(j);
    	}
    	
        return answer;
    }
}