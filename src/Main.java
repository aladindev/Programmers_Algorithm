import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] a = {1, 2, 3, 1, 2, 3, 1};
		System.out.println(s.solution(3, 4, a));
		//int[] a = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		//System.out.println(s.solution(4, 3, a));

	}
}


//과일장수 
class Solution {
    public int solution(int k, int m, int[] score) {

    	//사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m
    	//(최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) 
    	
    	int answer = 0;
    	if(score.length <= 3) return answer;
    	
    	//int[] to integer[]
    	Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
    	for(Integer a : arr) System.out.print(a + " ");
    	System.out.println();
    	//desc
    	Arrays.sort(arr, Collections.reverseOrder());
    	
    	for(Integer a : arr) System.out.print(a + " ");
    	System.out.println();
    	
    	int resultLength = score.length - score.length%4;

//    	for(int i = resultLength-1 ; i>=0 ; i--) {
//    		System.out.print(i + " ");
//    		if((i+1)%m==0) {
//    			answer += arr[i]*m; 
//    		}
//    	}
        return answer;
    }
}