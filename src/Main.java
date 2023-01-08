import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


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
        List<LinkedHashMap<String, Integer>> idList = new ArrayList<>();
        for(String s : id_list) {
        	LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        	lhm.put(s,  0);
        	idList.add(lhm);
        }
        
        
        List<Set<String>> setList = new ArrayList<>();
        
        for(int i = 0 ; i < idList.size() ; i++) {
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
        			LinkedHashMap<String, Integer> lh = idList.get(i);
        			//System.out.println(id + " / " + (lh.getOrDefault(id, 0)+1));
        			
        			idList.get(i).put(id, lh.getOrDefault(id, 0)+1);
        			System.out.println(idList.get(i).get(id));
        		}
        	}
        }
        

        Iterator<LinkedHashMap<String, Integer>> t = idList.iterator();
        while(t.hasNext()) {
        	List<Entry<String, Integer>> l = new ArrayList<>(t.next().entrySet());
        	Iterator<Entry<String, Integer>> tt = l.iterator();
        	while(tt.hasNext()) {
        		Entry<String, Integer> e = tt.next();
        		System.out.println(e.getKey() + " / " + e.getValue());
        	}
        }
        
        
        
        return answer;
    }
}

