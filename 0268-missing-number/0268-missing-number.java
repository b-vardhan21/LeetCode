class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        int[] temp = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]] = 1;
        }
        
        for(int i=0;i<temp.length;i++){
           if(temp[i]==0){
               res = i;
           }
        }
        return res;
    }
}