// Last updated: 7/9/2026, 3:05:18 PM
class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n + 1];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                len[i + 1] = len[i] + 1;
            } else if (ch == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            } else if (ch == '#') {
                len[i + 1] = len[i] * 2;
            } else {
                len[i + 1] = len[i];
            }
            len[i + 1] = Math.min(len[i + 1], (long) 1e18);
        }

        if (k >= len[n]) {
            return '.';
        }

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                if (k == len[i]) {
                    return ch;
                }
            } else if (ch == '%') {
                k = len[i] - 1 - k;
            } else if (ch == '#') {
                if (len[i] > 0) {
                    k %= len[i];
                }
            } else if (ch == '*') {
                if (len[i] > 0) {
                    if (k == len[i] - 1) {
                        return '.';
                    }
                }
            }
        }

        return '.';
    }
}