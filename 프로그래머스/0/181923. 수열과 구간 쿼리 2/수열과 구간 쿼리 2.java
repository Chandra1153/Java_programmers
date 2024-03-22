import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int tmp = Arrays.stream(arr).max().getAsInt() + 1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2])
                    if (arr[j] < tmp) tmp = arr[j];
            }
            answer[i] = tmp != Arrays.stream(arr).max().getAsInt() + 1 ? tmp : -1;
        }
        return answer;
    }
}