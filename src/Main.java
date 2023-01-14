import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

		s.solution("baabaa");

		String t = "baabaa";
		String te = "aa";
		System.out.println(s.solution("baabaa"));

	}
}
class Solution
{
	public int solution(String s)
	{
		int answer = -1;
		char[] cArr = s.toCharArray();
		Map<String, String> sMap = new HashMap<>();

		String argTmp = s;

		int idx = 0;
		for(char c : cArr) {
			StringBuilder sb = new StringBuilder();
			sb.append(c);
			sb.append(c);

			String tmp = sb.toString();
			if(sMap.get(tmp) == null) {
				sMap.put(tmp, "");
			}
		}
		//baabaa
		for(int i = 0 ; i < argTmp.length() ; i++) {
			for(String e : sMap.keySet()) {
				if(argTmp.indexOf(e) > -1) {
					argTmp = argTmp.replaceAll(e, "");
				}
			}
		}

		return argTmp.length() == 0 ? 1 : 0;
	}
}