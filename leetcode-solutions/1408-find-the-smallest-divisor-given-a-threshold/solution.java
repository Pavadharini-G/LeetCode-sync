class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        /*int divisor= 1;
        while(true)
        {
            int sum=0;
            for(int n:nums)
            {
                sum+=(n+divisor-1)/divisor;
            }
            if(sum<=threshold )
                return divisor;
            
            divisor++;  
        }
        //return divisor;*/
        int low = 1;
    int high = 0;

    // Find the maximum number
    for (int n : nums) {
        high = Math.max(high, n);
    }

    while (low < high) {
        int divisor = low + (high - low) / 2;
        int sum = 0;

        for (int n : nums) {
            sum += (n + divisor - 1) / divisor;

            // No need to continue if already too large
            if (sum > threshold) {
                break;
            }
        }

        if (sum <= threshold) {
            // This divisor works, try a smaller one
            high = divisor;
        } else {
            // This divisor is too small
            low = divisor + 1;
        }
    }

    return low;
    }
}
