import java.io.IOException;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] a = {0,0,0,0,0,0};
		int[] b = {38, 19, 20, 40, 15, 25};
		s.solution(a, b);

	}
}

class Solution {
	
    public int[] solution(int[] lottos, int[] win_nums) {
    	
    	int[] RANK_MAP = {6,6,5,4,3,2,1};
    	
    	int collectCnt = 0;
    	int zeroCnt = 0;
    	
    	for(int i = 0 ; i < lottos.length ; i++) {
    		for(int j = 0 ; j < win_nums.length ; j++) {
    			collectCnt = lottos[i]==win_nums[j] ? collectCnt+1 : collectCnt;
    		}
    		zeroCnt = lottos[i]==0 ? zeroCnt+1 : zeroCnt;
    	}
    	
        int[] answer = {RANK_MAP[collectCnt+zeroCnt], RANK_MAP[collectCnt]};
        return answer;
    }
}


//class Solution {
//	
//	public static Map<Integer, Integer> RANK_MAP = Map.of(
//					// 맞은개수, 등수
//					6,1
//				   ,5,2
//				   ,4,3
//				   ,3,4
//				   ,2,5
//				   ,1,6
//				   ,0,6);
//	
//    public int[] solution(int[] lottos, int[] win_nums) {
//    	
//    	int collectCnt = 0;
//    	int zeroCnt = 0;
//    	
//    	for(int i = 0 ; i < lottos.length ; i++) {
//    		for(int j = 0 ; j < win_nums.length ; j++) {
//    			collectCnt = lottos[i]==win_nums[j] ? collectCnt+1 : collectCnt;
//    		}
//    		zeroCnt = lottos[i]==0 ? zeroCnt+1 : zeroCnt;
//    	}
//    	
//        int[] answer = {RANK_MAP.get(collectCnt+zeroCnt), RANK_MAP.get(collectCnt)};
//        return answer;
//    }
//}