// Last updated: 7/15/2026, 8:52:48 AM
1class Solution {
2
3    public void solveSudoku(char[][] board) {
4        solve(board);
5    }
6
7    private boolean solve(char[][] board) {
8        for (int row = 0; row < 9; row++) {
9            for (int col = 0; col < 9; col++) {
10
11                if (board[row][col] == '.') {
12
13                    for (char num = '1'; num <= '9'; num++) {
14
15                        if (isValid(board, row, col, num)) {
16                            board[row][col] = num;
17
18                            if (solve(board)) {
19                                return true;
20                            }
21
22                            board[row][col] = '.';
23                        }
24                    }
25
26                    return false;
27                }
28            }
29        }
30        return true;
31    }
32
33    private boolean isValid(char[][] board, int row, int col, char num) {
34
35        // Check row
36        for (int i = 0; i < 9; i++) {
37            if (board[row][i] == num) {
38                return false;
39            }
40        }
41
42        // Check column
43        for (int i = 0; i < 9; i++) {
44            if (board[i][col] == num) {
45                return false;
46            }
47        }
48
49        // Check 3x3 box
50        int startRow = (row / 3) * 3;
51        int startCol = (col / 3) * 3;
52
53        for (int i = startRow; i < startRow + 3; i++) {
54            for (int j = startCol; j < startCol + 3; j++) {
55                if (board[i][j] == num) {
56                    return false;
57                }
58            }
59        }
60
61        return true;
62    }
63}