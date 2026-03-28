class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int ans;
                if(i%2==0)
                {
                    ans=(j + k) % n;
                }
                else
                {
                    ans=(j - k % n + n) % n;
                }
                if(mat[i][j]!=mat[i][ans])
                return false;
            }
        }
        return true;
    }
}
