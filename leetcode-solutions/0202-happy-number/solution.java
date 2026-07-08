class Solution {
    public boolean isHappy(int n) {
        int t=n;
        int sum=0;
        int count=0;
        while(sum!=1)
        {
            sum=0;
            count++;
            while(t>0)
            {
                sum+=(t%10)*(t%10);
                t/=10;
            }
            t=sum;
            if(count>=20 || sum==4)
            {
                return false;
            }
        }
        return true;
    }
}
