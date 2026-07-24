class Solution {

    int MOD = 1000000007;
    Integer[][][] dp;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new Integer[m][n][maxMove + 1];
        return dfs(m, n, maxMove, startRow, startColumn);
    }

    public int dfs(int m, int n, int moves, int row, int col) {
        if (row < 0 || row >= m || col < 0 || col >= n)
            return 1;
        if (moves == 0)
            return 0;
        if (dp[row][col][moves] != null)
            return dp[row][col][moves];

        long ans = 0;

        ans += dfs(m, n, moves - 1, row - 1, col); 
        ans += dfs(m, n, moves - 1, row + 1, col); 
        ans += dfs(m, n, moves - 1, row, col - 1);
        ans += dfs(m, n, moves - 1, row, col + 1); 

        dp[row][col][moves] = (int)(ans % MOD);

        return dp[row][col][moves];
    }
}