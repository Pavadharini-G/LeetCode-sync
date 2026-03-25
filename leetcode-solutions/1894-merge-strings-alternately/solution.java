class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        int x=0;
        int y=0;
        StringBuilder sb=new StringBuilder();
        while(x<l1 && y<l2)
        {
            sb.append(ch1[x]);
            sb.append(ch2[y]);
            x++;
            y++;
        }
        while(x<l1)
        {
            sb.append(ch1[x++]);
        }
        while(y<l2)
        {
            sb.append(ch2[y++]);
        }
        return sb.toString();
    }
}
