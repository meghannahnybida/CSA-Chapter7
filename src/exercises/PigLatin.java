package exercises;

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userEntry;
        System.out.println("Enter a word >>");
        userEntry = translator(input.nextLine());

        if(userEntry == "-1")
        {
            System.out.println("Pig latin is not possible for this word.");
        } else {
            System.out.println(userEntry);
        }
    }

    static boolean isVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    static String translator(String entry) {
        int length = entry.length();
        int pos = -1;
        //pos checks for position of the first vowel
        for(int i = 0; i < length; i++){
            if(isVowel(entry.charAt(i))){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            return "-1";
        }

        return entry.substring(pos) + entry.substring(0, pos) + "ay";
    }

}
