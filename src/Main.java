import java.io.IOException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		Solution s = new Solution();
		
		int[][] b = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] move = {1,5,3,5,1,2,1,4};
		
		s.solution(b, move);

	}
}


/* [0,0,0,0,0]
 * [0,0,1,0,3]
 * [0,2,5,0,1]
 * [4,2,4,4,2]
 * [3,5,1,3,1]
 *  1 2 3 4 5
 *  
 * [1,5,3,5,1,2,1,4]
 * */


// 4
// 2
// 4

class Solution {
    public int solution(int[][] board, int[] moves) {
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	int answer = 0;
    	
    	for(int i = 0 ; i < moves.length ; i++) {
    		for(int j = 0 ; j < board.length ; j++) {
    			int x = moves[i]-1;
    			int val = board[j][x];
    			
    			if(val != 0) {
    				board[j][x] = 0;
    				if(stack.isEmpty()) {
    					stack.push(val);
    				} else {
    					int bf = stack.peek();
    					if(bf == val) {
    						answer += 1;
    						stack.pop();
    					} else {
    						stack.push(val);
    					}
    				}
    				
    				break;
     			}
    		}
    	}
        return answer*2;
    }
}