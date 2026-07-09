// Last updated: 7/9/2026, 3:08:00 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1=new int[26];
        int[] f2=new int[26];
        int left=0;
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0;i<n1;i++){
            f1[s1.charAt(i)-'a']++; 
        }
        int m=s2.length();
        for(int r=0;r<m;r++){
            f2[s2.charAt(r)-'a']++;
            if(r>=n1){
                f2[s2.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(f1,f2)){
                return true;
            }
        }
        return false;
    }
}