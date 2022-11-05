
public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println("" + s.solution(121));
		
	}

}

class Solution {
    public long solution(long n) {
        long answer = 0;

        // 제곱근을 반환하는 Math 함수 
        Double d = Math.sqrt(n);
        
        // intValue와 d가 같으면, 즉 제곱근에 소수점이 없다
        if( d == d.intValue()) {
        	// 제곱함수 
        	return (long)Math.pow(d+1, 2);
        }
       
        return -1;
    }
}


