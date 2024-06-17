
package remas.raha_company_project1;
/**
 *
 * @author Lama 
 */

public class Cash extends Payment {
    
 private double pricePaid;
 public Cash(){
     pricePaid =0.0;
 }
 
 /**
  * 
  * @param pricePaid
  * @param price 
  */
 public Cash(double pricePaid,double price){
     super(price);
     this.pricePaid=pricePaid;
 }
 
 
    /**
     * @return the pricePaid
     */
    public double getPricePaid() {
        return pricePaid;
    }

    
    /**
     * @param pricePaid the pricePaid to set
     */
    public void setPricePaid(double pricePaid) {
        this.pricePaid = pricePaid;
    }

    
    @Override
    public void makePayment() {
   double r= this.getPrice()-this.getPricePaid();
   
   System.out.println("the amount paid "+getPricePaid()+" service price "+ getPrice()+ "remaining amount "+r);
    }
 
  /**
   * 
   * @return the string representation of this object
   */  
 @Override
 public String toString(){
  
     return "The price paid is "+getPricePaid() ;  
 }
 
 /**
  * 
  * @param o
  * @return true if the object price paid equal to o credit price paid 
  */
 @Override
 public boolean equals(Object o){
   Cash c=(Cash)o;
   
     return this.getPricePaid()==c.getPricePaid();
}

}
