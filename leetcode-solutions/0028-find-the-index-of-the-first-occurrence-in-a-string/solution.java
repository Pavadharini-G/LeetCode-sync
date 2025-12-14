class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }
        return -1;
        /*char[] hay=haystack.toCharArray();
        char[] nee=needle.toCharArray();
        int index=-1,flag=0;//match=0,till=0;
        if(hay.length < nee.length)
        {
            return index;
        }
        for(int i=0;i<hay.length;i++)
        {
            if(hay[i]==nee[till])
            {
                index=i;
                int flag=1;
                for(int h=i,n=0;n<nee.length;h++,n++)
                {
                    if(hay[h]!=nee[n])
                    flag=0;
                }
                if(flag==1)
                return index;
            }
        }
        index=-1;
        return index;*/
    }
}
