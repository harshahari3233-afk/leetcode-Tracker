// Last updated: 7/9/2026, 3:07:44 PM
class Solution {
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        grid[r][c] = 0; // mark visited

        int area = 1;

        for (int k = 0; k < 4; k++) {
            area += dfs(grid, r + dr[k], c + dc[k]);
        }

        return area;
    }
}