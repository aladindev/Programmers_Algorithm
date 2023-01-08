import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



// 시간초과이긴 하지만 맞춘게 어디냐..
public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		s.solution(3);
	}
}

class Solution {
    public int solution(int n) {
    	
    	long[] arr = new long[n+2];
    	arr[0] = 0;
    	arr[1] = 1;
    	for(int i = 2 ; i < arr.length ; i++) {
    		arr[i] = arr[i-1]%1234567 + arr[i-2]%1234567;;
    	}
    	
        return (int)arr[n]%1234567;
    }
}