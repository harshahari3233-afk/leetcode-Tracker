// Last updated: 7/9/2026, 3:07:05 PM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        int x2=coordinates[1][0];
        int y2=coordinates[1][1];
        int d1=x2-x1;
        int d2=y2-y1;
        int n=coordinates.length;
        for(int i=2;i<n;i++){
            int x=coordinates[i][0];
            int y=coordinates[i][1];
            if(((y-y1)*d1)!=(x-x1)*d2){
                return false;
            }
        }
        return true;
    }
}