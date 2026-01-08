class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int i=0,ctr=1;
        while(i<nums.size()&&nums[i]<=0) i++;
        for(;i<nums.size();i++)
        {
            if(nums[i]>ctr)
            {
                return ctr;
            }
            else if(nums[i]==ctr)
            {
                ctr++;
            }
        }
        return ctr;
    }
};
