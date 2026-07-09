// Last updated: 7/9/2026, 3:05:28 PM
class Solution {
    public char kthCharacter(int k) {
        StringBuilder word=new StringBuilder("a");
        while(word.length()<k){
            int n=word.length();
            for(int i=0;i<n;i++){
                char c='0';
                if(word.charAt(i)=='z'){
                     c='a';
                }
                else{
                     c=(char)(word.charAt(i)+1);
                    
                }
                word.append(c);
            }
        }
        return word.charAt(k-1);
    }
}