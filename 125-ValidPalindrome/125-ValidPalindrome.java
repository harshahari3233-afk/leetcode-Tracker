// Last updated: 7/9/2026, 3:10:40 PM
class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n=s1.length();
        int left=0;
        for(int r=n-1;r>=0;r--){
            if(s1.charAt(r)!=s1.charAt(left)){
                System.out.print(s1.charAt(r)+" "+s1.charAt(left));
                return false;
            }
            left++;
            
        }
        return true;
    }
}