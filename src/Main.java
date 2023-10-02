import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Stream;



public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        Toy t = new Toy();
        Box<Toy> box = new Box<Toy>();
        box.set(t);

        TMan tman = new TMan();

        s.solution(new int[][] {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}});

    }
}

class Solution {
    public int solution(int[][] ability) {
        int answer = 0;

        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(int i = 0 ; i < ability.length ; i++) { // 사람
            for(int j = 0 ; j < ability[i].length ; j++) { // 과목
                List<Integer> tmpList = map.getOrDefault(j, new ArrayList<>());
                tmpList.add(i, ability[i][j]);
                map.put(j, tmpList);
            }
        }

        //Test
        Iterator<Map.Entry<Integer, List<Integer>>> iter = map.entrySet().iterator();
        Map<Integer, Map<Integer, Integer>> result = new TreeMap<>();
        while(iter.hasNext()) {
            Map.Entry<Integer, List<Integer>> ii = iter.next();

            Map<Integer, Integer> tmpMap = new TreeMap<>();
            for(int i = 0 ; i < ii.getValue().size() ; i++) {
                tmpMap.put(i, ii.getValue().get(i));
            }
            result.put(ii.getKey(), tmpMap);
        }

        Iterator<Map.Entry<Integer, Map<Integer, Integer>>> iter22 = result.entrySet().iterator();

        List<List<Integer>> kkkkList = new ArrayList<>();
        while(iter22.hasNext()) {
            Map.Entry<Integer, Map<Integer, Integer>> ttt = iter22.next();
            List<Integer> keyList = new ArrayList<>(ttt.getValue().keySet());
            Collections.sort(keyList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return ttt.getValue().get(o2) - ttt.getValue().get(o1);
                }
            });
            kkkkList.add(keyList);
        }

        int max = 0;

        for(int i = 0 ; i < ability[0].length ; i++) { // 컬럼 수만큼 5번 반복
            Set<Integer> chooseSet = new HashSet<>();
            int qlry = 0;
            for(int j = 0 ; j < kkkkList.size() ; j++) { // 행수만큼 3번 반복(과목)
                int maxIdx = kkkkList.get(j).get(i); // 최대값 인덱스
                int value = result.get(j).get(maxIdx); // 최대값

                if(chooseSet.contains(maxIdx)) {
                    if(i < ability[0].length-1) {
                        maxIdx = kkkkList.get(j).get(i+1);
                        value = result.get(j).get(maxIdx);
                    }
                }
                qlry += value;
                chooseSet.add(maxIdx);
            }
            max = qlry > max ? qlry : max;
        }
        System.out.println(max);
        System.out.println(answer);
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

class Toy {
    public String toString() {
        return "test";
    }
}

class Man {
    private String name;
    public void tellYourName() {

    }
}

class TMan extends Man {
    String nam;
}


class CustomSort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        int firstNumberO1 = (int)(o1 / Math.pow(10, o1.toString().length() - 1));
        int firstNumberO2 = (int)(o2 / Math.pow(10, o2.toString().length() - 1));

        if(firstNumberO1 == firstNumberO2) {

            int secNumberO1 = (int)(o1 % Math.pow(10, o1.toString().length()-1));
            int secNumberO2 = (int)(o2 % Math.pow(10, o2.toString().length()-1));

            if(secNumberO1 == secNumberO2 && secNumberO1 == 0) {
                if(secNumberO1 == 0) {
                    if(o1>o2) return -1;
                    else if(o2>o1) return 1;
                }
            }

            if(secNumberO2>secNumberO1) return 1;
            return secNumberO1 - secNumberO2;
        }
        return firstNumberO1 - firstNumberO2;
    }
}

class TestDto {
    private BigDecimal b;
    private String key;

    public TestDto(BigDecimal b) {
        this.b = b;
    }

    public BigDecimal getB() {
        return b;
    }
}