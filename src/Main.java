import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {


        //백준 7785
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");

        TreeSet<String> set = new TreeSet<>();
        for(int i = 0 ; i < Integer.parseInt(line1[0]) ; i++) {
            String[] tmp = br.readLine().split(" ");
            if("enter".equals(tmp[1])) set.add(tmp[0]);
            else if("leave".equals(tmp[1])) set.remove(tmp[0]);
        }

        List<String> toList = new ArrayList<>(set);
        Collections.sort(toList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for(String s : toList) System.out.println(s);
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}