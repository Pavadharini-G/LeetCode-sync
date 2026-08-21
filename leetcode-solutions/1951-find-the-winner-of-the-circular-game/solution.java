class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1;i<=n;i++)
            {
                arr.add(i);
            }
        int pos=0;
        while(arr.size()>1)
            {
                pos=(pos+k-1)%arr.size();
                arr.remove(pos);
            }
        return arr.get(0);
    }
}
