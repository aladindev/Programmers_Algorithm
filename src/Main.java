import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		s.solution(array, commands);
		
		
	}
}


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        for(int a : array) System.out.print(a + " ");
        
        System.out.println();
        
        for(int i = 0 ; i < commands.length ; i++) {
        	
        	// param1 : 범위 시작 인덱스 0부터 
        	// param2 : 범위 끝 인덱스 포함 X
        	int[] temp = 
        			Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2]-1];
        }
        
        
        return answer;
    }
}