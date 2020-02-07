package exercises;

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        //str.insert(1, "black")
        //str.append(" in the dead of ")
        Scanner input = new Scanner(System.in);
        String userEntry;
        System.out.print("Enter a word >> ");
        userEntry = input.nextLine();
        int stringLength = userEntry.length();
        //char vowels{'a', 'e', 'i', 'o', 'u'};
        StringBuilder str = new StringBuilder(userEntry);

        boolean check = true;
        //while (check) {
            if (userEntry.charAt(0) == 'a' || userEntry.charAt(0) == 'o' || userEntry.charAt(0) == 'i'
                    || userEntry.charAt(0) == 'u' || userEntry.charAt(0) == 'e') {
                System.out.println(userEntry + " becomes " + userEntry + "ay");
            }else if(){
                System.out.println(userEntry + " becomes " + userEntry.substring(1, userEntry.length()) + userEntry.charAt(0) + "ay");
            }
            else {
                System.out.println(userEntry + " becomes " + userEntry.substring(2, userEntry.length()) +
                        userEntry.charAt(0) + userEntry.charAt(1) + "ay");
            }
        }

    }
//}
