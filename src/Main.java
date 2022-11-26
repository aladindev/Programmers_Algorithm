import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
	}
}

//[[1,2]    [[3,4]  [[4,6]
// [2,3]]	[5,6]]	[7,9]]
//	[[1],[2]]	[[3],[4]]	[[4],[6]]

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0 ; i < answer.length ; i++) {
        	for(int j = 0 ; j < answer[i].length ; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        
        return answer;
    }
}