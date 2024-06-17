/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remas.raha_company_project1;

/**
 *The HourMaid class represents a service related to hourly maids.
 * It extends the Maid class and provides functionality for setting
 * the visit duration and package of the service.
 * @author اروى
 */

import java.util.Arrays;
public class HourMaid extends Maid{
    
    private String Duration;
    private String Package;
    private final String[]vist_duration={"Morning","Night"};
    private final String[]hourlyservice ={"Single vist","Monthly vist"};
        /**
     * Constructs an empty HourMaid object.
     */

    public HourMaid(){
        super();
    }
    /**
     * Constructs an HourMaid object with the specified duration and package.
     *
     * @param Duration The duration of the maid's visit ("Morning", "Night").
     * @param Package  The package of the service ("Single visit", "Monthly contracts").
     */

    public HourMaid(String Duration ,String Package){
        this.Duration=Duration;
        this.Package=Package;
        
    }
        /**
     * Sets the visit duration based on the provided index in the vist_duration array.
     *
     * @param DurationIndex The index of the visit duration to set.
     * @param Duration      The visit duration ("Morning", "Night").
     */

  public void setDuration(int DurationIndex,String Duration){
            DurationIndex--;
        if (DurationIndex >= 0 && DurationIndex< vist_duration.length) {
            // Set the duration based on the index in the array
           
            Duration = vist_duration[DurationIndex];
        } else {
            System.out.println("Invalid duration index");
            // Handle the case when the index is out of bounds
        }}
  /**
     * Retrieves the visit duration.
     *
     * @return The visit duration.
     */

        public String getDuration(){
            return Duration; 
        }
        /**
     * Sets the service package based on the provided index in the hourlyservice array.
     *
     * @param select  The index of the service package to set.
     * @param Package The service package ("Single visit", "Monthly contracts").
     */

        public void setPackage(int select,String Package){
            
        this.Package=hourlyservice[select-1];
      }
        /**
     * Retrieves the service package.
     *
     * @return The service package.
     */

        public String getPackage(){
        return Package;
        } 
        /**
     * Displays the available visit durations.
     */

         public void DisplayDuration() {
        
         for (int i = 0; i <vist_duration.length; i++) {
            System.out.println((i + 1) + ":" +vist_duration[i]);
        }}
         //Packages//
             /**
     * Displays the available hourly service options.
     */
        public void hourlyServiceMenu(){
            for (int i = 0; i<hourlyservice.length; i++) {
            System.out.println((i + 1) + ":" +hourlyservice[i]);}
        }
            /**
     * Overrides the toString method to provide a string representation
     * of the HourMaid object.
     *
     * @return A string representation of the object including Duration and Package.
     */

        public String toString(){
            return"Duration:"+Duration+"Package:"+Package;
        }
    

}
      
