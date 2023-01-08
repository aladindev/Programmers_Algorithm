package Level2;


/*
 * 
JadenCase 문자열 만들기
문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상 200 이하인 문자열입니다.
s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
숫자는 단어의 첫 문자로만 나옵니다.
숫자로만 이루어진 단어는 없습니다.
공백문자가 연속해서 나올 수 있습니다.
입출력 예
s	return
"3people unFollowed me"	"3people Unfollowed Me"
"for the last week"	"For The Last Week"
 * */

class JadenCase문자열만들 {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        
        
        //  3peoPle
        for(int i = 0 ; i < s.length() ; i++) {
        	char c = s.charAt(i);
        	
        	if((int)c == (int)' ') {
        		sb.append(',');
        		if(i+1 < s.length()) {
        			if((int)s.charAt(i+1) == (int)' ') {
        				sb.append(' ');
        				i+=1;
        			}
        		}
         	} else {
        		sb.append(c);
        	}
        	
        }
        
        String[] strArr = sb.toString().replaceAll(",", ", ").split(",");
        sb.setLength(0);
        
        
        for(int i = 0 ; i < strArr.length ; i++) {
        	String str = strArr[i];
        	
        	char c = ' ';
        	if(str.length()>0) {
        		c = str.charAt(0);
        	} 
        	
        	if(c >= (int)'0' && c<= (int)'9') {
        		sb.append(c);
        		if(str.length() > 1) {
        			sb.append(str.substring(1, str.length()).toLowerCase());	
        		}
        	} else if((int)c == ' ') {
        		String a = str.replaceAll("[a-zA-Z0-9]", ""); //순수 공백 
        		String b = str.replace(" ", ""); //순수 문자열 
        		
        		sb.append(a);
        		if(b.length() > 0) {
        			sb.append(String.valueOf(b.charAt(0)).toUpperCase());
        			if(b.length() > 1) {
        				sb.append(b.substring(1, b.length()).toLowerCase());
        			}
        		}
        		
        	} else {
        		sb.append(String.valueOf(c).toUpperCase());
        		
        		if(str.length() > 1) {
        			sb.append(str.substring(1, str.length()).toLowerCase());
        		}
        	}
        }
        
        return sb.toString();
    }
}