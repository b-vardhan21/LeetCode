class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        return fun(num,steps);
    }
    public int fun(int num,int steps){
        if(num == 0){
            return steps;
        }
        if(num%2==0){
            return fun(num/2, steps+1);
        }
        return fun(num-1, steps+1);
    }
}