 /** InvalidCategoryException file.
 2	  	
 * Project 11.
 3	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 4	  	
 * @version 11/17/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** InvalidCategoryException.
 8	  	
 */
 9	  	
 
 10	  	
 public class InvalidCategoryException extends Exception {
 11	  	
 //constructor
 12	  	
 /** Invalid CategoryException constructor.
 13	  	
 * @param categoryIn for the string.
 14	  	
 */
 15	  	
    public InvalidCategoryException(String categoryIn) {
 16	  	
       super("For category: " + categoryIn);
 17	  	
    }
 18	  	
 }
