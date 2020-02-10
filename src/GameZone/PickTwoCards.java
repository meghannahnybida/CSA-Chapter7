package GameZone;

import java.util.Random;

public class PickTwoCards {
    //Author: Meghan Nahnybida
    //Date: 2/10/2020

    public static void main(String[] args) {

        final int CARDS_IN_SUIT = 13;
        String[] suitsString = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int rand1 = ((int) (Math.random() * suitsString.length));
        int rand2 = ((int) (Math.random() * suitsString.length));
        int myValue;
        int yourValue;

        Cards myCard = new Cards();
        Cards yourCard = new Cards();

        myValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        yourValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);

        myCard.setValue(myValue);
        yourCard.setValue(yourValue);
        myCard.setSuit(suitsString[rand1]);
        yourCard.setSuit(suitsString[rand2]);

        System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
        System.out.println("Your card is the " + yourCard.getValue() + " of " + yourCard.getSuit());

        if(myValue == 13){
            myCard.setValue(myValue) == "King";
        }

        if(myValue > yourValue){
            System.out.println("I win");
        }
        else if(yourValue > myValue){
            System.out.println("You win");
        }
        else{
            System.out.println("It's a tie");
        }
    }

}
