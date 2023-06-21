/**Program that solves.
 	  	
 *a specific expression.
 	  	
 *
 	  	
 *Project 03.
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/10/2020.
 	  	
 */
 	  	
 
 	  	
 import java.util.Scanner; 
 	  	
 import java.text.DecimalFormat;
 	  	
 
 	  	
 /**Inports scanner.
 	  	
 *Imports DecimalFormat.
 	  	
 *
 	  	
 *
 	  	
 */
 	  	
 
 	  	
 public class FormulaSolver {
 	  	
 
 	  	
 /**Solves specific expression.
 	  	
 * @param args (not used).
 	  	
 */
 	  	
 
 	  	
    public static void main(String[] args) {
 	  	
       Scanner userInput = new Scanner(System.in);
 	  	
       double x;
 	  	
       int left;
 	  	
       int right;
 	  	
    
 	  	
       System.out.print("Enter a value for x: ");
 	  	
       x = userInput.nextDouble();
 	  	
       
 	  	
    //The result expression
 	  	
    
 	  	
       double result = (6 * Math.pow(x, 3) - 4) 
 	  	
          * Math.sqrt(Math.abs(7 * Math.pow(x, 3) 
 	  	
          + 5 * Math.pow(x, 2) + 3 * x + 1));
 	  	
    
 	  	
    //prints out result
 	  	
    
 	  	
       System.out.println("Result: " + result);
 	  	
       
 	  	
    //characters to the left   
 	  	
    
 	  	
       String decimalResult = Double.toString(result);
 	  	
       left = decimalResult.indexOf(".");
 	  	
       System.out.println("# of characters to left of decimal point: " + left);
 	  	
    
 	  	
    //character to the right
 	  	
    
 	  	
       right = decimalResult.length();
 	  	
       System.out.println("# of characters to right of decimal point: " 
 	  	
          + (right - (left + 1)));
 	  	
       
 	  	
    //DecimalFormat
 	  	
    
 	  	
       DecimalFormat df = new DecimalFormat("#,##0.0#####");
 	  	
    
 	  	
       System.out.println("Formatted Result: " + df.format(result));
 	  	
    
 	  	
    }
 	  	
 }
