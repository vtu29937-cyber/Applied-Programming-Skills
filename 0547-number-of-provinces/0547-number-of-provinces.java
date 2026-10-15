class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int ans = 0;
        boolean[] v = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!v[i]) {
                dfs(i, isConnected, v);
                ans++;
            }
        }
        return ans;
    }

    private void dfs(int s, int[][] isConnected, boolean[] v) {
        int n = isConnected.length;
        v[s] = true;

        for (int i = 0; i < n; i++) {
            if (isConnected[s][i] == 1 && !v[i]) {
                dfs(i, isConnected, v);
            }
        }
    }
}