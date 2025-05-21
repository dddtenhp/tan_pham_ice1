// Name: Tan Pham         Student ID: 991727296
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Tan Pham         Student ID: 991727296
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random ran = new Random();
        
        // make cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            c.setValue(ran.nextInt(13) + 1);
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            magicHand[i] = c;
        }
        // display
        for (Card c : magicHand){
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Scanner scan = new Scanner(System.in);
        Card userCard = new Card();
        // choose card value
        while (true){
            System.out.print("Enter a card value (1-13): ");
            try{
                int userInput = Integer.parseInt(scan.nextLine());
                if(userInput >= 1 && userInput <= 13) {
                    userCard.setValue(userInput);
                    break;
                }
                 else System.out.println("The range is from Ace to King only!");
            } 
            catch(NumberFormatException e){
                System.out.println("Don't try anything else!");
            }
        }
        // choose card suit
        while (true){
            System.out.print("Enter a suit (0-3 where 0=Heart, 1=Diamonds, 2=Clubs, 3=Spades): ");
            try{
                int userInput = Integer.parseInt(scan.nextLine());
                switch (userInput){
                    case 0:
                        userCard.setSuit("Heart");
                        break;
                    case 1:
                        userCard.setSuit("Diamonds");
                        break;
                    case 2:
                        userCard.setSuit("Clubs");
                        break;
                    case 3:
                        userCard.setSuit("Spades");
                        break;
                    default: 
                        System.out.println("The range is from Heart to Spades only!");
                }
                break;
            } 
            catch(NumberFormatException e){
                System.out.println("Don't try anything else!");
            } 
        }
        
        // search magicHand
        boolean cardFound = false;
        for (Card c : magicHand){
            if(c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit()) ){
                cardFound = true;
                break;
            }
        }
        
        System.out.println();
        //display result
        if(cardFound)System.out.println("Your card IS in the Magic Hand!!!");
        else System.out.println("Sorry, your card is not in the Magic Hand");
        System.out.println();

        // add luckyCard (hard-coded) from Github edit
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        lucyCard.setSuit("Hearts");
    }
    
}
