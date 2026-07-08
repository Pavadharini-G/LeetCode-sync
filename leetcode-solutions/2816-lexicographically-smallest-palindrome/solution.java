import java.util.*;
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] str=s.toCharArray();
        int n=str.length;
        int i=0,j=n-1;
        while(i<j)
        {
            if(str[i]!=str[j])
            {
                if(str[i]<str[j])
                str[j]=str[i];
                else
                str[i]=str[j];
            }
            i++;
            j--;
        }
        return new String(str);
    }
}
