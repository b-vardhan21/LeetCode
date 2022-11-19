class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            
            else{
                hm.put(nums[i],1);
            }
            
            if(hm.get(nums[i])>n/2){
                return nums[i];
            }
        }
        
        return 0;
        
        
    }
}