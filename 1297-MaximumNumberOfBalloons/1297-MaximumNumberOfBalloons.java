// Last updated: 7/9/2026, 3:07:16 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        int n=text.length();
        for(int i=0;i<n;i++){
            char ch=text.charAt(i);
            freq[ch-'a']++;
        }
        return Math.min(
            Math.min(freq['b' - 'a'], freq['a' - 'a']),
            Math.min(
                Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2),
                freq['n' - 'a']
            )
        );
    }
}