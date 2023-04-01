import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        int[] g = {2, 3, 6};
    }
}


class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < name.length ; i++) {
            map.put(name[i], yearning[i]);
        }

        for(int i = 0 ; i < photo.length ; i ++) {
            for(int j = 0 ; j < photo[i].length ; j++) {
                answer[i] += map.get(photo[i][j]) != null ? map.get(photo[i][j]) : 0;
            }
        }

        return answer;
    }
}