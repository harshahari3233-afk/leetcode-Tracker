// Last updated: 7/9/2026, 3:06:59 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] nn=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j && nums[i]>nums[j]){
                    count++;
                }
                nn[i]=count;
            }
        }
        return nn;
    }
}