import java.io.IOException;
import java.text.ParseException;



public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
//		String a = "3people unFollowed me";

		String a = "  a";

		s.solution(a);
	}
}

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        
        
        //a  AAa
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
        			sb.append(str.substring(1, str.length()));	
        		}
        	} else if((int)c == ' ') {
        		String a = str.replaceAll("[a-zA-Z]", ""); //순수 공백 
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
        
        System.out.print(sb.toString());
        
        return sb.toString();
    }
}