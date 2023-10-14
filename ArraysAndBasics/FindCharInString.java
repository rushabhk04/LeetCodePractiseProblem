public class FindCharInString {
    public static void main(String[] args) {
        String name = "Rushabh";
        char toBeMatched = 'j';
        boolean ifFound = searchChar(name,toBeMatched);
        System.out.println(ifFound);

    }

    //search with for each loop as well
    static boolean searchChar(String name,char toBeMatched){
        for(int i =0;i<name.length();i++){
            if(toBeMatched == name.charAt(i)){
                return true;
            }
        }

        for(char c: name.toCharArray()){
            if(toBeMatched==c){
                return true;
            }
        }
        return false;
    }

}

