 /**Program that needs values.
 	  	
 *of type double for x, y, z.
 	  	
 * to solve for.
 	  	
 *
 	  	
 *Project 02.
 	  	
 * @author Laura Wilson -- comp 1210-001.
 	  	
 * @version 9/3/2020.
 	  	
 */
 	  	
 
 	  	
 import java.util.Scanner; 
 	  	
 /**Scanner imported.
 	  	
 */
 	  	
 
 	  	
 public class ExpressionResult {
 	  	
 
 	  	
 /**Expression Result.
 	  	
 * @param args -- not used.
 	  	
 */
 	  	
 
 	  	
    public static void main(String[] args) {
 	  	
    
 	  	
    
 	  	
       Scanner userInput = new Scanner(System.in);
 	  	
       double x;
 	  	
       double y;
 	  	
       double z;
 	  	
       double result;
 	  	
    
 	  	
    //Equation output
 	  	
       System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
 	  	
       
 	  	
    //X input
 	  	
       System.out.print("\tx = ");
 	  	
       x = userInput.nextDouble();
 	  	
       

    //Y input
 	  	
       System.out.print("\ty = ");
 	  	
       y = userInput.nextDouble();
 	  	
       
 	  	
    //Z input
 	  	
       System.out.print("\tz = ");
 	  	
       z = userInput.nextDouble();
 	  	
       
 	  	
    //If else statement
 	  	
       if (x * y * z == 0) { //when x, y, or z = 0
 	  	
          System.out.println("result is \"undefined\"");
 	  	
       }
 	  	
       
 	  	
       else { //when x,y, or z don't equal 0
 	  	
          result = (x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4) / (x * y * z);
 	  	
          System.out.println("result = " + result); 
 	  	
       }
 	  	
    
 	  	
    
 	  	
    
 	  	
    
 	  	
    
 	  	
    }
 	  	
 
 	  	
 
 	  	
 }
