package DynamicProgrammingLeetCodeSeries;

public class UniquePaths1LeetCode62 {
    public static void main(String[] args) {
        UniquePaths1LeetCode62 uniquePaths1LeetCode62 = new UniquePaths1LeetCode62();
        System.out.println(uniquePaths1LeetCode62.uniquePaths(3,2));
    }
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];

            for(int i =0; i<m;i++){
                for(int j =0; j<n;j++){
                    if(i==0||j==0){
                        dp[i][0]=1;
                        dp[0][j]=1;
                    }
                    else{
                        dp[i][j]= dp[i-1][j]+dp[i][j-1];
                    }

                }
            }
            return dp[m-1][n-1];
        }

}
