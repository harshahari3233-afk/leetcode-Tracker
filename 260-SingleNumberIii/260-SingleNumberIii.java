// Last updated: 7/9/2026, 3:09:04 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] num=new int[2];
        int n=nums.length;
        int xor=0;
        int ga=0;
        int gb=0;
        int i=0;
        for(int j=0;j<n;j++){
           xor=xor^nums[j];
        }
        int mask=xor &(-xor);
        for(int j=0;j<n;j++){
            int an=mask& nums[j];
                if(an==0){
                    ga=ga^nums[j];
                }
                else{
                    gb=gb^nums[j];
                }
            
        }
        num[0]=ga;
        num[1]=gb;
        return num;
    }
}