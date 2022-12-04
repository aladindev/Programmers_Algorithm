import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] a = {1, 1, 1, 1, 4, 6, 7};
		s.solution(a);

	}
}

class Solution {
    public int[] solution(int[] numbers) {
    	ArrayList<Integer> tempList = new ArrayList<Integer>();
        int[] answer = null;
        
        //ArrayList에 담은 뒤 리스트 오름차순 정렬 
        for(int i = 0 ; i < numbers.length ; i++) {
        	for(int j = i+1 ; j < numbers.length ; j++) {
        		tempList.add(numbers[i]+numbers[j]);
        	}
        }
        Collections.sort(tempList);
        
        //리스트 내에 중복되는 수 제거 
        int idx = 0;
        while(idx < tempList.size()-1) {
        	if((int)tempList.get(idx) == (int)tempList.get(idx+1)) {
        		tempList.remove(idx);
        	} else {
        		idx++;
        	}
        }
        
        
        //if(Object.equals(list.get(idx), list.get(idx + 1))
        
        // integer 배열로 변환하여 반환 
        answer = new int[tempList.size()];
        answer = tempList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}