class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int n = nums.length;
        int left = 1;
        int right = Integer.MAX_VALUE;
        
        int result = Integer.MAX_VALUE;
        
        if(n == threshold){
            int max = Integer.MIN_VALUE;
            for(int num : nums){
                max = Math.max(max, num);
                
            }
            return max;
        }
        
        while(left<=right){
            int mid = left + (right - left)/2;
            
            if(SmallestDivisor(nums, threshold, mid)){
                result = Math.min(mid, result);
                right = mid - 1;
            }
            else left = mid + 1;
            
        }
        
        return result;
        
    }
        public boolean SmallestDivisor(int[] nums, int threshold, int mid){
            int sum = 0;
            for(int x : nums){
                sum += (int) Math.ceil(x * 1.0 /mid);
                
            }
            
            return threshold>=sum;
        }
    
}