class Solution {
    public String reverseWords(String s) {
        //s=s.trim();
        String[] str=s.split(" ");
        StringBuilder ss=new StringBuilder();
        for(String word:str)
        {
            StringBuilder sb=new StringBuilder(word);
            
            ss.append(sb.reverse()).append(" ");
        }
        String rev=ss.toString().trim();
        
        return rev;
    }
}
