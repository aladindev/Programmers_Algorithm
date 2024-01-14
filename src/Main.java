import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 1269
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);

        String[] line3 = br.readLine().split(" ");
        Set<String> set1 = new HashSet<>();
        for(String s : line3) set1.add(s);

        String[] line4 = br.readLine().split(" ");
        Set<String> set2 = new HashSet<>();
        for(String s : line4) set2.add(s);

        int result = 0;

        Iterator<String> iter1 = set1.iterator();
        while(iter1.hasNext()) {
            String s = iter1.next();
            if(!set2.contains(s)) result++;
        }

        Iterator<String> iter2 = set2.iterator();
        while(iter2.hasNext()) {
            String s = iter2.next();
            if(!set1.contains(s)) result++;
        }

        System.out.println(result);
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}