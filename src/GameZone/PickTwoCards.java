package GameZone;

public class PickTwoCards {
    //Author: Meghan Nahnybida
    //Date: 2/10/2020

    public static void main(String[] args) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int rand1 = ((int) (Math.random() * suits.length));
        int rand2 = ((int) (Math.random() * suits.length));
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",
                "Queen", "King"};
        int myValue = ((int) (Math.random() * values.length));
        int yourValue = ((int) (Math.random() * values.length));

        Cards myCard = new Cards();
        Cards yourCard = new Cards();



        myCard.setValue(values[myValue]);
        yourCard.setValue(values[yourValue]);
        myCard.setSuit(suits[rand1]);
        yourCard.setSuit(suits[rand2]);

        System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
        System.out.println("Your card is the " + yourCard.getValue() + " of " + yourCard.getSuit());

        if(myValue > yourValue){
            System.out.println("I win");
        }
        else if(yourValue > myValue){
            System.out.println("You win");
        } else{
            System.out.println("It's a tie");
        }
    }

}
