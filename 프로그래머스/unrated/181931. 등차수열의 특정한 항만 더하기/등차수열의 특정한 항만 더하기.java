class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0, ret = 0;
        for(boolean b : included) {
            ret = (ret == 0) ? (ret + a) : (ret + d);
            if (b)
                answer += ret;
        }
        return answer;
    }
}