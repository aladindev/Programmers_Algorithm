package Level1JavaFile;

import java.util.Stack;

class 올바른괄호_실패 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) { // 스택 초기화
            st.add(c);
        }
        int cnt = 0;
        while(st.size() > 0) { // 스택이 존재할 때까지 반복

            if(cnt == 0) {
                if(st.peek() == '(') return false;
                cnt++;
                char c = st.pop();
            }

            if(st.peek() == '(') {
                if(cnt>=st.size()) {
                    cnt = st.size();
                }
                for(int j = 0 ; j < cnt ; j++) {
                    char p = st.pop();
                    if(p == ')') return false;
                }
                cnt = 0;
            } else {
                cnt+=1;
                st.pop();
            }
        }

        return answer;
    }
}