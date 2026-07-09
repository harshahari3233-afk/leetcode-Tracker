// Last updated: 7/9/2026, 3:07:40 PM
class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       int sl=0;
       int sr=0;
       int[] left=new int[n];
       int[] right=new int[n];
       for(int i=0;i<n;i++){
        left[i]=sl;
        sl+=nums[i];
       }
       for(int i=n-1;i>=0;i--){
        right[i]=sr;
        sr+=nums[i];
       }
       for(int i=0;i<n;i++){
        if(left[i]==right[i]){
            return i;
        }
       }
       return -1;
    }
}