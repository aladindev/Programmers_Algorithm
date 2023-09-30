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

        s.solution(3, 2, 5);
    }
}

class Solution {

    //TODO 시간초과!!
    /** ㅅㅓㄹ명대로 하면 시간초과 !!
     * 설명 외의 방법으로 풀어야 함....*/


    /**
     *          0     1     2     3
     *   i = 0  1     2     3     4
     *   i = 1  2     2     3     4
     *   i = 2  3     3     3     4
     *   i = 3  4     4     4     4
     * */

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left) + 1];
        int[][] arr = new int[n][n];
        int[] array = new int[(int)Math.pow(arr.length, 2)];


        int idx = 0;
        for(long i = left ; i <= right ; i++) {
            int row = (int) (i/(long)n-1);
            int col = (int) (i%(long)n-1);

            answer[idx++] = Math.max(row+2, col+2);
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