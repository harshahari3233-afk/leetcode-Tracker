// Last updated: 7/9/2026, 3:07:07 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
    int eve=0;
    int odd=0;
    for(int i=0;i<position.length;i++){  
        if(position[i]%2==0){
            eve++;
        }
        else{
        odd++;
        }
    }
    if(odd<eve){
        return odd;
    }
    return eve;
}
}