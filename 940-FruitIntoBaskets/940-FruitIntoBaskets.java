// Last updated: 7/9/2026, 3:07:30 PM
class Solution {
    public int totalFruit(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>2){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}