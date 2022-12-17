import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();

		int[] a = {1, 2, 3, 1, 2, 3, 1};
		//int[] a = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		//System.out.println(s.solution(4, 3, a));
		
		String x = "100";
		String y = "203045";
		System.out.println(s.solution(x, y));

	}
}

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        ArrayList<Character> list = new ArrayList<Character>();
        
        for(char c : xArr) {
        	hm.put(c, 1);
        }
        for(char c : yArr) {
        	hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        int cnt = 0;
        for(Entry<Character, Integer> e : hm.entrySet()) {
        	if(e.getValue() > 1) {
        		for(int i = 1 ; i < e.getValue() ; i++) {
        			list.add(e.getKey());
        		}
        		cnt++;
        	}
        }
        if(cnt == 0) {
        	answer = "-1";
        	return answer;
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(Character c : list) 
        	answer += c;
        
        
        if(answer.length() > 1 && answer.charAt(0)=='0') {
        	answer = "0";
        }
        
        return answer;
    }
}










//
////1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
////2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//
////3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
////4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//
////5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//
////6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
////     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
////7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
//
//
//class Solution {
//    public String solution(String new_id) {
// 
//    	
//    	//step1
//    	String str = new_id.toLowerCase();
//    	
//    	//step2
//    	String pattern = "[^a-z\\\\d\\\\-_.]*";
//    	
//
//        boolean regex = Pattern.matches(pattern, str);
//    	
//        if(regex) str = str.replaceAll(pattern, str);
//    	
//    	//step3
//    	char[] cArr = str.toCharArray();
//    	for(int i = 0 ; i < cArr.length ; i++) {
//    		if(i == cArr.length-1) break;
//    		
//    		if(cArr[i]=='.' && cArr[i+1]=='.') {
//    			cArr[i+1] = ' ';
//    		}
//    	}
//    	str = String.valueOf(cArr).trim();
//    	cArr = str.toCharArray();
//    	
//    	//step4
//    	if(cArr[0]=='.') cArr[0] = ' ';
//    	if(cArr[cArr.length-1]=='.') cArr[cArr.length-1] = ' ';
//    	str = String.valueOf(cArr).trim();
//    	
//    	//step5
//    	str = "".equals(str) ? "a" : str;
//    	
//    	//step6
//    	str = str.length()>=16 ? str.substring(0, 15) : str;
//    	
//    	//step7
//    	if(str.length() <= 2) {
//    		while(str.length() < 4) {
//    			str += str.charAt(str.length()-1);
//    		}
//    	}
//    	
//        String answer = str;
//        System.out.println(answer);
//        return answer;
//    }
//}