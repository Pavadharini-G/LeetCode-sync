class Solution {
    public int arraySign(int[] nums) {
        int n_count=0;
        for(int i: nums)
        {
            if(i==0)
            return 0;
            if(i<0)
            n_count++;
        }
        if(n_count%2==0)
        return 1;
        else
        return -1;
    }
}
