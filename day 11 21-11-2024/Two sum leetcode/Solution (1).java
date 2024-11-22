class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int i=0;
        int[] sol = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if((nums[i] + nums[j]) == target)
                {
                    sol[0] = i;
                    sol[1] = j;
                    // nums[i] = 0;
                    // nums[j] = 0;
                    break;
                }
            }
        }
        return sol;
    }
}