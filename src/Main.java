import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Stream;



public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Solution s = new Solution();

        String[] arr = {"OSO","OOO","OXO","OOO"};
        //String[] arr = {"SOO","OXX","OOO"};
        //String[] arr = {"SOO","OOO","OOO"};

        String[] op = {"E 2","S 3","W 1"};
        //String[] op = {"E 2","S 2","W 1"};
        //String[] op = {"E 2","S 2","W 1"};

        System.out.println(s.solution(arr, op)[0] + " / " + s.solution(arr, op)[1]);

    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        return null;

    }
}