import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 / Programmers 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();

        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < line1.length() ; i++) {
            for(int j = i ; j <= line1.length() ; j++) {
                String s = line1.substring(i, j);
                if(s.length() > 0) set.add(line1.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}