package ValidParanthesis;

import java.util.Stack;

public class LeetCode20Valid {
    public static void main(String[] args) {
    LeetCode20Valid leetCode20Valid = new LeetCode20Valid();
        System.out.println(leetCode20Valid.isValid("(}"));
    }

    public boolean isValid(String s){
        Stack<Character> stackForCharacters = new Stack<>();
        char[] eachBrackets = s.toCharArray();
        for(int i = 0; i< eachBrackets.length;i++){
            if(eachBrackets[i]=='(' || eachBrackets[i]== '{' || eachBrackets[i] == '['){
                stackForCharacters.push(eachBrackets[i]);
            }
            else{
                if(stackForCharacters.isEmpty()){
                    return false;
                }
                if(stackForCharacters.isEmpty()==false && eachBrackets[i]== ')' &&  stackForCharacters.peek().equals('(')){
                    stackForCharacters.pop();
                }
                else if(stackForCharacters.isEmpty()==false && eachBrackets[i]== '}' && stackForCharacters.peek().equals('{')){
                    stackForCharacters.pop();
                }
                else if(stackForCharacters.isEmpty()==false && eachBrackets[i]== ']' && stackForCharacters.peek().equals('[')){
                    stackForCharacters.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stackForCharacters.isEmpty();
    }
}
