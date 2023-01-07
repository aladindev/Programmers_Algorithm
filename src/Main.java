import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

				
		
	}
}


class Solution {
    public String solution(String s) {
    	String[] sArr = s.split(" ");
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);

        int[] result = new int[sArr.length];
        int idx = 0;
        for(String str : sArr) {
        	result[idx++] = Integer.parseInt(str);
        }
        
        Arrays.sort(result);
        
        sb.append(result[0] + " ");
        sb.append(result[result.length-1]);
        
        return sb.toString();
    }
}