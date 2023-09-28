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
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left) + 1];
        int[][] arr = new int[n][n];

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                if(j > i) arr[i][j] = j+1;
                else arr[i][j] = i+1;
            }
        }

        int[] array = new int[(int)Math.pow(arr.length, 2)];

        //test TODO
//        for(int i = 0 ; i < arr.length ; i++) {
//            for(int j = 0 ; j < arr[i].length ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int cnt = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                array[cnt++] = arr[i][j];
            }
        }

//        for(int i = 0 ; i < array.length ; i++) {
//            System.out.print(array[i] + " ");
//        }

        int idx = 0;
        while(left <= right) {
            answer[idx++] = array[(int)left];
            left++;
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