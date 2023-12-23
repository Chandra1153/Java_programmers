class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean result;
        if(eq.equals("="))
            result = (ineq.equals(">")) ? (n >= m) : (n <= m);
        else
            result = (ineq.equals(">")) ? (n > m) : (n < m);
        return result ? 1 : 0;
    }
}
