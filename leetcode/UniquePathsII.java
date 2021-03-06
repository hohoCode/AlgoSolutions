/*
 * Follow up for "Unique Paths":

 * Now consider if some obstacles are added to the grids. How many unique paths would there be?

 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.

 * For example,

 * There is one obstacle in the middle of a 3x3 grid as illustrated below.

 * [
 *  [0,0,0],
 *  [0,1,0],
 *  [0,0,0]
 * ]
 * The total number of unique paths is 2.

 * Note: m and n will be at most 100.
 *
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int xLen = obstacleGrid.length, yLen = obstacleGrid[0].length;
        int[][] dp = new int[xLen][yLen];
        for(int i = 0; i < xLen; i++) {
            for(int j = 0; j < yLen; j++) {
                if(obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else if(i == 0 && j == 0)
                    dp[i][j] = 1;
                else if(i == 0 && j != 0) 
                    dp[i][j] = dp[i][j - 1];
                else if(i != 0 && j == 0)
                    dp[i][j] = dp[i - 1][j];
                else 
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[xLen - 1][yLen - 1];
    }
}   
