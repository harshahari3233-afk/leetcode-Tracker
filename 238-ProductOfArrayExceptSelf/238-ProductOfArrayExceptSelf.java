// Last updated: 7/9/2026, 3:09:14 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] p=new int[n];
         p[0]=1;
        for(int i=1;i<n;i++){
            p[i]=p[i-1]*nums[i-1];
        }
        int s=1;
        for(int i=n-1;i>=0;i--){
            p[i]=p[i]*s;
            s=s*nums[i];
        }
        return p;
    }
}