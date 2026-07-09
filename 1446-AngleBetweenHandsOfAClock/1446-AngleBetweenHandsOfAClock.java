// Last updated: 7/9/2026, 3:06:57 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double mina=minutes*6;
        double minh=hour*30+minutes*0.5;
        double diff = Math.abs(mina - minh);
        return Math.min(diff, 360 - diff);
    }
}