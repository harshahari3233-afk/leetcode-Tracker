// Last updated: 7/9/2026, 3:07:47 PM
class Solution{
    public boolean hasAlternatingBits(int n){
        int x=n>>1;
        int y=x^n;
        int z=y+1;
        if((y&z)!=0){
            return false;
        }
        return true;
    }
}






// class Solution {
//     public boolean hasAlternatingBits(int n) {
//         int y=n>>1;
//         int alter=0;
//         while(n!=0){
//             if((n&1)==(y&1)){
//                 alter=1;
//                 break;
//             }
//             n=n>>1;
//             y=y>>1;
//         }
//         if(alter==0){
//             return true;
//     }
//         else{
//             return false;
//         }
//     }
// }