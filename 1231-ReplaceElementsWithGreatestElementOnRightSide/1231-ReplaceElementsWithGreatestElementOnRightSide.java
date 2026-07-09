// Last updated: 7/9/2026, 3:07:14 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int greater=-1;
        int[] b=new int[len];
        for(int i=len-1;i>=0;i--){
            int pre=arr[i];
            arr[i]=greater;
            if(pre>greater){
                greater=pre;
            }
        }
        return arr;
    }
}