class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum1=0;
        int sum2=0;
        for(int i:nums)
        {
            if(i<10)
            {
                sum1+=i;
            }
            else if(i<100)
            {
                sum2+=i;
            }
        }
        if(sum1==sum2 )
        {
            return false;
        }
        return true;
    }
}
