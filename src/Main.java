
public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int result = s.solution(10);
	}

}

class Solution {
    public int solution(int n) {
        int answer = 0;

        int x = 1; // 나머지가 1이 되는 가장 작은 자연수 x

        /**
         * n-1과 같아질 때까지 반복하며
         * 몫이 1이상, 나머지가 1인 값 탐색 
         */
        while(x < n) {
        	if( (n / x >= 1) && (n % x == 1))
        		break;
        }
        answer = x;
        
        return answer;
    }
}
