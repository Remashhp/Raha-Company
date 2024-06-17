package remas.raha_company_project1;
/**
 *
 * @author Lama
 */

public class CreditCard extends Payment{
    
private long creditCardNum;
private String cardHolderName; 
private int cvv;

public CreditCard(){
creditCardNum=0;
cardHolderName="";
cvv=0;
}

/**
 * 
 * @param creditCardNum
 * @param cardHolderName
 * @param cvv
 * @param price 
 */

public CreditCard(long creditCardNum,String cardHolderName,int cvv,double price){
   super(price);
  this.creditCardNum=creditCardNum;
  this.cardHolderName=cardHolderName;
  this.cvv=cvv;   
}

    /**
     * @return the creditCardNum
     */
    public long getCreditCardNum() {
        return creditCardNum;
    }

    /**
     * @param creditCardNum the creditCardNum to set
     */
    public void setCreditCardNum(long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    /**
     * @return the cardHolderName
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * @param cardHolderName the cardHolderName to set
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * @return the cvv
     */
    public int getCvv() {
        return cvv;
    }

    /**
     * @param cvv the cvv to set
     */
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    
   @Override
    public void makePayment() {
    System.out.println(getPrice()+" was paid from the credit card "+ getCreditCardNum());    
    }
    
    /**
     * 
     * @return the string representation of this object
     */
@Override
    public String toString(){
        
    return ("credit Card Number: "+ getCreditCardNum()+" Name of card holder: "+getCardHolderName()+
            " cvv "+getCvv());
        
    }
    
    /**
     *
     * @param o
     * @return true if the object credit card number equal to o credit card number
     */
    @Override
    public boolean equals(Object o){
     CreditCard c=(CreditCard)o;
     return(this.getCreditCardNum()==c.getCreditCardNum());
    }
}
