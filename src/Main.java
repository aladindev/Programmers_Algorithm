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

        int result = s.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}
                , new int[]{3, 2, 2, 2, 1}
                , new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});

        System.out.println(result);

    }
}

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for(int i = 0 ; i < number.length ; i++) {
            wantMap.put(want[i], number[i]);
        }

        int idx = 0;
        int arraySum = Arrays.stream(number).sum();
        while(idx+arraySum < discount.length) {
            Map<String, Integer> tmp = wantMap;
            for(int i = idx ; i < idx+arraySum ; i++) {
                Integer cnt = tmp.get(discount[i]);
                if(cnt != null && cnt != 0) {
                    tmp.put(discount[i], --cnt);
                }
            }
            Iterator<String> keySet = tmp.keySet().iterator();
            int sum = 0;
            while(keySet.hasNext()) {
                sum += tmp.get(keySet.next());
                if(sum != 0) break;
            }
            if(sum == 0) {
                answer += 1;
            }
            idx++;
        }
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