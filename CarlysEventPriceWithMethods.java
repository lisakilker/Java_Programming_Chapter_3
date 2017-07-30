/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2HW;
import java.util.Scanner;
import W2HW.EventDemo;
import W2HW.Event;
/**
 *
 * @author Lisa
 */
public class CarlysEventPriceWithMethods {
    private static Scanner input = new Scanner(System.in);
    
    public static String getEventNumber(){
        System.out.println("What's the event number?");
        String eventNumber = input.nextLine();
        return eventNumber;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int guests;
       guests = getAmountOfGuests();
       System.out.println("The amount of guests is " + guests + ".");
       calculateEventPrice(guests);
    }
    
    public static int getAmountOfGuests(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of guests: ");
        int numOfGuests = input.nextInt();
        displayMotto();
        return numOfGuests; 
        
    }
   
    public static void displayMotto(){
        System.out.println("**************************************************************");
        System.out.println("*******Carly's makes the food that makes it a party.**********");
        System.out.println("**************************************************************");
    }
    
    public static void calculateEventPrice(int numGuests){
        
        
    }
}
  


 