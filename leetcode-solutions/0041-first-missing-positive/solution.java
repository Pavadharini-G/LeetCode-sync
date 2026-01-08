class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int num=1;
        for(int n:nums)
        {
            if(n==num)
            {
                num++;
                
            }
        }
        System.out.println(num);
        return num;
    }
}

