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
		
		s.solution(id_list, report, k);
	}
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 신고자 별 받는 메일 개수 담는 
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for(String s : id_list) {
        	result.put(s,  0);
        }
        
        //개인별 신고자 id를 담고 있는 Set
        Map<String, Set<String>> map = new LinkedHashMap<>();

	    for(int i = 0 ; i < id_list.length ; i++) {
	    	map.put(id_list[i], new LinkedHashSet<>());
	    }
        
        for(int i = 0 ; i < report.length ; i++) {
        	String[] arr = report[i].split(" ");
        	Set<String> newSet = map.get(arr[1]);
        	
        	if(!newSet.contains(arr[0])) {
        		newSet.add(arr[0]);
        	}
        	map.put(arr[1], newSet);
        }
        
        for(int i = 0 ; i < map.size() ; i++) {
        	Set<String> s = map.get(id_list[i]);
        	if(s.size() >= k) {
        		Iterator<String> iter = s.iterator();
        		while(iter.hasNext()) {
        			String key = iter.next();
        			result.put(key, result.getOrDefault(key, 0)+1);
        		}
        	}
        }
        
        int idx = 0;
        for(Entry<String, Integer> e : result.entrySet()) {
        	answer[idx++] = e.getValue();
        }
        return answer;
    }
}

