class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        long sum = 0L;
        long maxsum = nums[0];
        for(int i=0; i<n; i++)
        {
            if(sum < 0)
            {
                sum = 0L;
            }
            sum+=nums[i];
            maxsum = Math.max(sum, maxsum);
        }
        
        return (int) maxsum;
    }
}