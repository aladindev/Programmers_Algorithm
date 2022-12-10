import java.io.IOException;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] a = {0,0,0,0,0,0};
		int[] b = {38, 19, 20, 40, 15, 25};

	}
}

//[1, 3, 4, 6]	"1223330333221"
//[1, 7, 1, 2]	"111303111"

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 0 ; i < food.length ; i++) {
        	for(int j = 0 ; j < food[i]/2 ; j++) {
         		answer += i+1;
        	}
        }
        
        String reverse = new StringBuilder(answer).reverse().toString();
        
        
        return answer + "0" + reverse;
    }
}