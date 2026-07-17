class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[k++]=nums1[i++];
            }
            else
            {
                arr[k++]=nums2[j++];
            }
        }
        while(i<m)
        arr[k++]=nums1[i++];
        while(j<n)
        arr[k++]=nums2[j++];

        int l=0;
        int r=arr.length-1;
        if(arr.length%2!=0)
        {
            int mid=(l+(r-l))/2;
            double ans=arr[mid];
            return ans;
        }
        else
        {
            int mid1=(l+(r-l))/2;
            int mid2=mid1+1;
            double ans=(arr[mid1]+arr[mid2])/(double)2;
            return ans;
        }

    }
}
