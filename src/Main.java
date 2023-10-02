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
        int idx = 0;
        while(iter22.hasNext()) {
            Map.Entry<Integer, Map<Integer, Integer>> ttt = iter22.next();

            List<Integer> keyList = new ArrayList<>(ttt.getValue().keySet());
            Collections.sort(keyList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return ttt.getValue().get(o2) - ttt.getValue().get(o1);
                }
            });

            System.out.println(keyList);

            Map<Integer, Integer> tmpp = new HashMap<>();
            for(int i : keyList) {
                System.out.print(" " + i + " / ");
                tmpp.put(i, ttt.getValue().get(i));
            }
            System.out.println(tmpp);

            result.put(idx++, tmpp);
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