import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
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
        
        
        
/* 
         muzi frodo
         apeach frodo 
         frodo neo 
         muzi neo 
         apeach muzi
        
*/
        
        // 초기화 
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        for(String s : id_list) {
        	lhm.put(s,  0);
        }
        
        List<Set<String>> setList = new ArrayList<>();
        
        for(int i = 0 ; i < id_list.length ; i++) {
        	setList.add(new LinkedHashSet<>());
        }
        
        for(int i = 0 ; i < id_list.length ; i++) {
        	for(String s : report) {
        		String[] arr = s.split(" ");
        		
        		if(id_list[i].equals(arr[1])) {
        			setList.get(i).add(arr[0]);
        		}
        	}
        }
        
        for(int i = 0 ; i < setList.size() ; i++) {
        	Set<String> set = setList.get(i);
        	
        	if(set.size() >= k) {
        		Iterator<String> iter = set.iterator();
        		while(iter.hasNext()) {
        			String id = iter.next();
        			lhm.put(id, lhm.getOrDefault(id, 0)+1);
        			
        		}
        	}
        }
        
        int idx = 0;
        for(Entry<String, Integer> e : lhm.entrySet()) {
        	//System.out.println(e.getKey() + " / " + e.getValue());
        	answer[idx++] = e.getValue();
        }
        

        
        
        return answer;
    }
}

