import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 27433 - 재귀함수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(recu(n, 1));
    }
    public static long recu(long n, long hap) {
        if(n == 0) return hap;

        return recu(n-1, hap*n);
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}