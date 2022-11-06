import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] test = {2, 36, 1, 3};
		s.solution(test, 1);

	}

}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = { -1 };

        int size = 0;
        for(int i = 0 ; i < arr.length ; i++) {
        	if(arr[i]%divisor == 0) {
        		size++;
        	} else { 
        		arr[i] = 0;
        	}
        }
        
        if(size > 0) {
        	answer = new int[size];
        }
        
        
        for(int j = 0 ; j < answer.length ; j++) {
        	for(int z = j ; z < arr.length ; z++) {
        		if(arr[z] != 0) {
        			answer[j] = arr[z];
        			arr[z] = 0;
        			break;
        		}
        	}
        }
        
        if(answer != null) Arrays.sort(answer);
        return answer;
    }
}