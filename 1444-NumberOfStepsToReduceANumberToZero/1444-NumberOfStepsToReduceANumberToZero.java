// Last updated: 7/9/2026, 3:07:01 PM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            count++;
            if(num%2==0){
                num=num/2;
            }
            else num=num-1;
        }
        return count;
    }
}