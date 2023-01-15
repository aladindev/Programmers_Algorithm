package Level1JavaFile;
class 문자열나누기_실패 {
    public int solution(String s) {
        int answer = 0;
        int eqCnt = 0;
        int neCnt = 0;
        int idx = 0;

        if(s.length() == 1) return 0;

        int cnt = 0;

        while(s.length() > 0) {

            char x = s.charAt(0);
            if(s.length() == 1) {
                answer += 1;
                break;
            }
            if(x == s.charAt(idx)) eqCnt++;
            else neCnt++;

            if(eqCnt == neCnt) {
                if(s.length()>idx)s=s.substring(idx+1, s.length());
                answer += 1;
                eqCnt = 0;
                neCnt = 0;
                idx=0;
                cnt++;
            } else {
                if(eqCnt + neCnt > s.length()-1) {
                    return answer+cnt;
                }
                idx++;

            }
        }
        return answer;
    }
}
