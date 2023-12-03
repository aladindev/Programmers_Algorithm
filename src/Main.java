import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Stream;



public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        int[][] data = {
                /*  0      1        2       3 */
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8},
        };

        int[][] result = s.solution(data, "date", 20300501, "remain");

        for(int i = 0 ; i < result.length ; i++) {
            for(int j = 0 ; j < result[i].length ; j++) {
                System.out.print(result[i][j] + " / ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //code	date	maximum	remain

        Map<String, Integer> idxMap = new HashMap<>() {
            {
                put("code",    0);
                put("date",    1);
                put("maximum", 2);
                put("remain" , 3);
            }
        };

        Map<Integer, int[]> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for(int i = 0 ; i < data.length ; i++) {
            if(data[i][idxMap.get(ext)] < val_ext) {
                //map.put(i, data[i]);
                list.add(data[i]);
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[idxMap.get(sort_by)] - o2[idxMap.get(sort_by)];
            }
        });
        int[][] answer = new int[list.size()][idxMap.size()];
        for(int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}



class Box<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}
