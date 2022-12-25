import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		s.solution(5, stages);
	}
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = null;
        
        //stage(key)별 실패율을 담을 HashMap 선언 
        Map<Integer, Double> map = new HashMap<>();
        double tot = stages.length;
        
        //stage별 시도한 사람 카운트를 담을 int 배
        int[] tryList = new int[N+1];
        
        
        Arrays.sort(stages);
        for(int i = 0 ; i < stages.length ; i++) {
        	if(stages[i] > N) break;
        	tryList[stages[i]] += 1;
        }

        for(int i = 1 ; i < tryList.length ; i++) {
        	// 스테이지 시도한 사람이 없을 땐 실패율을 0으로 정의한다.
        	if(tryList[i] == 0) { 
        		map.put(i, 0.0);
        	} else {
        		map.put(i, tryList[i]/tot);
        	}
        	tot -= tryList[i];
        }
        

        /* Map의 value 정렬할 때는 map.keySet을 담는 keyType List를 정의하고 
         * 
         * */
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        answer = new int[keySet.size()];
        int idx = 0;
        for(Integer i : keySet) {
        	answer[idx++] = i;
        }
        
        return answer;
    }
}