// Last updated: 7/9/2026, 3:05:42 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
    int dis=0;
    while(mainTank>=5){
        mainTank-=5;
        dis+=50;
        if(additionalTank>0){
            mainTank+=1;
            additionalTank--;
        }
    }
     dis+=mainTank*10;
     return dis;
    }
}