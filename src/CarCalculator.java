//Braden Niksich

import java.util.Scanner; 
import java.text.DecimalFormat; 

public class CarCalculator 

{ 
    public static void main(String[] args) 

    { 

        //Setting the variables for the program. 
        Scanner keyboard = new Scanner(System.in); 
        boolean valid = false;  
        String menuChoice = null; 
        double SalePrice = 0; 
        double TradePrice = 0; 
        String response = null; 
        int intMenuChoice = 0;

        //Initial while loop to take and store the sale price of the car. 

        while (valid == false) 

        { 
            try 
            { 
                System.out.println("**********************"); 
                System.out.println("BN New Car Calculator"); 
                System.out.println("**********************"); 
                System.out.println("What is the sale price of your car?"); 
                menuChoice = keyboard.next(); 
                SalePrice = Double.parseDouble(menuChoice); 
                valid = true;  
            } 

            //Catch statement to make sure user inputs valid price. 

            catch (NumberFormatException e) 

            { 
                System.out.println("Your input is not of valid! Please try again..."); 
            } 

            //Setting valid to false to allow next loop to start. 
            valid = false; 

         

            while (valid == false) 
            { 

                //Try and catch to take and store the trade in price of car. 

                try 
                { 
                    System.out.println("**********************"); 
                    System.out.println("What is the value of the car being traded in?"); 
                    menuChoice = keyboard.next(); 
                    TradePrice = Double.parseDouble(menuChoice); 
                    valid = true;  
                } 

                catch (NumberFormatException e) 

                { 
                    System.out.println("Your input is not of valid! Please try again..."); 
                } 

        } 

             

            //Resetting valid to false to allow next loop to begin after we have a valid trade in price stored. 
            valid = false; 

            while (valid == false) 
            { 
                    //Yes or No for adding a stereo system to car. Using if/else statements to get a valid input from user. 
                    //Adding the upgrades to the SalePrice variable. 
                    System.out.println("**********************"); 
                    System.out.println("Do you want a Stereo System upgrade for $452.76? (Y/N)"); 
                    response = keyboard.next(); 
                    //Allows the Y or N to be uppercase or lowercase. 
                    response = response.toUpperCase(); 
                    if (response.equals("Y")) 
                    { 
                        SalePrice = SalePrice + 425.76; 
                        //Allows program to continue by setting valid to true when getting valid input of Y or N. 
                        valid = true; 
                    }
                    else if (response.equals("N")) 
                    { 
                        valid = true; 
                    } 
                    else  
                    { 
                        //Output if user does not input Y or N and goes back to the start of the loop. 
                        System.out.println("You're smarter than that. Please pick enter Y or N."); 
                    } 

             

            } 
                valid = false;
                while (valid == false) 
                {         
                    //Yes or No for adding a leather interior to car. Using if/else statements to get a valid input from user. 
                    //Adding the upgrades to the SalePrice variable. 
                        System.out.println("**********************"); 
                        System.out.println("Do you want a Leather Interior upgrade for $987.41? (Y/N)"); 
                        response = keyboard.next(); 
                        response = response.toUpperCase(); 
                        if (response.equals("Y")) 
                        { 
                            SalePrice = SalePrice + 987.41; 
                            //Allows program to continue by setting valid to true when getting valid input of Y or N. 
                            valid = true; 
                        } 
                        else if (response.equals("N")) 
                        { 
                            valid = true; 
                        } 
                        else  
                        { 
                            //Output if user does not input Y or N and goes back to the start of the loop. 
                            System.out.println("You're smarter than that. Please pick enter Y or N."); 
                        } 

        } 
                valid = false; 
                while (valid == false) 
                { 
                    //Yes or No for adding a computer navigation to car. Using if/else statements to get a valid input from user. 
                    //Adding the upgrades to the SalePrice variable. 
                        System.out.println("**********************"); 
                        System.out.println("Do you want a Computer Navigation upgrade for $1741.23? (Y/N)"); 
                        response = keyboard.next(); 
                        response = response.toUpperCase(); 
                        if (response.equals("Y")) 
                        { 
                            SalePrice = SalePrice + 1741.23; 
                            //Allows program to continue by setting valid to true when getting valid input of Y or N. 
                            valid = true; 
                        } 
                        else if (response.equals("N")) 
                        { 
                            valid = true; 
                        } 
                        else  
                        { 
                            //Output if user does not input Y or N and goes back to the start of the loop. 
                            System.out.println("You're smarter than that. Please pick enter Y or N."); 
                        } 
                } 

                valid = false; 
                while (valid == false) 
                { 

                    //Try and catch blocks to display menu and catch any wrong inputs the user inputs into the program. 
                    try{ 
                        System.out.println("**********************"); 
                        System.out.println("Which exterior finish would you like?"); 
                        System.out.println("1.)Standard (No Additional Cost)");
                        System.out.println("2.)Pearlized (Additional $345.72)"); 
                        System.out.println("3.)Customized (Additional $599.99)"); 
                        menuChoice = keyboard.next(); 
                        intMenuChoice = Integer.parseInt(menuChoice); 
                    } 
                    catch (NumberFormatException e) 
                    { 
                        System.out.println("Your input is not of valid! Please try again..."); 
                    } 
                    //If and else statements for each possible choice the user can select. 
                    if (intMenuChoice == 1) 
                    { 
                        //Equation for the total price of the car. Adding on any exterior finish price,  
                        //then subtracting the trade in price, and finally adding the 8% tax rate. 
                        SalePrice =  (SalePrice - TradePrice) * 1.08; 
                        valid = true; 
                    } 
                    else if (intMenuChoice == 2) 
                    { 
                        SalePrice = (SalePrice + 345.72 - TradePrice) * 1.08; 
                        valid = true; 
                    } 
                    else if (intMenuChoice == 3) 
                    { 
                        SalePrice = (SalePrice + 599.99 - TradePrice) * 1.08; 
                        valid = true; 
                    } 
                    else 
                    { 
                        //If user does not select a valid integer. 
                        System.out.println("The integer you selected is not a valid menu choice"); 
                    } 

                } 

                //Decimal format to make output price only have two decimal places. 
                DecimalFormat twoDForm = new  
                DecimalFormat("#.00"); 
                //Final output statement that displays the total amount due for the user. 
                System.out.println("**********************"); 
                System.out.println("The total cost of your new car is $" + twoDForm.format(SalePrice) + ".");         
        }

    } 

} 

 