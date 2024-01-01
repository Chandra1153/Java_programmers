class Solution {
    public int solution(int[] num_list) {
        String odd = "", even = "";

        for (int n : num_list) {
            if (n % 2 == 1)
                odd += Integer.toString(n);
            else
                even += Integer.toString(n);
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}