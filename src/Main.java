import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		int[] arr = {1, 3, 2, 4, 2};
		s.solution(arr);
	}
}

class Solution {
    public int[] solution(int[] answers) {
    	
    	int[] pattern1 = {1, 2, 3, 4, 5}; 				//수포자1 패턴 
    	int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};		//수포자2 패턴 
    	int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};//수포자3 패턴 
    	
    	int[][] result = {
    			 {1, 0} //수포자1, 맞은개수 
    			,{2, 0} //수포자2, 맞은개수 
    			,{3, 0} //수포자3, 맞은개수 
    	};
    	
    	for(int i = 0 ; i < answers.length ; i++) {
    		result[0][1] = pattern1[i%5]==answers[i] ? result[0][1]+1 : result[0][1];
    		result[1][1] = pattern2[i%8]==answers[i] ? result[1][1]+1 : result[1][1];
    		result[2][1] = pattern3[i%10]==answers[i] ? result[2][1]+1 : result[2][1];
    	}
    	
    	//맞은 개수 기준으로 내림차순 정렬 
		Arrays.sort(result, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	 return o2[1]-o1[1];
	           }
	        });
		
		int[] answer = null;
		
		int size = 0;
		for(int j = 0 ; j < result.length ; j++) {
			size = result[j][1]!=0 ? size+1 : size;
		}
		answer = new int[size];
		for(int z = 0 ; z < answer.length ; z++) {
			answer[z] = result[z][0];
		}
		
        return answer;
    }
}