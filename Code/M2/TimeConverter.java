/**Program displays time as. 
 	  	
 *combination of days, hours, and minutes.
 	  	
 *and seconds.
 	  	
 *
 	  	
 *Project 02.
 	  	
 *
 	  	
 * @author Laura Wilson -- comp 1210 --001.
 	  	
 * @version 9/3/2020.
   	
 */
 	  	
 
 	  	
 import java.util.Scanner;
 	  	
 /**Import for scanner.
 	  	
 */
 	  	
 
 	  	
 public class TimeConverter {
 	  	
 
 	  	
 /**Time Converter.
 	  	
 *
 	  	
 * @param args -- not used.
 	  	
 */
 	  	
 
 	  	
    public static void main(String[] args) { 
 	  	
    
 	  	
    /**Main string with scanner.
 	  	
    *
 	  	
    */
 	  	
    
 	  	
       Scanner userInput = new Scanner(System.in);
 	  	
    
 	  	
    //Days, hours, minutes, and seconds defined
 	  	
       int days;
 	  	
       int hours;
 	  	
       int minutes;
 	  	
       int seconds;
 	  	
       int rawSeconds;
 	  	
    
 	  	
       System.out.print("Enter the raw time measurement in seconds: ");
 	  	
       rawSeconds = userInput.nextInt();
 	  	
       
 	  	
       if (rawSeconds < 0) {
 	  	
          System.out.println("Measurement must be non-negative!");
 	  	
       }
 	  	
       
 	  	
       else {
 	  	
          System.out.println();
 	  	
          System.out.println("Measurement by combined days,"
 47	  	
             + " hours, minutes, seconds: ");
 	  	
         
 	  	
          //Days, hours, minutes, and seconds
 	  	
          days = (rawSeconds / 86400);
 	  	
          hours = (rawSeconds % 86400) / 3600;
 	  	
          minutes = ((rawSeconds % 86400) % 3600) / 60;
 	  	
          seconds = ((rawSeconds % 86400) % 3600) % 60;
 	  	
       
 	  	
          System.out.println("\tdays: " + days);
 	  	
          System.out.println("\thours: " + hours);
 	  	
          System.out.println("\tminutes: " + minutes);
 	  	
          System.out.println("\tseconds: " + seconds);
 	  	
       
 	  	
          System.out.println();
 	  	
          System.out.println(rawSeconds + " seconds = " 
 	  	
             + days + " days, " 
 	  	
             + hours + " hours, " 
 	  	
             + minutes + " minutes, " 
 	  	
             + seconds + " seconds ");
 	  	
       }
 	  	
    }
 	  	
    
 	  	
 }
