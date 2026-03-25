class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        /*while(k>0)
        {
            int temp=nums[n-1];
            for(int i=n-1;i>0;i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            k--;
        }
        System.out.println(nums);*/
        k = k % n; // using this to split the array in two 

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
