// Last updated: 7/9/2026, 3:11:33 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        String last=arr[arr.length-1];
        return last.length();
    }
}