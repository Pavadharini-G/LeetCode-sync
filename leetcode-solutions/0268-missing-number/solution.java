class Solution {
    public int missingNumber(int[] nums) {
        int m,n=nums.length,flag=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[j]==i)
                flag=1;
            }
            if(flag==0)
            {
                return i;
            }
            flag=0;
        }
        return 0;
    }
}
