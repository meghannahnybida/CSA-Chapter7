package exercises;

import java.util.Scanner;

public class InputCharacterInfo {

    public static void main(String [] args)
    {
        char userEntry;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character >> ");
        userEntry = input.next().charAt(0);

        System.out.println("The character is " + userEntry);
        if(Character.isUpperCase(userEntry))
            System.out.println(userEntry + " is uppercase");
        else
            System.out.println(userEntry + " is not uppercase");
        if(Character.isLowerCase(userEntry))
            System.out.println(userEntry + " is lowercase");
        else
            System.out.println(userEntry + " is not lowercase");
        userEntry = Character.toLowerCase(userEntry);
        System.out.println("After toLowerCase(), the user entry is " + userEntry);
        userEntry = Character.toUpperCase(userEntry);
        System.out.println("After toUpperCase(), the user entry is " + userEntry);
    }
}
