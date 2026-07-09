// Last updated: 7/9/2026, 3:05:50 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        int add=numOnes+numZeros;
        for(int i=0;i<k;i++){
            if(numOnes>k){
                    sum+=1;
            }
            else if(k>add){
                sum=numOnes+numZeros+numOnes-k;
            }
            else if(k>=numOnes){
                sum=numOnes;
            }
        }
        return sum;
    }
}