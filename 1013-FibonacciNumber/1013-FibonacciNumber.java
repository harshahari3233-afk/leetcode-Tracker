// Last updated: 7/9/2026, 3:07:25 PM
class Solution {
    public int fib(int n) {
    if(n==0){
        return 0;
    }   
    if(n==1){
        return 1;
    }
    else{
        return fib(n-2)+fib(n-1);
    }
    }
}