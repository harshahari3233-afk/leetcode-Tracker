// Last updated: 7/9/2026, 3:08:35 PM
class Solution {
    public int firstUniqChar(String s) {
        int index=0;
        int f=0;
        for(int i=0;i<s.length();i++){
            f=0;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    f=1;
                    break;
                }
            }
            if(f==0){
                return i;
            }
        }
        return -1;
    }
}