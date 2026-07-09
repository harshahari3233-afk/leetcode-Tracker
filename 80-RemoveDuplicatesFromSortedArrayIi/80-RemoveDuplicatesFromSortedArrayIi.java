// Last updated: 7/9/2026, 3:11:19 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int n=nums.length;
        int re=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                re++;
            }
            else{
                re=0;
            }
            if(re<2){
                nums[count]=nums[i];
                count++;
    
            }
        }
        System.out.print(count);
        return count;
    }
}