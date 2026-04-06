class Solution {
    public int passThePillow(int n, int time) {
        int t=time/(n-1);
        time=time%(n-1);
        if(t%2==1)
        {
            return n-time;
        }
        return time+1;
    }
}
