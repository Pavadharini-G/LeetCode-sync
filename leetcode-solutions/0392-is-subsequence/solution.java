class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) 
        {
            if (s.charAt(i) == t.charAt(j)) 
            {
                i++;//increments i if sub char is detected like count 
            }
            j++;// go to next char in main to compare
        }
        return i == s.length(); //if no. of matched elements equals no. of elements in substring then it satisfies
    }
}
