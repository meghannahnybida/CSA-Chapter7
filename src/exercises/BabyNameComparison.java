package exercises;

import java.util.Scanner;

public class BabyNameComparison {

    public static void main(String [] args)
    {
        String name1;
        String name2;
        String name3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name #1 >> ");
        name1 = input.nextLine();
        System.out.print("Enter name #2 >> ");
        name2 = input.nextLine();
        System.out.print("Enter name #3 >> ");
        name3 = input.nextLine();

        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);
    }
}
