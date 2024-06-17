package remas.raha_company_project1;
/**
 *
 * @author Lama
 */

public abstract class Payment {
    private double price;
    private static int orderNum=0;

    public Payment(){
        price=0.0;
        orderNum++;
    }
    
    /**
     * 
     * @param price 
     */
    
    public Payment(double price){
        this.price=price;
        orderNum++;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    
    /**
     * @return the orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }

    public abstract void makePayment();
   
 
    @Override
    public String toString(){
        
        return "The price is: "+getPrice()+" \nthe order number is: "+getOrderNum();
        
    }

  
}