// Last updated: 7/9/2026, 3:07:38 PM
class Solution {
    public int[] dailyTemperatures(int[] num) {
        Stack <Integer> stack=new Stack<>();
        int n=num.length;
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            int count=0;
            while(!stack.isEmpty() && num[stack.peek()]<num[i]){
                int id=stack.pop();
                arr[id]=i-id;
            }
            stack.push(i);
        }
        return arr;
    }
}