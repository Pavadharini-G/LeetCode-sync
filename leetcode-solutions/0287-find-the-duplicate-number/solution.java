class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            break;
        }
        return nums[i];
        
    }
}
