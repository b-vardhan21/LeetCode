class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int Longest=0;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num : nums){
            hs.add(num);
        }
        
        for(int num : hs){
            
            if(!hs.contains(num-1)){
                int currentnum = num;
                int c = 1;
                while(hs.contains(currentnum+1)){
                    currentnum++;
                    c++;
                }
                Longest = Math.max(Longest, c);
            }
        }
        
        return Longest;
    }
}