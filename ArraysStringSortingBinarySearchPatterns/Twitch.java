package ArraysStringSortingBinarySearchPatterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Twitch {
    public static void main(String[] args) {
        String[] email = {"ninja@twitch.tv","NiNjA@TwiTch.Tv","nINJA@tWITCH.TV","N1NJA@TWITCH.tV","N0RTHERNLION@lion.com","NORTHERNLION@lion.com"};
        int stringOfEmail = emailVerification(email);
        System.out.println(stringOfEmail);
    }
    public static int solution(String[] input) {
        Set<String> set = new HashSet<>();
        for (String email : input) {
            int indexOfAt = email.indexOf('@');
            String front = email.substring(0, indexOfAt).toLowerCase();
            int index = front.indexOf('+');
            if (index >= 0) {
                front = front.substring(0, index);
            }
            front = front.replaceAll("\\.", "");
            String finalString = front + email.substring(indexOfAt);
            set.add(finalString.toLowerCase());
        }
        return set.size();
    }

    static int emailVerification(String[] input){
        for(String stringOfEmails: input){
            String[] arrayOfStringAfterSplit = stringOfEmails.split("\\@");
            System.out.println(Arrays.toString(arrayOfStringAfterSplit));
            String userName = arrayOfStringAfterSplit[0].toLowerCase();
            String domainName = arrayOfStringAfterSplit[1].toLowerCase();

        }
        return 0;
    }
}
