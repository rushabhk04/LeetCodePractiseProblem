package DynamicProgrammingLeetCodeSeries;

public class UniquePaths2LeetCode63 {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        UniquePaths2LeetCode63 uniquePaths2LeetCode63 = new UniquePaths2LeetCode63();
        System.out.println(uniquePaths2LeetCode63.uniquePathsWithObstacles(obstacleGrid));
    }


        public int uniquePathsWithObstacles(int[][] obstacleGrid) {


            int rows = obstacleGrid.length;
            int columns = obstacleGrid[0].length;
            int[][] dp = new int[rows][columns];
            boolean flag = false;

            for(int i = 0; i<columns;i++){
                if(flag || obstacleGrid[0][i]==1){
                    flag = true;
                    dp[0][i]=0;
                }
                else{
                    dp[0][i]=1;
                }
            }

            flag = false;

            for(int i = 0; i<rows;i++){
                if(flag || obstacleGrid[i][0]==1){
                    flag = true;
                    dp[i][0]=0;
                }
                else{
                    dp[i][0]=1;
                }
            }



            for(int i =1; i<rows;i++){
                for(int j = 1; j<columns; j++){
                    if(obstacleGrid[i][j]==1){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    }
                }
            }
            return dp[rows-1][columns-1];
        }




}
