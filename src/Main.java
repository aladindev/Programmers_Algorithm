import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {
 
        Solution s = new Solution();
        String[] p = {"mumu", "soe", "poe", "kai", "mine"};
        String[] c = {"kai", "kai", "mine", "mine"};
        s.solution(p,c);
    }
}


class Solution {
    public String[] solution(String[] players, String[] callings) {

        String[] answer = players.clone();

        Map<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < players.length ; i++) {
            map.put(players[i], i);
        }

        for(int j = 0 ; j < callings.length ; j++) {
            int idx = map.get(callings[j])-1;
            String tmp = answer[idx];
            answer[idx] = callings[j];
            answer[idx+1] = tmp; 
            map.put(callings[j], map.get(callings[j])-1);
            map.put(tmp, map.get(tmp)+1);
        }


        return answer;

    }
}