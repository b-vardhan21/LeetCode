class Solution {
    public int beautySum(String s) {
        
        int res = 0, len = s.length();
        
        for(int i = 0;i<len;i++){
            int[] arr = new int[26];
            for(int j=i;j<s.length();j++){
                int min = Integer.MAX_VALUE;
		        int max = Integer.MIN_VALUE;
                arr[s.charAt(j) - 'a']++;
                for(int x : arr){
                    if(x!=0){
                        max = Math.max(x, max);
                        min = Math.min(x, min);
                        
                    }
                }
                res = res+max-min;
                    
            }
        }
        
        return res;
    }
}