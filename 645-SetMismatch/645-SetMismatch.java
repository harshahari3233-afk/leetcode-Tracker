// Last updated: 7/9/2026, 3:07:51 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        Set <Integer> set=new HashSet<>();
        int[] f=new int[2];
        int sum=0;
        int r=0;
        int asum=n * (n + 1) / 2;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                r=nums[i];
            }
            else{
                set.add(nums[i]);
                sum+=nums[i];
            }
        }
        System.out.print(sum+" "+asum);
        f[0]=r;
        f[1]=asum-sum;
        return f;
    }
}