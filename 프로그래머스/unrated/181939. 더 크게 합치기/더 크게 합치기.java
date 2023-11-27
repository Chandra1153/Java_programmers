class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = "";
        String str2 = "";

        str1 = Integer.toString(a) + Integer.toString(b);
        str2 = Integer.toString(b) + Integer.toString(a);
        if (Integer.parseInt(str1) > Integer.parseInt(str2))
            answer = Integer.parseInt(str1);
        else
            answer = Integer.parseInt(str2);
        return answer;
    }
}