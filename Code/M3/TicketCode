/**Program that accepts.
 	  	
 *coded ticket info as an input.
 	  	
 *
 	  	
 *Project 03.
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/10/2020.
 	  	
 */
 	  	
 
 	  	
 import java.util.Scanner;
 	  	
 import java.text.DecimalFormat;
 	  	
 import java.util.Random;
 	  	
 
 	  	
 /**imports scanner.
 	  	
 * 
 	  	
 */
 	  	
 
 	  	
 public class TicketCode {
 	  	
 
 	  	
 /**TicketCode.
 	  	
 * @param args -- (not used).
 	  	
 */
 	  	
 
 	  	
    public static void main(String [] args) {
 	  	
       Scanner scan = new
 	  	
          Scanner(System.in);
 	  	
       DecimalFormat df = new
 	  	
          DecimalFormat("$#,##0.00");
 	  	
       DecimalFormat dfDiscount = new
  	
          DecimalFormat("0%");
 	  	
       DecimalFormat dfPrize = new
 	  	
          DecimalFormat("000");
 	  	
       Random generator = new Random();
 	  	
       String input = "";
 	  	
       String month = "";
 	  	
       String day = "";
 	  	
       String year = "";
 	  	
       String hour = "";
 	  	
       String minute = "";
 	  	
       String section = "";
 	  	
       String row = "";
 	  	
       String seat = "";
 	  	
       String description = "";
 	  	
       double price = 0; 
 	  	
       double cost = 0;
 	  	
       double costDiscount = 0;
 	  	
       double discount = 0;
 	  	
       int prizenumber = 0;
 	  	
       
 	  	
       System.out.print("Enter ticket code: ");
 	  	
      input = scan.nextLine().trim();
 	  	
       System.out.println("");
 	  	
       
 	  	
       if (input.length() < 26) {
 	  	
          System.out.println("Invalid ticket code.");
 	  	
          System.out.println("Ticket code must have at least 26 characters.");
 	  	
       }
 	  	
       
 	  	
       else {
 	  	
          description = input.substring(25, input.length());
 	  	
          System.out.print("Description: " + description);
 	  	
          
 	  	
          month = input.substring(11, 13);
 	  	
          day = input.substring(13, 15);
 	  	
          year = input.substring(15, 19);
 	  	
          System.out.print("   Date: " + month + "/" + day + "/" + year);
 	  	
          
 	  	
          hour = input.substring(7, 9);
 	  	
          minute = input.substring(9, 11);
 	  	
          System.out.println("   Time: " + hour + ":" + minute);
 	  	
          
 	  	
          section = input.substring(19, 21);
 	  	
          System.out.print("Section: " + section);
 	  	
          
 	  	
          row = input.substring(21, 23);
 	  	
          System.out.print("   Row: " + row);
 	  	
          
 	  	
          seat = input.substring(23, 25);
 	  	
          System.out.println("   Seat: " + seat);
 	  	
          
 	  	
          price = Double.parseDouble(
 	  	
             input.substring(0, 5)) / 100;
 	  	
          System.out.print("Price: " + df.format(price));
 	  	
          
 	  	
          discount = Double.parseDouble(
 	  	
             input.substring(5, 7));
 	  	
          System.out.print("   Discount: " + dfDiscount.format(discount / 100));
 	  	
          
 	  	
          costDiscount = (price) * (discount * .01);
 	  	
          cost = price - costDiscount;
 	  	
          System.out.println("   Cost: " + df.format(cost));
 	  	
          
 	  	
          prizenumber = (int) generator.nextInt(999);
 	  	
          System.out.print("Prize Number: " + dfPrize.format(prizenumber));
 	  	
       
   	
       }
 	  	
      
 	  	
       
 	  	
        
 	  	
       
 	  	
    
 	  	
    
 	  	
    
 	  	
    
 	  	
    
 	  	
    
 	  	
    
 	  	
   
 	  	
    }
 	  	
 }
