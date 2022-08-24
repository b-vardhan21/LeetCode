class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        int temp = n/2;
        int i=0;
        while(i<=temp){
            if(Math.pow(3,i)>n){
                return false;
            }
            if(Math.pow(3,i)==n){
                return true;
            }
            i++;
        }
        return false;
    }
}