// Last updated: 7/9/2026, 3:10:38 PM
class Solution {
    public int longestConsecutive(int[] nums) {
    int n=nums.length;
    Set <Integer> set=new HashSet<>();
    for(int i=0;i<n;i++){
    set.add(nums[i]);
    }
    int max=0;
    for(int num:set){
        if(!set.contains(num-1)){
            int num1=num;
            int count=1;
            while(set.contains(num1+1)){
                count++;
                num1++;
            }
            max=Math.max(max,count);
        }

    }
    return max;
}
}