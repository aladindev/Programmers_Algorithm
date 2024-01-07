import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 27433 - 재귀함수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");

        Set<Long> set = new HashSet<>();
        String[] line2 = br.readLine().split(" ");
        for(String s : line2) {
            set.add(Long.parseLong(s));
        }

        String[] line3 = br.readLine().split(" ");
        String[] line4 = br.readLine().split(" ");

        for(int i = 0 ; i < line4.length ; i++) {
            long pL = Long.parseLong(line4[i]);
            boolean contain = set.contains(pL);

            if(i == line4.length - 1) {
                if(contain) System.out.print("1");
                else System.out.print("0");
            } else {
                if(contain) System.out.print("1 ");
                else System.out.print("0 ");
            }
        }
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}