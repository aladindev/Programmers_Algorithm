import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        //String[] a = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        //String[] a = {".#...", "..#..", "...#."};
		//String[] a = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		String[] a = {"..", "#."};
        s.solution(a);

        /*
         *  ..........
         *  .....#....
         *  ......##..
         *  ...##.....
         *  ....#.....
         * */

    }
}


class Solution {
    public int[] solution(String[] wallpaper) {


        int[] answer = new int[4];

        //#가 있는 최소값과 최대값
		int minX = wallpaper[0].length();
		int maxX = -1;
		int minY = 0;
		int maxY = 0;


        for (int i = 0; i < wallpaper.length; i++) {
			String str = wallpaper[i];

			if(str.indexOf("#") < 0) minY++;
			else {
				maxY = i+1;
				for(int j = 0 ; j < str.length() ; j++) {
					if(str.charAt(j) == '#') {
						if(minX > j) minX = j;
						if(maxX < j) maxX = j+1;
					}
				}
			}
		}

		answer[0] = minY;
		answer[1] = minX;
		answer[2] = maxY;
		answer[3] = maxX;
        return answer;
    }
}