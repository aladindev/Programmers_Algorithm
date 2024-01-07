import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 1764
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new HashSet<>();
        for(int i = 0 ; i < Integer.parseInt(line1[0]) ; i++) set1.add(br.readLine());
        for(int i = 0 ; i < Integer.parseInt(line1[1]) ; i++) set2.add(br.readLine());

        Set<String> result = new TreeSet<>();

        int large = Integer.parseInt(line1[0]) > Integer.parseInt(line1[1]) ? Integer.parseInt(line1[0]) : Integer.parseInt(line1[1]);
        Set<String> largeClone = set2.size() > set1.size() ? set2 : set1;
        Set<String> smallClone = set2.size() > set1.size() ? set1 : set2;
        for(String s : largeClone) {
            if(smallClone.contains(s)) result.add(s);
        }
        System.out.println(result.size());
        for(String s : result) System.out.println(s);
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}