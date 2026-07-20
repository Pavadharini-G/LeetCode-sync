class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        if(n==1)
        return nums[0];
        dp[1]=nums[1];
        if(n==2)
        return Math.max(dp[0],dp[1]);
        dp[2]=dp[0]+nums[2];
        if(n<=2)
        return dp[n];
        for(int i=3;i<n;i++)
        {
            int t2=Math.max(dp[i-2],dp[i-3]);
            dp[i]=t2+nums[i];
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}
