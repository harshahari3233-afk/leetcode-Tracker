// Last updated: 7/9/2026, 3:07:24 PM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return a(nums,k)-a(nums,k-1);
    }
    private int a(int[] nums,int k){
    Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int count=0;
        int left=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int s=map.get(nums[i]);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=i-left+1;
            
        }
        return count;
    }
}