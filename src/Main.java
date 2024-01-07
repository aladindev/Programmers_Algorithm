import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 14425
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");

        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < Integer.parseInt(line1[0]) ; i++) set.add(br.readLine());

        int cnt = 0;
        for(int j = 0 ; j < Integer.parseInt(line1[1]) ; j++) {
            if (set.contains(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}