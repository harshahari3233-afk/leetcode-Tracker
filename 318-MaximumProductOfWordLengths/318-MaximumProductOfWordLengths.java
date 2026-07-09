// Last updated: 7/9/2026, 3:08:48 PM
class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        boolean[][] ch=new boolean[n][26];
        for(int i=0;i<n;i++){
            for(char c: words[i].toCharArray()){
                ch[i][c-'a']=true;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                boolean common=false;
        
            for(int k=0;k<26;k++){
                if(ch[i][k] && ch[j][k]){
                    common=true;
                }
            }
            if(!common){
                max=Math.max(max,words[i].length()*words[j].length());
            }
            }
        }
        return max;
    }
}