 /** Division file.
 2	  	
 * Activity 11.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/16/2020.
 5	  	
 */
 6	  	
 
 7	  	
 
 8	  	
 
 9	  	
 /** Division class. */
 10	  	
 
 11	  	
 public class Division {
 12	  	
 
 13	  	
 /** intDivide method.
 14	  	
 * @param numerator for the num.
 15	  	
 * @param denominator for the denom.
 16	  	
 * @return intDivide.
 17	  	
 */
 18	  	
 
 19	  	
    public static int intDivide(int numerator, int denominator) {
 20	  	
       try { 
 21	  	
          return numerator / denominator;
 22	  	
       }
 23	  	
       catch (ArithmeticException e) {
 24	  	
       //handling aruthmatic exception
 25	  	
          return 0;
 26	  	
       }
 27	  	
    }
 28	  	
    
 29	  	
    /** public static decimalDivide.
 30	  	
    * @param numerator for num.
 31	  	
    * @param denominator for denom.
 32	  	
    * @return decimalDivide.
 33	  	
    */
 34	  	
 
 35	  	
    public static double decimalDivide(int numerator, int denominator) {
 36	  	
       if (denominator == 0) {
 37	  	
          throw new IllegalArgumentException("The denominator cannot be zero."); 
 38	  	
          //throwing illegal argument
 39	  	
       }
 40	  	
       return (double) numerator / (double) denominator;
 41	  	
    }
 42	  	
 }
