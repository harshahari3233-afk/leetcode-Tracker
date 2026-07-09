// Last updated: 7/9/2026, 3:06:05 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double k=celsius+273.15;
        double f=(celsius*1.80)+32.00;
        double[] a={k,f};
        return a;
    }
}