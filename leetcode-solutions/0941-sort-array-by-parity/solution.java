class Solution {
    public int[] sortArrayByParity(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]%2==1&&nums[j]%2==0)
                {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        return nums;
    }
}
