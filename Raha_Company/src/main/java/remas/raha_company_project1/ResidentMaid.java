/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remas.raha_company_project1;

/**
 *
 * @authorنجاة
 */
import java.util.ArrayList;
 public class ResidentMaid extends Maid {

    private int duration;
    private String pay_type;
    private final String[] pay_typeMenu ={"full payment","Installment"};
    private final int[] durationMenu = new int[4];
    /**
     * non parametrized constructor
     */
    public ResidentMaid() {

    }
    /**
     * @param duration
     * @param pay_type
     */
    public ResidentMaid(int duration,String pay_type) {
        super();
        this.duration = duration;
        this.pay_type=pay_type;
    }
    
        /**
     * @param duration duration to set
     */
    public void setDuration(int duration){
        this.duration=duration;
    }
    /**
     * @return the duration
     */
    public int getDuration(){
    return duration;
    }
     /**
     * @param index to select element from array
     * @param pay_type to set pay_type
     */
    public void setpay_type(int index,String pay_type){
        index--;
    this.pay_type=pay_typeMenu[index];
    
    }
    /**
     * @return pay_type
     */
    public String getPay_type(){
    return pay_type;
    }
    /**
     * in this method we fill pay_typeMenu array and show the user the avaielab pay types
     */
        public void showingPayment(){
        for (int i = 0; i < pay_typeMenu.length; i++) {
            System.out.println((i + 1) + ":" + pay_typeMenu[i]);
        }
    }
    /**
     * in this method we fill the durationMenu array and show the user available services durations
     */
    public void Fill_showing_duration() {
        durationMenu[0] = 3;
        durationMenu[1] = 6;
        durationMenu[2] = 12;
        durationMenu[3] = 24;
        for (int i = 0; i <durationMenu.length; i++) {
            System.out.println("-" + durationMenu[i] + " month");
        }
      
    }
     /**
     * Overrides the `toString` method to provide a string representation of the ResidentMaid information.
     *
     * @return A string representation of the ResidentMaid information.
     */
     public String toString() {
        return "pay_type:"+pay_type+"duration" +duration;
    }
}              