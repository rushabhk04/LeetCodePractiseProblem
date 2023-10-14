package Twopointersjava;

public class LeetCode2038MediumArrayColors {
    public static void main(String[] args) {
        LeetCode2038MediumArrayColors leetCode2038MediumArrayColors = new LeetCode2038MediumArrayColors();

        System.out.println(leetCode2038MediumArrayColors.winnerOfGame("AAAABBBB"));
    }

    public boolean winnerOfGame(String colors) {

        int countA = 0;
        int countB = 0;



       for(int i =1 ; i<colors.length()-1       ;i++){
           if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
               countA+=1;
           }
           if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
               countB+=1;
           }


        }
      if(countA>countB){
          return true;
      }
      else{
          return false;
      }
    }
}
