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
        

        System.out.println(box.get() instanceof Toy);
        System.out.println(t);


        List<TestDto> list = Arrays.asList(new TestDto(BigDecimal.valueOf(100000000))
                                         ,new TestDto(BigDecimal.valueOf(200000000))
                                        ,new TestDto(BigDecimal.valueOf(300000000))
        );

        Stream<List<TestDto>> streams = Stream.of(list);



    }
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < citations.length ; i++) {
            int a = citations[i];
            int cnt = 0;
            for(int j = 0 ; j < citations.length ; j++) {
                if(citations[j] >= a) {
                    cnt += 1;
                }
            }
            if(cnt >= a) {
                set.add(a);
            }
        }

        return Collections.max(set);
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