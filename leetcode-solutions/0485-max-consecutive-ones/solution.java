class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0,c=0;
        for(int n:nums)
        {
            if(n==1) c++;
            else
            {
                if(c>a) a=c;
                c=0;
            }
        }
        if(c>=a) a=c;
        System.out.print(a);
        return a;
    }
}
