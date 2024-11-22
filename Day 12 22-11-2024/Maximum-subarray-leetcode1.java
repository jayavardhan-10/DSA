class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        long sum = 0L;
        long sumb = 0L;
        long maxsum = Long.MIN_VALUE;
        long maxi = Long.MIN_VALUE;
        boolean hasposval = false;
        for(int i=0; i<n; i++)
        {
            if(sum+nums[i] > 0 || nums[i]>=0)
            {
                hasposval = true;
                sum+=nums[i];

                System.out.println("num cons:"+nums[i]);
                System.out.println("sum:"+sum);

                maxsum = Math.max(maxsum, sum);

                System.out.println("maxsum:"+maxsum);
                System.out.println();
            }
            else sum=0;
            // for all inputs negative cases
            if(nums[i]<0 || maxi<0 || sumb<0 || hasposval==false)
            {
                if(nums[i] > maxi) maxi = nums[i];
                // sumbelow0+=nums[i];
                // maxsum = Math.max(maxsumbelow0, sumbelow0);
                // System.out.println("maxsum:"+maxsum);
                // System.out.println();
            }
            
        }
        return(hasposval == false) ? (int) maxi : (int) maxsum;
    }
}