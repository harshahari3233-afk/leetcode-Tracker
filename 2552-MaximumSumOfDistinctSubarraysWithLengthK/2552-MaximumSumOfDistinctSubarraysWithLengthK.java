// Last updated: 7/9/2026, 3:06:08 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        long sum=0;
        long max=0;
        int left=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right-left+1>k){
                sum-=nums[left];
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(right-left+1==k && map.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}