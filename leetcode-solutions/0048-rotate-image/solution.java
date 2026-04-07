class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        //without new matrix
        for (int i = 0; i < n; i++)  //transpose of the matrix
        {
            for (int j = i; j < n; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++)   //reverse each row
        {
            int left = 0, right = n - 1;
            while (left < right) 
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        
        //with new matrix

        /*int[][] ans=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=ans[i][j];
            }
        } */
    }
}
