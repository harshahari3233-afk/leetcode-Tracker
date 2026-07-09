// Last updated: 7/9/2026, 3:08:12 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<> ();
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n];
        for(int i=0;i<m;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                int pre=stack.pop();
                map.put(pre,nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            int pre=stack.pop();
            map.put(pre,-1);
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(nums1[i]);
        }
        return arr;
    }
}