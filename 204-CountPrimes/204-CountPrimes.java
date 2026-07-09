// Last updated: 7/9/2026, 3:09:47 PM
class Solution {
    public int countPrimes(int n) {
        boolean[] ispri=new boolean[n+1];
        for(int i=0;i<=n;i++){
            ispri[i]=true;
        }
        int count=0;
        for(int i=2;i*i<n;i++){
            if(ispri[i]){
                for(int j=i*i;j<n;j+=i){
                    ispri[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(ispri[i]){
                count++;
            }
        }
        return count;
        
    }
}