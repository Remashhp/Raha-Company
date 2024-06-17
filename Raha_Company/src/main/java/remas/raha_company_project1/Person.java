/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package remas.raha_company_project1;


/**
 *
 * @author Lama
 */

/**
 * This interface represents a person.
 */
public interface Person {
    
    
    
    /**
     * Display information about the person.
     */
    void information();
    
    
    
    /**
     * Get the person's name.
     *
     * @return The name of the person.
     */
    String getName();
    
    
    
   /**
     * Set the person's name.
     *
     * @param name The name to set for the person.
     */
    void setName(String name);

    
    
    /**
     * Get the person's age.
     *
     * @return The age of the person.
     */
    int getAge();

 
    
    /**
     * Set the person's age.
     *
     * @param age The age to set for the person.
     */
    void setAge(int age);
}