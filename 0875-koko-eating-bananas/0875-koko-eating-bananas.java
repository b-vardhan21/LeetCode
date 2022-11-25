class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1;
        int right = 1000000000;
        //int speed=Integer.MAX_VALUE;
        while(left <= right){
            int k = left + (right - left)/2;
            
            if(CanEatInTime(piles, k , h)){
                //speed = k;
                right = k - 1;
            }
            else{
                left = k + 1;
            }
            
        }
        
        return left;
    }
    
    boolean CanEatInTime(int[] piles, int k, int h){
        long hours = 0;
        for(int pile : piles){
            int div = pile/k;
            hours += div;
            if(pile % k!=0) hours++;
        }
        
        return hours <= h;
    }
}