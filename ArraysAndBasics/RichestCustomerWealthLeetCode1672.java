import static java.lang.Integer.max;
import static java.lang.Integer.sum;

public class RichestCustomerWealthLeetCode1672 {
    public static void main(String[] args) {
        int[][] accounts ={{1,2,3},{3,2,1}};
        int max = maximumWealth(accounts);
        System.out.println(max);
    }

    //one liner solution

    //return max([sum(account) for account in accounts])
    //time complexity = O(m*n)
    //Space complexity = O(1)
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int person =0; person<accounts.length;person++){
            int sum=0;
            for(int account = 0; account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }


}
