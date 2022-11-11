import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();
		//s.solution("ZbcdDefg");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		

        for(int i = 0 ; i < m ; i ++) {
            for(int j = 0 ; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = null;
        
        for(int i = 0 ; i < arr1.length ; i++) {
        	for(int j = i ; j < arr1[i].length ; j++) {
        		
        	}
        }
        return answer;
    }
}