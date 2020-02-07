package exercises;

import java.util.Scanner;

public class CountMovieSpaces2 {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String userEntry;
        System.out.print("Enter your favorite movie quote >> ");
        userEntry = input.nextLine();
        int stringLength = userEntry.length();
        int count = 0;

        for(int i = 0; i < stringLength; i++)
        {
            if(userEntry.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Your favorite movie quote has " + count + " spaces.");

    }

}
