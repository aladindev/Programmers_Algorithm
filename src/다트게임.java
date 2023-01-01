import java.util.ArrayList;
import java.util.List;

public class 다트게임 {
    public int solution(String dartResult) {
    	
    	
    	String[] options = dartResult.split("[0-9]");
    	String[] nums = dartResult.replaceAll("[^0-9]", " ").split(" ");
    	int answer = 0;
    	
    	
    	List<String> optList = new ArrayList<>(); 
    	for(String s : options) {
    		if(!"".equals(s)) {
    			optList.add(s);
    		}
    	}
    	
    	List<Integer> numList = new ArrayList<>();
    	for(String s : nums) {
    		if(!"".equals(s)) {
    			numList.add(Integer.parseInt(s));
    		}
    	}
    	
    
//    	점수는 0에서 10 사이의 정수이다.
//    	보너스는 S, D, T 중 하나이다.
//    	옵선은 *이나 # 중 하나이며, 없을 수도 있다.
    	//1S*2T*3S
    	//1^1 * 2 * 2 + 2^3 * 2 + 3^1
    	
//    	1S2D*3T* //72
//    	1S*2D*3T* //74
    	
    	//1S2D*3T*
    	//1^1*2 + 2^2*2*2 + 3^3*2 = 2 + 16 + 54 = 72
    	
    	
    	int bf = 0;
    	for(int i = 0 ; i < numList.size() ; i++) {
    		String str = optList.get(i);
    		int temp = 0;
    		int val = numList.get(i);
    		for(int j = 0 ; j < str.length() ; j++) {
    			
    			char c = str.charAt(j);
    			
    			if(c == 'S') {
    				temp = val;
    			} else if(c == 'D') {
    				temp = (int)Math.pow(val, 2);
    			} else if(c == 'T') {
    				temp = (int)Math.pow(val, 3);
    			} else if(c == '*') {
    				answer += bf;
    				temp = temp*2;
    			} else if(c == '#') {
    				temp = temp*-1;
    			}
    		}
    		bf = temp;
    		answer += temp;
    	}    	
    	
        return answer;
    }
}
