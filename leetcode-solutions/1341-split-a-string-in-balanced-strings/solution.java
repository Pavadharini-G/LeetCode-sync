class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int b=0;
        char[] str=s.toCharArray();
        for(char ch:str)
        {
            if(ch=='R')
            {
                b++;
            }
            else
            {
                b--;
            }
            if(b==0)
            c++;
        }
        return c;
    }
}
