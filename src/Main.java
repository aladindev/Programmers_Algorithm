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
        //TODO
        List<List<Integer>> sortKeyList = new ArrayList<>();

        for(int i = 0 ; i < result.size() ; i++) {
            List<Integer> keyList = new ArrayList<>(result.get(i).keySet());
            Map<Integer, Integer> map = new LinkedHashMap<>();
            int finalI = i;
            Collections.sort(keyList, (o1, o2) -> {return result.get(finalI).get(o2) - result.get(finalI).get(o1);});
            sortKeyList.add(keyList);

            for(int k : keyList) {
                map.put(k, result.get(i).get(k));
            }
            resultList.add(map);
        }


        /**
         {4=100, 3=70, 0=40, 2=30, 1=20}
         {4=100, 2=30, 0=10, 1=5 , 3=0 }
         {4=100, 3=70, 2=30, 0=10, 1=0 }

         sortKeyList
         [4, 3, 0, 2, 1]
         [4, 2, 0, 1, 3]
         [4, 3, 2, 0, 1]
         * */

        int max = 0;
        for(int i = 0 ; i < ability.length ; i++) { // 첫 항의 기준이 되는 사람수만큼 반복 5번
            Set<Integer> pick = new HashSet<>();
            int qlry = 0;
            int firstKey = sortKeyList.get(0).get(i);
            pick.add(firstKey);
            qlry += result.get(0).get(firstKey);

            for(int j = 1 ; j < sortKeyList.size() ; j++) {
                int nextKey = sortKeyList.get(j).get(0);
                if(pick.contains(nextKey)) {
                    for(int k = 0 ; k < ability.length ; k++) {
                        int findKey = sortKeyList.get(j).get(k);
                        if(!pick.contains(findKey)) {
                            nextKey = findKey;
                            break;
                        }
                    }
                }
                int value = result.get(j).get(nextKey);
                qlry += value;
                pick.add(nextKey);
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
