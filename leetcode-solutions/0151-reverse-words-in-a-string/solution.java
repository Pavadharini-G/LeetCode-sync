import java.util.*;
class Solution {
    public String reverseWords(String s) {
        s=s.trim();// remove leading & trailing spaces
        String[] str=s.split("\\s+");// split by one or more spaces
        int l=0;
        int r=str.length-1;
        while(l<r)
        {
            String temp=str[l];
            str[l]=str[r];
            str[r]=temp;
            l++;
            r--;
        }
        s=String.join(" ",str);
        
        return s;
    }
}
