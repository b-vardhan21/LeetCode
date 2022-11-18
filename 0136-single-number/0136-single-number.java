class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        int sum1 = 0, sum2 = 0;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            sum1 = sum1+nums[i];
        }
        
        for(int x : hs)
        {
            sum2 = sum2 + x;
        }
        
        sum2 = 2*sum2;
        return sum2-sum1;
    }
}