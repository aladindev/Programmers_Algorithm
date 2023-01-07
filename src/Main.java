import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
	}
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int length = citations.length;
        int cnt = 0;
        
        for(int i = 0 ; i < length ; i++) {
        	for(int j = 0 ; j < length ; j++) {
        		// ...
        	}
        		
        }
        
        return answer;
    }
}