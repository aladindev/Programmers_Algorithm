import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Solution s = new Solution();

		Map<Character, Integer> map = new HashMap<>();
		map.put('c', 1);

		Integer cnt = map.get('r');
		System.out.println(cnt);

		cnt = map.get('c');
		System.out.println(cnt);


	}
}


class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];

		List<Map<Character, Integer>> list = new ArrayList<>();

		for(int i = 0 ; i < keymap.length ; i++) {
			Map<Character, Integer> map = new HashMap<>();
			for(int j = 0 ; j < keymap[i].length() ; j++) {
				map.put(map.get(keymap[i].charAt(j)) != null ? '-' : keymap[i].charAt(j) , j);
			}
			list.add(map);
		}

		for(int i = 0 ; i < targets.length ; i++) {
			String str = targets[i];

			int cnt = 0;
			for(int j = 0 ; j < str.length() ; j++) {
				char c = str.charAt(j);
				
			}
		}
		return answer;
	}
}