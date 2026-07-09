// Last updated: 7/9/2026, 3:08:10 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<2*n;i++){
            int num=nums[i%n];
            while(!stack.isEmpty() && nums[stack.peek()]<num){
                arr[stack.pop()]=num;
            }
            if(i<n){
                stack.push(i);
            }
        }  
        return arr; 
    }
}