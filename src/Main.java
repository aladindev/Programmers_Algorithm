import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 10814
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        String[] students = br.readLine().split(" ");

        int cutLineIdx = Integer.parseInt(line[1]) - 1;
        Arrays.sort(students, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2) - Integer.parseInt(o1);
            }
        });
        System.out.println(students[cutLineIdx]);
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}