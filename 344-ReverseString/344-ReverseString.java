// Last updated: 7/9/2026, 3:08:40 PM
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int left=0;
        int right=n-1;
        while(right>left){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}