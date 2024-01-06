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
        int key = 1;

        Map<Integer, String[]> map = new HashMap<>();

        while(n-- > 0) {
            map.put(key++, br.readLine().split(" "));
        }

        List<Integer> sortKeyList = new ArrayList<>(map.keySet());

        Collections.sort(sortKeyList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Integer.parseInt(map.get(o1)[0]) > Integer.parseInt(map.get(o2)[0])) {
                    return Integer.parseInt(map.get(o2)[0]) - Integer.parseInt(map.get(o1)[0]);
                } else if(Integer.parseInt(map.get(o1)[0]) < Integer.parseInt(map.get(o2)[0])) {
                    return Integer.parseInt(map.get(o1)[0]) - Integer.parseInt(map.get(o2)[0]);
                } else {
                    return o1 - o2;
                }
            }
        });

        for(Integer i : sortKeyList) {
            System.out.println(map.get(i)[0] + " " + map.get(i)[1]);
        }
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}