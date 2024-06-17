/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remas.raha_company_project1;

/**
 * The {@code UserInfo} class represents information about a user.
 * It includes the user's name, age, email, password, and location.
 * 
 * This class provides methods to get and set each attribute, as well as
 * a default constructor for creating an instance with default values.

 * @author فرح-ريم
 */

public class UserInfo implements Person {
   
   private String name;
   private int age;
   private String email;
   private int phone;
   private String location;
   private String password;
   
   
/**
* Constructs a UserInfo object with the specified name, age, email, password, and location
*@param name the name of the user
* @param age      the age of the user
* @param email    the email of the user
* @param phone    the number phon of the user
* @param password the password of the user
* @param location the location of the user
*/   
public UserInfo(String name,int age,String email,int phone,String location,String password){
    
   if (phone < 0) {
  throw new IllegalArgumentException("Phone number cannot be negative.");
    }
//@throws IllegalArgumentException if the phone number is negative
    
    this.name=name;
    this.age=age;
    this.email=email;
    this.phone=phone;
    this.location=location;
    this.password=password;
}
/**
* Constructs a UserInfo object with default values for name, age, email, password, and location.
*/
   public UserInfo(){

       this.name="";
       this.age=0;
       this.email="";
       this.phone=0;
       this.location="";
       this.password="";    
}
/**
* Returns the name of the user.
*
* @return the name of the user
*/
    public String getName() {
        return name;
    }
/**
 * Sets the name of the user.
 *
* @param name the name of the user
*/    
    public void setName(String name) {
        this.name = name;
    }
/**
* Returns the age of the user
*
* @return the age of the user
*/    
 public int getAge() {
        return age;
    }

/**
* Sets the age of the user.
*
* @param age the age of the user
*/    
    public void setAge(int age) {
        this.age = age;
    }
/**
* Returns the email of the user.
*
* @return the email of the user
*/
    public String getEmail() {
        return email;
    }   
/**
* Sets the email of the user.
*
* @param email the email of the user
*/    
    public void setEmail(String email) {
        this.email = email;
    }
/**
* Returns the numberphon of the user.
*
* @return the numberphon of the user
*/
    
    public int getphone() {
        return phone;
    }

/**
* Sets the numberphon of the user.
*
* @param phone the email of the user
*/        
    public void setphone(int phone) {
        this.phone=phone;
    }
/**
* Returns the location of the user.
*
* @return the location of the user
*/    
    public String getLocation() {
        return location;
    }
/**
* Sets the location of the user.
*
* @param location the location of the user
*/
    public void setLocation(String location) {
        this.location = location;
    }
/**
* Returns the password of the user.
*
* @return the password of the user
*/
    public String getPassword() {
        return password;
    }
/**
* Sets the password of the user.
*
* @param password the password of the user
*/    
    public void setPassword(String password) {
        this.password = password;
    } 
/**
* Returns a string representation of the UserInfo object.
*
* @return a string representation of the UserInfo object
*/
  @Override
    public String toString() {
        return "UserInfo{" + "name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + ", location=" + location + ", password=" + password + '}';
    }
   /**print just a general Information  for Security*/
    
    public void information() {
        System.out.println("User name:"+getName());
        System.out.println("User age"+getAge());
        System.out.println("emeil;"+getEmail());
        System.out.println("phone numper;"+getphone());
        System.out.println("Location"+getLocation());
    }
}
