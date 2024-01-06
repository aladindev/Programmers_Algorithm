import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException, ParseException {


        //백준 10814
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        while(n-- > 0) {
            set.add(br.readLine());
        }
        List<Object> list = Arrays.asList(set.stream().toArray());
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1.toString().length() > o2.toString().length()) return 1;
                else if(o1.toString().length() < o2.toString().length()) {
                    return -1;
                } else {
                    return o1.toString().compareTo(o2.toString());
                }
            }
        });

        for(Object o : list) {
            System.out.println(o.toString());
        }
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}