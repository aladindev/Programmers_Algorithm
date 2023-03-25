import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        int[] g = {2, 3, 6};
        System.out.println(s.solution(8, 4,  g));
    }
}


class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int hap = 0;
        int cnt = 0;

        for(int i = section.length-1 ; i>=0 ; i--) {
            if(i > 0) {
                hap += section[i] - section[i-1];
                if(m <= hap) {
                    cnt = 0;
                    hap = 0;
                    answer +=1;
                } else {
                    cnt++;
                }
            } else {
                answer += 1;
            }
        }

        return answer;
    }
}