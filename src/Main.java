import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		System.out.println(s.solution(10));

	}
}

class Solution {
	public int solution(int n) { 
	      int answer = 0; 
	      boolean[] prime = new boolean [n+1]; 
	      for(int i=2; i<=n ; i++) 
	      prime[i]=true; //2~n번째수를 true로 초기화 
	      
	      //제곱근 구하기 
	      int root=(int)Math.sqrt(n); 
	      for(int i=2; i<=root; i++){ //2~루트n까지 검사 
	      if(prime[i]==true){ //i번째의 수가 소수일 때 
	      	 for(int j=i; i*j<=n; j++) //그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문) 
	             prime[i*j]=false; 
	         } 
	      } 
	      
	      for(int i =2; i<=n; i++) { 
	      if(prime[i]==true)
	         answer++; 
	      } 
	      return answer; 
	  }
}

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        
//        for(int i = n ; i > 1 ; i--) {
//        	int a = isSosu(i);
//        	answer += a;
//        }
//        
//        return answer;
//    }
//    
//    public int isSosu(int n) {
//    	
//    	int cnt = 2;
//    	for(int i = (int)Math.sqrt(n) ; i > 1 ; i--) {
//    		if(n%i == 0)  {
//    			cnt++;
//    			break;
//    		}
//    	}
//    	
//    	return cnt==2? 1 : 0;
//    }
//}
