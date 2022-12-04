import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		//s.solution(a);
		System.out.println(s.solution(3,1,20));

	}
}


//콜라를 받기 위해 마트에 주어야 하는 병 수 a
//빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b 
//상빈이가 가지고 있는 빈 병의 개수 n
class Solution {
    public int solution(int a, int b, int n) {

    	
    	if(n < a) return 0;
    	
    	int hap = b*(n/a) + n%a;
    	int answer = b*(n/a);
    	answer += solution(a, b, hap);
    	
        return answer;
    }
}