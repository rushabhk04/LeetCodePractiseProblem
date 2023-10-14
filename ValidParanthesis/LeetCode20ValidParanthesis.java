package ValidParanthesis;
import java.util.Stack;

public class LeetCode20ValidParanthesis {

    public static void main(String[] args) {
        LeetCode20ValidParanthesis leetCode20ValidParanthesis = new LeetCode20ValidParanthesis();
        System.out.println(leetCode20ValidParanthesis.isValid("()"));
    }

    public boolean isValid(String s) {
        Stack<String> paraThesis = new Stack<>();
        char[] characterParanthesis = new char[s.length()];
        characterParanthesis = s.toCharArray();
        for(int i =0; i<s.length();i++){
            char brackets = characterParanthesis[i];
            paraThesis.push(String.valueOf(brackets));
        }

        int countForRoundBracketsOpening = 0;
        int countForRoundBracketsClosing = 0;
        int countForSquareBracketsOpening = 0;
        int countForSquareBracketsClosing = 0;
        int countForCurlyBracketsOpening = 0;
        int countForCurlyBracketsClosing =0;

        for(int j = 0; j <paraThesis.size();j++){
            String eachBrackets = paraThesis.pop();
            System.out.println(eachBrackets);
            switch (eachBrackets){
                case "(":
                    countForRoundBracketsOpening += 1;
                    break;
                case ")":
                    countForRoundBracketsClosing +=1;
                    break;
                case "{":
                    countForCurlyBracketsOpening +=1;
                    break;
                case "}":
                    countForCurlyBracketsClosing +=1;
                    break;
                case "[":
                    countForSquareBracketsOpening +=1;
                    break;
                case "]":
                    countForSquareBracketsClosing +=1;
                    break;
            }
        }
        if(countForRoundBracketsOpening==countForRoundBracketsClosing && countForSquareBracketsOpening==countForSquareBracketsClosing
        && countForCurlyBracketsOpening==countForCurlyBracketsClosing){
            return true;
        }
        return false;
    }

}
