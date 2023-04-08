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

        List<String> list = new ArrayList<>();
        String[] answer = new String[players.length];
        for(int i = 0 ; i < players.length ; i++) {
            list.add(players[i]);
        }

        for(int j = 0 ; j < callings.length ; j++) {
            String name = callings[j];
            int idx = list.indexOf(name)-1;
            String tmp = list.get(idx);
            list.remove(idx);
            list.add(idx, name);
            list.remove(idx+1);
            list.add(idx+1, tmp);
        }

        for(int k = 0 ; k < list.size() ; k++) {
            answer[k] = list.get(k);
        }
        return answer;
    }
}