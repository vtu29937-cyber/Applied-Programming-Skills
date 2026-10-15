class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, grid));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int i, int j, int[][] g) {
    
        if (i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] == 0) {
            return 0;
        }

        g[i][j] = 0;
        return 1 + dfs(i + 1, j, g)
                 + dfs(i - 1, j, g)
                 + dfs(i, j + 1, g)
                 + dfs(i, j - 1, g);
    }
}