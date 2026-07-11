class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans=new ArrayList<>();
        int n=s.length();
        int[] last=new int[26];
        for(int i=0;i<n;i++)
        {
            last[s.charAt(i)-'a']=i;
        }
        int l=0;
        int r=0;
        for(int i=0;i<n;i++)
        {
            r=Math.max(r,last[s.charAt(i)-'a']);
            if(i==r)
            {
                ans.add(r-l+1);
                l=i+1;
            }
        }
        return ans;
    }
}
