import java.io.IOException;
import java.text.ParseException; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        int[] g = {1, 3};
        System.out.println(s.solution(5, 4,  g));
    }
}


class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        for(int i = section.length-1 ; i>=0 ; i--) {
            if(i>0) {
                int diff = section[i]-section[i-1];

                if(m > diff) i--;
            }
            answer++;
        }

        return answer;
    }
}