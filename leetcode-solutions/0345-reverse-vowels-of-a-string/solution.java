class Solution {
    public String reverseVowels(String st) {
        char[] ch=st.toCharArray();
        int s=0;
        int e=ch.length-1;
        while(s<e)
        {

            while(s<e && ch[s]!='a'&&ch[s]!='e'&&ch[s]!='i'&&ch[s]!='o'&&ch[s]!='u'&&ch[s]!='A'&&ch[s]!='E'&&ch[s]!='I'&&ch[s]!='O'&&ch[s]!='U')
            {
                s++;
            }
            while(s<e && ch[e]!='a'&&ch[e]!='e'&&ch[e]!='i'&&ch[e]!='o'&&ch[e]!='u'&&ch[e]!='A'&&ch[e]!='E'&&ch[e]!='I'&&ch[e]!='O'&&ch[e]!='U')
            {
                e--;
            }
            char temp=ch[s];
            ch[s]=ch[e];
            ch[e]=temp;
            s++;
            e--;
        }
        return new String(ch);
    }
}
