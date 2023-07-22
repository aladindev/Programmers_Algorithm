import java.io.IOException;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();
        System.out.println((int)Math.pow(10, 1));
        Integer[] a = {3, 30, 34, 5, 9};
        int[] b = {0, 0, 0};
        CustomSort customSort = new CustomSort();
        Arrays.sort(a, customSort);

        for(Integer aa : a) {
            System.out.println(aa);
        }

        System.out.println("--------------------\n result : " + s.solution(b).toString());
    }
}

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        CustomSort customSort = new CustomSort();
        Arrays.sort(arr, customSort);

        StringBuilder sb = new StringBuilder(answer);
        for(int i = arr.length-1 ; i >=0 ; i--) {
            sb.append(arr[i]);
        }
        return sb.toString().startsWith("0") ? "0" : sb.toString();
    }
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
                return 0;
            }
            return secNumberO1 - secNumberO2;
        }
        return firstNumberO1 - firstNumberO2;
    }
}