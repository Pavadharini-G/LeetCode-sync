class Solution {
    public int hammingWeight(int n) {
        int c=0;
        for(int i=1;i<=32;i++)
        {
            c+=n&1;
            n=n>>1;
        }
        return c;
    }
}
