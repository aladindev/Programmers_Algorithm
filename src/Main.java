
public class Main {

	public static void main(String[] args) {
		
	}

}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 전제조건 배열a와 배열b의 길이는 같다.
        for(int i = 0 ; i < a.length ; i++) {
        	answer += a[i]*b[i];
        }
        return answer;
    }
}
