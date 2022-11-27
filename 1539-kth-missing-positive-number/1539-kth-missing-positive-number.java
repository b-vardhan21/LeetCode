class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n = arr.length;
        int low = 0;
        int high = n;
        int res = 0;
        while(low<high){
            int mid = low + (high - low)/2;
            
            if((arr[mid] - (mid+1))>=k){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low + k;
    }
    
   
}