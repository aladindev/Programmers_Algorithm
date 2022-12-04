import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] a = {1, 1, 1, 1, 4, 6, 7};
		s.solution(a);

	}
}

class Solution {
    public int[] solution(int[] numbers) {
    	
    	Set<Integer> set = new HashSet<Integer>();
        int[] answer = null;
        
        //Set : List와 다르게 중복된 값을 가질 수 없다.(집합과 같은 개념)
        for(int i = 0 ; i < numbers.length ; i++) {
        	for(int j = i+1 ; j < numbers.length ; j++) {
        		set.add(numbers[i]+numbers[j]);
        	}
        }
        
        // integer 배열로 변환하여 반환 
        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}