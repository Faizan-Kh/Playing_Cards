/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playingcards;

/**
 *
 * @author Faizan
 */
public class Cards {
    public int cardNum;
    public String cardCouler;
    private String cardShape;
    
    
    public Cards(int cn, String cc,String cs){
          cardNum=cn;
          cardCouler=cc;
          cardShape=cs;
          System.out.println("card created");
}

    @Override
    public String toString() {
        return "Cards{" + "cardNum=" + cardNum + ", cardCouler=" + cardCouler + ", cardShape=" + cardShape + '}';
    }
    
    public void setCardShape(String cardName) {
        this.cardShape = cardName;
    }
    
    public String getCardShape() {
        return this.cardShape;
    }
    
}
