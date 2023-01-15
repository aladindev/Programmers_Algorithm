import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();
		String[] ba = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

		String[] tt = {"hello", "one", "even", "never", "now", "world", "draw"};
		s.solution(2, tt);


	}
}
class Solution {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];

		Set<String> sSet = new LinkedHashSet<>();
		int who = 1;
		sSet.add(words[0]);
		String bfWord = words[0];

		for(int i = 1 ; i < words.length ; i++) {
			who = ++who%n == 0 ? n : who%n;

			if(sSet.contains(words[i])) {
				answer[0] = who;
				answer[1] = (i%n)+1;
				break;
			}

			char lC = bfWord.charAt(bfWord.length()-1);
			char fC = words[i].charAt(0);

			if(lC != fC) {
				answer[0] = who;
				answer[1] = sSet.size()/n+1;
				break;
			}
			sSet.add(words[i]);
			bfWord = words[i];
		}
		return answer;
	}
}