public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
            // makes the first column 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
            // makes the first row 1;
        }
        // so in the nested loops we calculate the number of ways by which we can reach the given cell in the 2D array
        // here the robot can just arrive at this cell by 2 ways : 
        // 1. Either through the cell above the current one 
        // 2. Or from the or the cell at the left of the current one 

        // so if we find out the number of ways the top cells and the left side cells can be reached by the robot and add it 
        // we get the total number of ways the robot can reach that cell

        // the first row and first column are made 1 as you can reach those only through 1 way , either all from the top or all from the left 

        // for God's sake revise this 
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        return dp[m-1][n-1];
    }
}