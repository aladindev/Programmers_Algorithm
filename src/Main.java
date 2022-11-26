import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		System.out.println(s.solution("2three45sixseven"));
		
	}
}


class Solution {
	public int solution(String s) {
    	
    	Map<Integer, String> map = new HashMap<Integer, String>();
    	int answer = 0;
    	
    	map.put(0, "zero");
    	map.put(1, "one");
    	map.put(2, "two");
    	map.put(3, "three");
    	map.put(4, "four");
    	map.put(5, "five");
    	map.put(6, "six");
    	map.put(7, "seven");
    	map.put(8, "eight");
    	map.put(9, "nine");
    	
    	for(int i = 0 ; i < map.size() ; i++) {
    		String str = "" + map.get(i);
    		
    		if(s.contains(str)) {
    			s = s.replace(str, ""+i);
    		}
    	}
        return Integer.parseInt(s);
    }
}