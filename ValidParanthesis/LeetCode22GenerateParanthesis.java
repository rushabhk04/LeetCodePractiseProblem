package ValidParanthesis;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22GenerateParanthesis {
    public static void main(String[] args) {
        int n = 2;
        LeetCode22GenerateParanthesis leetCode22GenerateParanthesis = new LeetCode22GenerateParanthesis();
        List<String> finalPrinting = leetCode22GenerateParanthesis.generateParanthesis(n);
        System.out.println(finalPrinting);

    }

    private List<String> generateParanthesis(int n) {
        List<String> result = new ArrayList<>();
        recursiveCall(result,0,0,"",n);
        return result;
    }

    private void recursiveCall(List<String> result, int left, int right, String stringOfBrackets, int n) {
        if(stringOfBrackets.length()==n*2){
            result.add(stringOfBrackets);
            return;
        }
        if(left<n){
            recursiveCall(result,left+1,right,stringOfBrackets+"(",n);
        }

        if(right<left){
            recursiveCall(result,left,right+1,stringOfBrackets+")",n);
        }
    }
}
