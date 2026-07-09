// Last updated: 7/9/2026, 3:08:24 PM
class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        int count=0;
        Arrays.sort(nums, (a,b) -> a[1] - b[1]);
        int start=nums[0][0];
        int end=nums[0][1];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i][0]<end){
                count++;
            }
            else{
                end=nums[i][1];
            }
        }
        return count;
    }
}