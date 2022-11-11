import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		
		
		
	}
}

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = null;
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
 
        Stack<Integer> s = new Stack<>();
        
        for(int i = arr.length-1 ; i > -1 ; i--) {
        	if(i == 0) {
        		s.push(arr[i]);
        		break;
        	}
        	if(arr[i] != arr[i-1]) s.push(arr[i]);
        }
        
        answer = new int[s.size()];
        for(int j = 0 ; j < answer.length; j++) {
        	answer[j] = s.pop();
        }

        return answer;
    }
}