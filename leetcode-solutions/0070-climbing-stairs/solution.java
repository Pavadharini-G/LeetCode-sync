class Solution {
    public int climbStairs(int n) {
        //look at notes option for explaination.
        //below is tabulation approach.
        /*if(n<=3)
        return n;
        int ar[]=new int[n];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        for(int i=3;i<n;i++)
        {
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[n-1];*/

        //memoization approach
        int[] dp=new int[n];
        return fun(dp,n);
    }
    public static int fun(int[] dp,int n)
    {
        if(n<=3)
        return n;
        if(dp[n-1]!=0)
        return dp[n-1];
        return dp[n-1]=fun(dp,n-1)+fun(dp,n-2);
    }
}
