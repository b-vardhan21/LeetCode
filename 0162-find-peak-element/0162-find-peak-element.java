class Solution {
    public int findPeakElement(int[] nums) {
        
//         HashSet<Integer> hs = new HashSet<Integer>();
        
//         for(int i : nums){
//             hs.add(i);
//         }
//         Object obj = Collections.max(hs);
//         int target = (Integer)obj;
        
//         int l = 0;
//         int h = nums.length - 1;
        
//         while(l<=h){
//             int m = l + (h -l)/2;
            
//             if(nums[m] == target){
//                 return m;
//             }
//             else if(nums[m]>target){
//                 h = m - 1;
                
//             }
//             else{
//                 l = m + 1;
//             }
//         }
//         return 0;
        
        
        
        
        int l = 0;
        int h = nums.length - 1;
        
        while(l<h){
            int m = l + (h -l)/2;
            
            if(nums[m]>nums[m+1]){
                h = m;
                
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }
}