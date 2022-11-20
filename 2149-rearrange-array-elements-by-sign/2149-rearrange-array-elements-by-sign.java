class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; 
        int low = 0, high = 1;
        
        for(int i=0;i<n;i++){
            
            if(nums[i]<0){
                res[high] = nums[i];
                high = high + 2;
                
                
            }
            else{
                res[low] = nums[i];
                low = low + 2;
                
            }
            
   
        }
        
        return res;
    }
}