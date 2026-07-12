class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int l=flowerbed.length;
        for(int i=0;i<l;i++)
        {
            if(flowerbed[i]==1)
            count++;
        }
        if(l==1 && n==1)
        {
            if(count==0)
            return true;
            else
            return false;
        }
        //System.out.println(6);
        if((l-count)<n)
        {
            return false;
        }
        
        int i=0;
        while(n>0 && i<l)
        {
            if(flowerbed[i]==0)
            {
                if(i==0)
                {
                    if(flowerbed[i+1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else if(i==l-1)
                {
                    if(flowerbed[i-1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else if(flowerbed[i-1]==0 && flowerbed[i+1]==0)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }
            i++;
        }
        if(n==0)
        {
            return true;
        }
        else
        return false;
    }
}
