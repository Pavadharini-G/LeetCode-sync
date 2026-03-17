class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c0=0;
        int c1=0;
        for(char c:s.toCharArray())
        {
            if(c=='1')
            c1++;
            else 
            c0++;
        }
        StringBuilder sb=new StringBuilder();
        sb.append("1".repeat(c1-1));
        sb.append("0".repeat(c0));
        sb.append("1");
        return sb.toString();
    }
}
