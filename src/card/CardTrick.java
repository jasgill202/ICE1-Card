/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author: Jasmeet Gill
 * Student Number: 991280576
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        String suits[] = {"Hearts","Diamonds","Spades","Clubs"};
        
        for (int i=0; i<magicHand.length; i++)
        {
            
        Random rand= new Random();
        int randnumb=rand.nextInt(suits.length);
            
            Card c = new Card();
            c.setValue((int) (Math.random() *13)+1);
            c.setSuit(suits[randnumb]);
            
            magicHand[i]=c;
        }
        
        for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1);
        }
        //insert code to ask the user for Card value and suit, create their card
     
        
       
        System.out.println("Enter a card value (1-13): ");
        Scanner scanner= new Scanner(System.in);
        int valcard= scanner.nextInt();
        
       
        
        System.out.println("Enter a card suit (0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3= Clubs): ");
        int sucard=scanner.nextInt();
  
        
          Card userCard = new Card();
        userCard.setValue(valcard);
        userCard.setSuit(suits[sucard]);
        
        boolean check=false;
        for (Card magicHand1 : magicHand) {
            if (userCard.getValue() == magicHand1.getValue() && userCard.getSuit().equals(magicHand1.getSuit())) {
                System.out.println("Your card is in the magic hand!");
                check=true;
                break;
            } 
        }
        if (check==false){
        System.out.println("Sorry, your card is not in the magic hand!");
        }
        
        
        // and search magicHand here
        
    
        //Then report the result here
        
        
        // add one luckcard hard code 2,clubs

         Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        
        boolean luckyCheck=false;
        for (Card magicHand1 : magicHand) {
            if (luckyCard.getValue() == magicHand1.getValue() && luckyCard.getSuit().equals(magicHand1.getSuit())) {
                System.out.println("Your lucky card is in the magic hand!");
                luckyCheck=true;
                break;
            } 
        }
        if (luckyCheck==false){
        System.out.println("Sorry, your lucky card is not in the magic hand!");
        }
    }
}
