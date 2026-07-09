// Last updated: 7/9/2026, 3:06:50 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=numBottles;
        int total=numBottles;
        while(empty>=numExchange){
            int newempty=empty/numExchange;
            total+=newempty;
            empty=empty%numExchange+newempty;

        }
        return total;
    }
}