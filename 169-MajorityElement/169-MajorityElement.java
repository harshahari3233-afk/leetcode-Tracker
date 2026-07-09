// Last updated: 7/9/2026, 3:10:19 PM
class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        if(map.get(nums[i])>n/2){
            return nums[i];
        }
       }
       return -1;
    }
}