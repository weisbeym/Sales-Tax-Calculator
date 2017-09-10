// Author: Yisroel Weisberg
// Program name: TaxCalculator
// Date: 9/20/2016
// Class: Computer Programming 1

package taxcalculator;

import java.util.Scanner;
/**
 *
 * @author Yisroel
 */
public class TaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       // name the variables
        double amount;
        double tax;
        double total;
        
        // print and set the input
        System.out.print("Enter the amount of sale: ");
        amount = Double.parseDouble(in.nextLine());
        
         
         // set variable tax's value and format + print
         tax = amount* .065;
         System.out.printf("The tax is: $%.2f%n", tax);
        
         // set the value for the purchase total and format + print
         total = amount + tax;
         System.out.printf("The total is: $%.2f%n", total);
          
          }
        }
