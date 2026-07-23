import java.util.*;
class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        /*int n=cost.length;
        int[] dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1]; // since v can start from either step 0 r 1, v dont need to find min btwn them and find calc the min cost from step 2.
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[n-1],dp[n-2]);*/
         int n = cost.length;
        dp = new int[n];

        for (int i = 0; i < n; i++)
            dp[i] = -1;

        return Math.min(solve(cost, n - 1), solve(cost, n - 2));
    }
    public int solve(int[] cost, int i) {

        if (i == 0)
            return cost[0];

        if (i == 1)
            return cost[1];

        if (dp[i] != -1)
            return dp[i];

        dp[i] = cost[i] + Math.min(solve(cost, i - 1), solve(cost, i - 2));

        return dp[i];
    }
}
