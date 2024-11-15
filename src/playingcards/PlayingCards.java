/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playingcards;

/**
 *
 * @author Faizan
 */
public class PlayingCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cards eightOfDiamond =new Cards(8,"Red","Diamond");
        System.out.println("Number of card is: "+eightOfDiamond.cardNum + "\nColor of card is: " +  eightOfDiamond.cardCouler + "\nxShape of Card is: " + eightOfDiamond.getCardShape());
        
    }
    
}
