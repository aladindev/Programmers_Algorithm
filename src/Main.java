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

        List<Map<Integer, Integer>> resultList = new ArrayList<>();

        for(int i = 0 ; i < result.size() ; i++) {
            List<Integer> keyList = new ArrayList<>(result.get(i).keySet());
            Map<Integer, Integer> map = new LinkedHashMap<>();
            int finalI = i;
            Collections.sort(keyList, (o1, o2) -> {return result.get(finalI).get(o2) - result.get(finalI).get(o1);});

            for(int k : keyList) {
                map.put(k, result.get(i).get(k));
            }
            resultList.add(map);
        }

        Set<Integer> pick = new HashSet<>();
        int max = 0;
        int qlry = 0;


        /**
         {4=100, 3=70, 0=40, 2=30, 1=20}
         {4=100, 2=30, 0=10, 1=5 , 3=0 }
         {4=100, 3=70, 2=30, 0=10, 1=0 }
         * */

        for(Map<Integer, Integer> map : resultList) {
            Iterator<Map.Entry<Integer, Integer>> entry = map.entrySet().iterator();
            while(entry.hasNext()) {
                Map.Entry<Integer, Integer> next = entry.next();

                int key = next.getKey();
                int value = next.getValue();
                if(pick.contains(key)) continue;

                qlry += value;
                pick.add(key);
                break;
            }
            max = qlry > max ? qlry : max;
        }

        return max;
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
