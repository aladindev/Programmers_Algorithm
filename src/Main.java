import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Stream;



public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        s.solution(new int[][] {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}});

    }
}

class Solution {
    public int solution(int[][] ability) {
        int answer = 0;

        // 과목, 사람별 점수맵
        Map<Integer, Map<Integer, Integer>> result = new TreeMap<>();
        for(int i = 0 ; i < ability.length ; i++) { // 행 : 사람
            for(int j = 0 ; j < ability[i].length ; j++) { // 열 : 과목
                Map<Integer, Integer> tmp = result.getOrDefault(j, new TreeMap<>());
                tmp.put(i, ability[i][j]);
                result.put(j, tmp);
            }
        }

        System.out.println(result);

        return answer;
    }
}


class Box<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}
