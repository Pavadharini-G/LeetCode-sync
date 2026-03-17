class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
        /*if(n==1)
        return true;//since 2^0=1
        int ans=1;
        while(ans!=n&& ans<n)
        {
            ans=ans*2;
        }
        if(ans==n)
        return true;
        else
        return false;*/
    }
}
