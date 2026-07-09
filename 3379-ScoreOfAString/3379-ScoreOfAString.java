// Last updated: 7/9/2026, 3:05:34 PM
class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}