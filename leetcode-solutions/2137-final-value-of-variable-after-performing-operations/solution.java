class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(String n:operations)
        {
            switch(n)
            {
                case "--X":a=a-1;
                break;
                case "X--":a=a-1;
                break;
                case "++X":a=a+1;
                break;
                case "X++":a=a+1;
                break;
            }
        }
        System.out.println(a);
        return a;
    }
}
