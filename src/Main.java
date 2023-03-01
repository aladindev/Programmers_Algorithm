import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

		//["ABACD", "BCEFD"]	["ABCD","AABB"]
		String[] a = {"ABACD", "BCEFD"};
		String[] b = {"ABCD","AABB"};
		s.solution(a,b);


	}
}


class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];

		Map<Character, Integer> map = new HashMap<>();

		for(int i = 0 ; i < keymap.length ; i++) {
			String str = keymap[i];

			for(int j = 0 ; j < str.length() ; j++) {
				Integer mapVal = map.get(str.charAt(j));
				if(mapVal != null) {
					if(mapVal > j) {
						map.put(str.charAt(j), j+1);
					}
				} else {
					map.put(str.charAt(j), j+1);
				}
			}
		}

		for(int i = 0 ; i < targets.length ; i++) {
			String s = targets[i];
			char[] arr = s.toCharArray();

			int cnt = 0;
			for(int j = 0 ; j < arr.length ; j++) {
				if(map.get(arr[j]) != null) {
					cnt += map.get(arr[j]);
				} else {
					cnt = -1;
					break;
				}
			}
			answer[i] = cnt;
		}

		return answer;
	}
}