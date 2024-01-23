class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] > numLog[i-1])
                answer = answer + ((numLog[i] - numLog[i-1]) == 1 ? 'w' : 'd');
            else 
                answer = answer + ((numLog[i-1] - numLog[i]) == 1 ? 's' : 'a');
        }
        return answer;
    }
}