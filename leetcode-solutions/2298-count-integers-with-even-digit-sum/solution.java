class Solution {
    public int countEven(int num) {
        int sum=0,c=0;
        for(int i=1;i<=num;i++)
        {
            int val = i;
            while(val>0)
            {
                sum+=(val%10);
                val=val/10;
            }
            if(sum%2==0)
            {
                c++;
            }
            sum=0;
        }
        return c;
    }
}
