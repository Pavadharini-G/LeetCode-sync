class Solution {
    public boolean checkValidString(String s) {
        int min=0; // min possible unmatched parenthesis
        int max=0; // max possible unmatched parenthesis
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                min++;
                max++;
            }
            else if(ch == ')')
            {
                min--;
                max--;
            }
            else
            {          // '*'
                min--; //coz it might be a pair & reduce the unmatched ones
                max++; //coz it might be smthing else & increase unmatched ones
            }
            if(max < 0)
                return false;
            if(min < 0)
                min = 0;
        }
        return min==0;
    }
}
