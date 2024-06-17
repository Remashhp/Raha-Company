/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package remas.raha_company_project1;

/**
 *
 * The {@code Raha_Company} class represents the main class for the Raha Company
 * application. It provides functionality for user login, account creation, and
 * order placement for maid services.
 *
 * <p>
 * The main loop of the application allows users to log in, create new accounts,
 * or log out. If a user logs in successfully, they are presented with options
 * to navigate to maids services or view user information.
 *
 * <p>
 * When choosing maid services, the user can select from different types of
 * services, such as HourMaid or ResidentMaid, and specify preferences like
 * experience, nationality, payment method, and contract duration. if all the
 * order set the user will choose the pay type such as CreditCard and cash then
 * the user will get a file with the Receipt that have all information of the order
 * o
 *
 * @author ريم-ريماس
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Raha_Company {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<UserInfo> accounts = new ArrayList<>();
        int experience, service_index, index;
        int choice;
        String name = null, orderType1 = "HourMaid", orderType2 = "ResidentMaid", orderType = null, selctedHourlyService, Nationality = null;
        boolean orderCheck = false;
        boolean exit = false;
        while (!exit) {
            System.out.println("choose one of this:");
            System.out.println("1.Login:");
            System.out.println("2.create a new account:");
            System.out.println("If you want to log out, choose this option ");
            System.out.println("3.Log out:");

            int choose = s.nextInt();
            s.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Please enter email: ");
                    String loginInput = s.next();
                    boolean found = false;
                    for (UserInfo i : accounts) {
                        if (i.getEmail().equals(loginInput)) {
                            found = true;
                        }
                    }
                    if (found) {
                        System.out.println("Successfully logged in \n ");
                        System.out.println("\n-------------------");
                        System.out.println("W  E  L  C  O  M  E");
                        System.out.println("-------------------\n");
                        System.out.println("1.GO TO Maids.");
                        System.out.print("\nEnter your choice : ");
                        choice = s.nextInt();
                        switch (choice) {
                            
                            case 1:
                                System.out.println("Choose the service that suits you to subscribe");
                                System.out.println("1:WeeksMaids\n2:ResidentMaid");
                                int enter = s.nextInt();
                                Maid newMaid_Specifications = new Maid();
                                //مناداة كلاس  HourMaid //
                                HourMaid makeOrder_service1 = new HourMaid();
                                if (enter == 1) {

                                    orderType = orderType1;

                                    System.out.println("Choose a service type");
                                    makeOrder_service1.hourlyServiceMenu();
                                    service_index = s.nextInt();
                                    selctedHourlyService = null;

                                    makeOrder_service1.setPackage(service_index, selctedHourlyService);
                                    //Single vist//
                                    if (service_index == 1) {
                                        System.out.println("Enter Experience Which you prefer for the maid (0 to 10) years:");
                                        experience = s.nextInt();
                                        newMaid_Specifications.setYears_Experience(experience);
                                        System.out.println("Enter Nationality (choose from the list):");
                                        newMaid_Specifications.Print_Nationality_list();
                                        index = s.nextInt();
                                        newMaid_Specifications.setNationality(index, Nationality);
                                        System.out.println("Duration:");
                                        makeOrder_service1.DisplayDuration();
                                        int Durationindex = s.nextInt();
                                        String selectedDuration = null;

                                        makeOrder_service1.setDuration(Durationindex, selectedDuration);
                                        makeOrder_service1.getDuration();

                                        System.out.println("write the day:\nsunday\nmonday\ntusday\nWednesday\nThursday");
                                        String selctedDay = s.next();
                                        newMaid_Specifications.setprice(150.5);
                                        System.out.println("The total price is:" + newMaid_Specifications.getprice());
                                        System.out.println("all set now go to buy:");
                                        orderCheck = true;

                                    } //Monthly vist//
                                    else if (service_index == 2) {
                                        System.out.println("Enter Experience Which you prefer for the maid (0 to 10) years:");
                                        experience = s.nextInt();
                                        newMaid_Specifications.setYears_Experience(experience);
                                        System.out.println("Enter Nationality (choose from the list):");
                                        newMaid_Specifications.Print_Nationality_list();
                                        index = s.nextInt();
                                        newMaid_Specifications.setNationality(index, Nationality);

                                        System.out.println("Duration:");
                                        makeOrder_service1.DisplayDuration();
                                        int Durationindex = s.nextInt();
                                        String selectedDuration = null;
                                        makeOrder_service1.setDuration(Durationindex, selectedDuration);
                                        System.out.println("The maid will come to you 6 days euch week per the month ");
                                        newMaid_Specifications.setprice(1000.97);
                                        System.out.println("The total price is:" + newMaid_Specifications.getprice());
                                        System.out.println("all set now go to buy:");
                                        orderCheck = true;
                                    } else {
                                        System.out.println("Something went wrong");

                                    }
                                } 
                                // ResidentMaid//
                                else if (enter == 2) {
                                    orderType = orderType2;
                                    ResidentMaid makeOrder_service2 = new ResidentMaid();
                                    System.out.println("Enter Nationality (choose from the list):");
                                    newMaid_Specifications.Print_Nationality_list();
                                    index = s.nextInt();
                                    newMaid_Specifications.setNationality(index, Nationality);
                                    System.out.println("Enter Experience Which you prefer for the maid (0 to 10) years:");
                                    experience = s.nextInt();
                                    newMaid_Specifications.setYears_Experience(experience);

                                    System.out.println("how would you like to pay:");
                                    makeOrder_service2.showingPayment();
                                    String pay_type = null;
                                    index = s.nextInt();
                                    makeOrder_service2.setpay_type(index, pay_type);
                                    System.out.println("Select Contract Duration:");
                                    makeOrder_service2.Fill_showing_duration();
                                    int Duratione = s.nextInt();
                                    makeOrder_service2.setDuration(Duratione);
                                    switch (Duratione) {
                                        case 3:
                                            newMaid_Specifications.setprice(5457.78);
                                            System.out.println("The total price is:" + newMaid_Specifications.getprice());
                                            System.out.println("all set now go to buy:");
                                            orderCheck = true;
                                            break;

                                        case 6:
                                            newMaid_Specifications.setprice(10493.99);
                                            System.out.println("The total price is:" + newMaid_Specifications.getprice());
                                            System.out.println("all set now go to buy:");
                                            orderCheck = true;
                                            break;

                                        case 12:
                                            newMaid_Specifications.setprice(20395.74);
                                            System.out.println("The total price is:" + newMaid_Specifications.getprice());
                                            System.out.println("all set now go to buy:");
                                            orderCheck = true;
                                            break;
                                        case 24:
                                            newMaid_Specifications.setprice(40788.45);
                                            System.out.println("The total price is:" + newMaid_Specifications.getprice());
                                            System.out.println("all set now go to buy:");
                                            orderCheck = true;
                                            break;

                                        default:
                                            System.out.println("something went wrong");
                                    }
                                } else {
                                    System.out.println("something went wrong");
                                }
                                //puy//
                                if (orderCheck == true) {
                                    System.out.println("choose pay type\n1-CreditCard\n2-cash");
                                    int payMethod = s.nextInt();
                                    if (payMethod  == 1) {
                                        CreditCard Pay = new CreditCard();
                                       Pay.setPrice(newMaid_Specifications.getprice());
                                        System.out.print("\nenter CreditCard Numper:");
                                        int CreditCardNumper=s.nextInt();
                                        Pay.setCreditCardNum(CreditCardNumper);
                                        System.out.print("\nenter CardHolderName:");
                                        String CardHolderName=s.next();
                                        Pay.setCardHolderName(CardHolderName);
                                        System.out.println("\ncvv numper;");
                                        int cvv=s.nextInt();
                                        Pay.setCvv(cvv);
                                        Pay.makePayment();
                                        
                                        
                                        try {
                                            FileWriter writer = new FileWriter("order.txt");
                                             writer.write(orderType);
                                            writer.write(accounts.toString());
                                            writer.write(newMaid_Specifications.toString());
                                            writer.write(Pay.toString());
                                            writer.close();
                                            System.out.println("Writing to the file was completed successfully.");
                                        } catch (IOException ex) {
                                            System.out.println("File not exsist");
                                        }
                                        try {
                                            File read = new File("order.txt");

                                            Scanner inputFile = new Scanner(read);

                                            while (inputFile.hasNext()) {

                                                String str = inputFile.nextLine();

                                            }
                                            inputFile.close();
                                        } catch (IOException ex) {
                                            System.out.println("File not exsist");}
                                       
                                    } else if (payMethod  == 2) {
                                        
                                        Cash Pay2 = new Cash();
                                        Pay2.setPrice(newMaid_Specifications.getprice());
                                         System.out.println(" How much did you pay at the center");
                                          double cashPaid=s.nextDouble();
                                          Pay2.setPricePaid(cashPaid);
                                          Pay2.makePayment();
                                        
                                        try {
                                            FileWriter writer = new FileWriter("order.txt");
                                           
                                           
                                            writer.write(orderType);
                                            writer.write(newMaid_Specifications.toString());
                                            writer.write(Pay2.toString());
                                           
                                            
                                            writer.close();
                                            System.out.println("Writing to the file was completed successfully.");
                                        } catch (IOException ex) {
                                            System.out.println("File not exsist");
                                        }
                                        try {
                                            File read = new File("order.txt");

                                            Scanner inputFile = new Scanner(read);

                                            while (inputFile.hasNext()) {

                                                String str = inputFile.nextLine();

                                            }
                                            inputFile.close();
                                        } catch (IOException ex) {
                                            System.out.println("File not exsist");}

                                    } 
                                    else {
                                        System.out.println("enter valid numper");
                                    }

                                } else {
                                    System.out.println("no order has cheeked");
                                }
                            break;
                          
                            default:
                                System.out.println("something went wrong");
                        }
                      
                    } 
                    else {
                        System.out.println("The account is not available, Please create a new account. ");
                    }
                    break;
                case 2:
                    System.out.println("Pleas enter your name: ");
                    name = s.next();
                    System.out.println("Pleas enter your age: ");
                    int age = s.nextInt();
                    s.nextLine();
                    if (age <= 12) {
                        System.out.println("yor are not allowed to enter because of your age: ");
                    } else {
                        System.out.println("Please enter your email: ");
                        String email = s.nextLine();
                        boolean found1 = false;
                        for (UserInfo i : accounts) {
                            if (i.getEmail().equals(email)) {
                                found1 = true;
                            }
                        }
                        if (found1) {
                            System.out.println("The account is already: ");
                        } else {
                            System.out.println("Pleas enter your Number phone: ");
                            int phone = s.nextInt();
                            System.out.println("Pleas enter your Location: ");
                            String location = s.next();
                            System.out.println("Pleas enter you Password: ");
                            String password = s.next();
                            UserInfo us = new UserInfo(name, age, email, phone, location, password);
                            accounts.add(us);
                            System.out.println("Yhe account was created successfully. ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thanks foe yousing my app.exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid test, please try again");
            }

        }

    }
}
