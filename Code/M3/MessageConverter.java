/**Program that exchanges letters.
 	  	
 *in a strong to encode a message.
 	  	
 *
 	  	
 *Activity 3.
 	  	
 * 
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/8/2020.
 	  	
 */
 	  	
 
 	  	
 import java.util.Scanner;
 	  	
 /**Import scanner.
 	  	
 */
 	  	
 public class MessageConverter {
 	  	
 
 	  	
 /**Converts the message user gives.
 	  	
 * @param args -- not used.
 	  	
 */
 	  	
 
 	  	
    public static void main(String[] args)
 	  	
    {
 	  	
    /**main string. Converts message.
 	  	
    */
 	  	
    
 	  	
       Scanner userInput = new Scanner(System.in);
 	  	
       String message = (" ");
 	  	
       int outputType;
 	  	
       String result = (" ");
 	  	
       
 	  	
       /**prompts user for message.
 	  	
       */
 	  	
    
 	  	
       System.out.print("Type in a message and "
 	  	
          + "press enter:\n\t> ");
 	  	
       message = userInput.nextLine();
 	  	
    
 	  	
       System.out.print("\nOutput types:"
 	  	
         + "\n\t0: As is "
 	  	
          + "\n\t1: Trimmed"
 	  	
          + "\n\t2: lower case"
 	  	
          + "\n\t3: UPPER CASE"
 	  	
          + "\n\t4: v_w_ls r_pl_c_d"
 	  	
          + "\n\t5: Without first and last character" 
 	  	
          + "\nEnter your choice: ");
 	  	
    
 	  	
       outputType = Integer.parseInt(userInput.nextLine());
 	  	
    
 	  	
       if (outputType == 0) { //as is
 	  	
          result = message;
 	  	
          System.out.println("\n" + result);
 	  	
       }
 	  	
       
 	  	
       else if (outputType == 1) { //trimmed
 	  	
          result = message.trim();
 	  	
          System.out.println("\n" + result);
 	  	
       }
 	  	
       
 	  	
       else if (outputType == 2) { //lower case
 	  	
          result = message.toLowerCase();
 	  	
          System.out.println("\n" + result);
 	  	
       }
 	  	
       
 	  	
       else if (outputType == 3) { //upper case
 	  	
          result = message.toUpperCase();
 	  	
          System.out.println("\n" + result);
 	  	
       }
 	  	
       
 	  	
       else if (outputType == 4) { //v_w_ls. r_pl_c_d
 	  	
          result = message.replace('a', '_');
 	  	
          result = result.replace('e', '_');
 	  	
          result = result.replace('i', '_');
 	  	
          result = result.replace('o', '_');
 	  	
          result = result.replace('u', '_');
 	  	
          System.out.println("\n" + result);
 	  	
       }
 	  	
       
 	  	
       else if (outputType == 5) { //without first and last character
 	  	
          result = message.substring(1, message.length() - 1);
 	  	
          System.out.println("\n" + result);
 	  	
       }
 	  	
       
 	  	
       else { //invalid input
 	  	
          result = ("Error: Invalid choice input.");
 	  	
          System.out.println("\n" + result);
 	  	
       }
 	  	
    
 	  	
    }
 	  	
 }
