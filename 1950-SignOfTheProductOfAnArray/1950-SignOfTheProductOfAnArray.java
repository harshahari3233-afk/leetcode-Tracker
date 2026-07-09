// Last updated: 7/9/2026, 3:06:34 PM
class Solution {
    public int arraySign(int[] nums) {
        long prod=1;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                prod*=-1;
            }
            else if(nums[i]>0){
                prod*=1;
            }
            else{
                prod=0;
            }
            }
        System.out.print(prod);
        if(prod>0){
            return 1;
        }
        else if(prod<0){
            return -1;
        }
        return 0;
    }
}