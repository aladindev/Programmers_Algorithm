import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Solution s = new Solution();
		System.out.println(s.solution(5, 25));
	}
}


class Solution {
    public String solution(int a, int b) {
    	
    	// 기준일자가 금요일이니 배열은 금요일부터 시
    	String[] arr = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    	
    	Calendar c1 = Calendar.getInstance();
    	c1.set(2016, 0, 1);
    	Calendar c2 = Calendar.getInstance();
    	c2.set(2016, a-1, b);
    	
    	Date d1 = new Date(c1.getTimeInMillis());
    	Date d2 = new Date(c2.getTimeInMillis());
    	
    	long diffMill = (d2.getTime() - d1.getTime()) / 1000;
    	// 차이 일자 구하기 
    	long diffDay = diffMill / (24*60*60);
    	
    	String answer = "";
    	// 1주일 주기인 7일로 나눈값의 인덱스를 가져온다.
    	answer = arr[(int) (diffDay%7)];
    	
        return answer;
    }
}