import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println( s.solution(a, b));

	}
}

//[1, 3, 4, 6]	"1223330333221"
//[1, 7, 1, 2]	"111303111"

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(String s : participant) {
        	System.out.print(s + " ");
        }
        System.out.println();
        for(String s : completion) {
        	System.out.print(s + " ");
        }
        
        for(int i = 0 ; i < completion.length ; i++) {
        	// 참여자와 완주자가 같지 않으면 
        	if(!participant[i].equals(completion[i])) { 
        		answer = participant[i];
        		break;
        	}
        }
        System.out.println();
        
        return "".equals(answer) ? participant[participant.length-1] : answer;
    }
}