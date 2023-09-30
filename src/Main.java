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


    }
}

class Solution {
    public String solution(String input_string) {
        String answer = "";

        Set<Character> set = new TreeSet<>();

        char[] arr = input_string.toCharArray();
        for(char c : arr) {
            // 2개 이상 나타나는 알파벳
            if(input_string.indexOf(c) > -1 && input_string.indexOf(c) != input_string.lastIndexOf(c)) {
                // 붙어있는지 판별
                for(int i = input_string.indexOf(c) ; i < input_string.lastIndexOf(c)+1 ; i++) {
                    if(c != input_string.charAt(i)) {
                        set.add(c);
                    }
                }
            }
        }

        if(set.size() == 0) {
            answer = "N";
            return answer;
        }

        Iterator<Character> iter = set.iterator();
        while(iter.hasNext()) {
            answer += iter.next();
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