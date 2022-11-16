class Solution {
    public void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[c] = nums[i];
                c++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i] = res[i];
        }
        
    }
}