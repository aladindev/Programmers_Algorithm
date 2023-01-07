import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] p = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		s.solution(today, terms, p);
				
		
	}
}
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = null;
        
        Map<String, Integer> map = new LinkedHashMap<>();
        
        for(int i = 0 ; i < terms.length ; i++) {
        	String[] temp = terms[i].split(" ", -1);
        	
        	map.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = sf.parse(today);
        Calendar tdCal = Calendar.getInstance();
        tdCal.setTime(date);
        tdCal.add(Calendar.DATE, 1);
        
        String result = "";
        StringBuilder sb = new StringBuilder(result);
        
        
        
        for(int j = 0 ; j < privacies.length ; j++) {
        	String[] arr = privacies[j].split(" ");
        	
            Date date2 = sf.parse(arr[0]);
            Calendar stdrCal = Calendar.getInstance();
            stdrCal.setTime(date2);
            stdrCal.add(Calendar.MONTH, map.get(arr[1]));
            
            
            if(tdCal.compareTo(stdrCal) > 0) {
            	sb.append((j+1) + " ");
            }
        }
        
        String[] strArr = sb.toString().split(" ");
        answer = new int[strArr.length];
        
        for(int k = 0 ; k < answer.length ; k++) {
        	answer[k] = Integer.parseInt(strArr[k]);
        }
        
        return answer;
    }
}