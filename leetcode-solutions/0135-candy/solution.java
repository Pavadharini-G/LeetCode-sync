class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] candy=new int[n];
        for(int i=0;i<n;i++)
        {
            candy[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1]) //check left to right
            {
                candy[i]=candy[i-1]+1;
            }
        }
         for(int i=n-2;i>=0;i--) //check right to left
         {
            if(ratings[i]>ratings[i+1]) 
            {
                candy[i]=Math.max(candy[i],candy[i+1]+1);
            }
        }
        int max=0;
        for(int c:candy)
        {
            max+=c;
        }
        return max;
    }
}
