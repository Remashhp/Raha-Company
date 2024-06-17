/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remas.raha_company_project1;


import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
/**
 * The `Maids` class represents a general template for maids in the Rahaapp.
 * It includes basic information such as nationality, price, and years of experience
 * 
 * @author Remas
 */

public class Maid implements Person {

    private String  Nationality;
    private double price;
    private int Years_Experience;
    private final String[]Nationality_list={"Indonesian","African","oganda"};
    private String name;
    private int age;

    /**
     * Default constructor for the `Maid` class. Initializes nationality,
     * price, and years of experience to 0.
     */
    public Maid() {
        Nationality = null;
        price = 0;
        Years_Experience = 0;
        name=null;
    }

    /**
     * Parameterized constructor for the `Maids` class.
     *
     * @param Nationality The nationality of the maid.
     * @param price The salary of the maid.
     * @param Years_Experience The years of experience of the maid.
     */
    public Maid(String Nationality, int price, int Years_Experience,String name) {
        this.Nationality = Nationality;
        this.price = price;
        this.Years_Experience = Years_Experience;
        this.name=name;
    }

    /**
     * Sets the nationality of the maid.
     *@param index to select from Nationality_list by its index
     * @param Nationality The new nationality value.
     */
    public void setNationality(int index,String Nationality) {
        index--;
        this.Nationality =Nationality_list[index];
    }

    /**
     * Gets the nationality of the maid.
     *
     * @return The nationality of the maid.
     */
    public String getNationality() {

        return Nationality;
    }

    /**
     * Sets the salary of the maid.
     *
     * @param price The new price value.
     */
    public void setprice(double price) {
        this.price = price;
    }

    /**
     * Gets the price of maid service.
     *
     * @return The price of maid service.
     */
    public double getprice() {
        return price;
    }

    /**
     * Sets the years of experience of the maid.
     *
     * @param Years_Experience The new years of experience value.
     */
    public void setYears_Experience(int Years_Experience) {
        this.Years_Experience = Years_Experience;
    }
    
    /**
     * Gets the years of experience of the maid.
     *
     * @return The years of experience of the maid.
     */
   
    public int getYears_Experience() {
        return Years_Experience;
    }
 @Override
    public String getName() {
       return name;
    }
    /**
     * @param name sets maid name
     */
    @Override
    public void setName(String name) {
    this.name=name;
    }
    /**
     * @return maid age
     */
    @Override
    public int getAge() {
       return age;
    }
     /**
     * @param age sets maid age
     */
    @Override
    public void setAge(int age) {
       this.age=age;
}
    
    /**
     * Fills the Nationality list with predefined values. This method assigns
     * specific nationalities to elements in the Nationality list array and print them.
     */
    public void Print_Nationality_list() {
        for (int i = 0; i <Nationality_list.length; i++) {
            System.out.println((i+1)+":" + Nationality_list[i]);
        }
    }
   /**
     * Overrides the `toString` method to provide a string representation of the maid's information.
     *
     * @return A string representation of the maid's information.
     */
    @Override
    public String toString() {
        return "Maid info" + "\ntotal price of the order:" + price + "\nNationality:" + Nationality + "\nYears_Experience" + Years_Experience;
    }
    /**
     * @rturn maid name
     */
   /**
     * print tha maid information
     */
    @Override
    public void information() {
        System.out.println("maid name is:"+getName());
        System.out.println("the age of the maid:"+getAge());
    }

}