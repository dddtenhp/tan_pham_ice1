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
        
        // add luckyCard (hard-coded) from Github edit
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Hearts");
        
        // search magicHand
        boolean cardFound = false;
        for (Card c : magicHand){
            if(c.getValue() == luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit()) ){
                cardFound = true;
                break;
            }
        }
        
        System.out.println();
        //display result
        if(cardFound)System.out.println("Your card IS in the Magic Hand!!!");
        else System.out.println("Sorry, your card is not in the Magic Hand");
        System.out.println();


    }
    
}
