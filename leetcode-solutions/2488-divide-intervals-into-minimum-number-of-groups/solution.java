import java.util.*;
class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int answer = 0;

        for (int[] interval : intervals) {

            int start = interval[0];
            int end = interval[1];

            // Reuse a group only if it ends BEFORE this interval starts
            if (!pq.isEmpty() && pq.peek() < start) {
                pq.poll();
            }

            pq.offer(end);

            answer = Math.max(answer, pq.size());
        }

        return answer;
    }
}
