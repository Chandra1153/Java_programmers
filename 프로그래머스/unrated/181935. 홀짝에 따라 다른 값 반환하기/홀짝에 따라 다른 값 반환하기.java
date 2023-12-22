class Solution {
    public int solution(int n) {
        int answer = 0, i = 0;
        if (n % 2 == 1) {
            i = 1;
            while (i <= n) {
                answer += i;
                i += 2;
            }
        }
        else {
            i = 2;
            while (i <= n) {
                answer += Math.pow(i, 2);
                i += 2;
            }
        }
        return answer;
    }
}