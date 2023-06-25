import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {
 
        Solution s = new Solution();

        int[] a = {2,6,8,14};
        System.out.println(s.solution(a));
    }
}


class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        if(arr.length == 1) {
            answer = arr[0];
        } else {
            answer = calculateLCM(arr[0], arr[1]);
            for(int i = 2 ; i < arr.length ; i++) {
                answer = calculateLCM(answer, arr[i]);
            }
        }

        return answer;
    }

    // 최대공약수 계산 메소드
    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return calculateGCD(num2, num1 % num2);
    }

    // 최소공배수 계산 메소드
    public static int calculateLCM(int num1, int num2) {
        int gcd = calculateGCD(num1, num2);
        return (num1 * num2) / gcd;
    }
}