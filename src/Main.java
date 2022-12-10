import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println( s.solution(a, b));

	}
}


/*
 *  HashMap<K, V> : V는 중복될 수 있으나 K는 중복될 수 없다!!!
 *  반복자 
 *  String     >>hm.keySet()    : keySet 메소드는 해쉬의 키 값만 필요할 경우 사용!
 *  Entry<K,V> >>hm.entrySet()  : entrySet 메소드는 해쉬의 키, 밸류 둘 다 필요할 경우 사용! 
 * */
class Solution {
    public String solution(String[] participant, String[] completion) {
        

    	String answer = "";
    	HashMap<String, Integer> hm = new HashMap<String, Integer>();
    	
    	for(String s : participant) hm.put(s, hm.getOrDefault(s, 1)+1);
    	for(String s : completion) hm.put(s, 0);
    	
    	for(Entry<String, Integer> es : hm.entrySet()) {
    		if(es.getValue() == 1) {
    			answer = es.getKey();
    			break;
    		}
    	}
    	
    	return answer;
    }
}