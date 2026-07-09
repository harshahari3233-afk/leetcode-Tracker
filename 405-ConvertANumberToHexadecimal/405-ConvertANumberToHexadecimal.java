// Last updated: 7/9/2026, 3:08:30 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        String h = "";


            while (num != 0) {
                int digit = num&15;

                if (digit < 10) {
                    h = (char)('0' + digit) + h;
                } else {
                    h = (char)('a' + (digit - 10)) + h;
                }

                num>>>=4;;
            }

        return h;
    }
}