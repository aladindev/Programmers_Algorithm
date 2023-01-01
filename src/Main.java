import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		
		s.solution(survey, choices);
		
	}
}


//지표 번호	성격 유형
//1번 지표	라이언형(R), 튜브형(T)
//2번 지표	콘형(C), 프로도형(F)
//3번 지표	제이지형(J), 무지형(M)
//4번 지표	어피치형(A), 네오형(N)

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<Integer, Integer> scoreMap = new HashMap<>();
        scoreMap.put(1, 3);
        scoreMap.put(2, 2);
        scoreMap.put(3, 1);
        scoreMap.put(4, 0);
        scoreMap.put(5, -1);
        scoreMap.put(6, -2);
        scoreMap.put(7, -3);
        
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
//        Iterator<Map.Entry<Character, Integer>> test1 = map.entrySet().iterator();
//        while(test1.hasNext()) {
//        	Entry<Character, Integer> e = test1.next();
//        	System.out.println(e.getKey() + " / " + e.getValue());
//        }
//        
//        System.out.println("======");
        
        
        for(int i = 0 ; i < survey.length ; i++) {
        	char[] cArr = survey[i].toCharArray();
        	char key = cArr[0];
        	map.put(key, map.getOrDefault(key, 0)+ scoreMap.get(choices[i]));
        }
        

//        Iterator<Map.Entry<Character, Integer>> test2 = map.entrySet().iterator();
//        while(test2.hasNext()) {
//        	Entry<Character, Integer> e = test2.next();
//        	System.out.println(e.getKey() + " / " + e.getValue());
//        }
        
        Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();
        
        while(iter.hasNext()) {
        	Entry<Character, Integer> entry = iter.next();
        	char f = entry.getKey();
        	int fVal = entry.getValue();
        	
        	entry = iter.next();
        	
        	char s = entry.getKey();
        	int sVal = entry.getValue();
        	
        	if(fVal > sVal) {
        		answer += f;
        	} else if(sVal > fVal) {
        		answer += s;
        	} else { // 같은 경우 
        		answer += f<s ? f : s;
        	}
        	
        }
        
        //System.out.println(answer);
        
        return answer;
    }
}