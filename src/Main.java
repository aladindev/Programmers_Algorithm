import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException, ParseException {


        //백준 10814
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        int sum = 0;

        List<Integer> list = new ArrayList<>();
        while(n-- > 0) {
            int l = Integer.parseInt(br.readLine());
            list.add(l);
            sum += l;
        }
        Collections.sort(list);

        System.out.println(sum/5);
        System.out.println(list.get(2));

    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}