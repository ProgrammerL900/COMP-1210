 /**NumberOperations. 
 	  	
 *holds integer value and performs.
 	  	
 *operations.
 	  	
 *
 	  	
 *Activity 05.
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/21/2020.
 	  	
 */
 	  	
 
 	  	
 public class NumberOperations {
 	  	
 
 	  	
 /**
 	  	
 * NumberOperations class.
 	  	
 * Holds integer values and performs operations.
 	  	
 */
 	  	
 
 	  	
    private int number;
 	  	
 
 	  	
    public NumberOperations(int numberIn) {

 	  	
    /**
 	  	
    * Constructor NumberOperations.
 	  	
    * Holds integer value and performs operation on value. 
 	  	
    */
 	  	
       number = numberIn;
 	  	
   
 	  	
    }
 	  	
    public int getValue()

   	
    {
 	  	
    /**
 	  	
    * @return int value.
 	  	
    * Method getValue. 
 	  	
    */
 	  	
       return number;
 	  	
    }
 	  	
 
	  	
    public String oddsUnder() 

    {
 	  	
    /**
 	  	
    * @return string.
 	  	
    * Method oddsUnder.
 	  	
    */
 	  	
    
 	  	
       String output = ""; 
 	  	
       int i = 0;
 	  	
       while (i < number) {
   	
          if (i % 2 != 0) {
 	  	
             output += i + "\t";
 	  	
          }
 	  	
          i++;
 	  	
       }
 	  	
       return output;
 	  	
    }
 	  	
 
 	  	
    public String powersTwoUnder()

    {
 	  	
    /**
 	  	
    * @return string.
 	  	
    * Method powersTwoUnder.
 	  	
    */
 	  	
       String output = ""; 
 	  	
       int powers = 1;
 	  	
       while (powers < number) {
 	  	
          output += powers + "\t";  //concatenate to output
 	  	
          powers = powers * 2; //get next power of 2
 	  	
       }
 	  	
       return output;
 	  	
    }
 	  	
 
	  	
    public  int isGreater(int compareNumber) 

 	 	
	  	
    {
 	  	
    /**
 	  	
    * @returns int. 
 	  	
    * Method isGreater.
 	  	
    */
 	  	
       if (number > compareNumber) {
 	  	
          return 1;
 	  	
       }
 	  	
       else if (number < compareNumber) {
 	  	
          return -1;
 	  	
       }
 	  	
       else {
 	  	
          return 0;
 	  	
       }
 	  	
    }
	  	
 
	  	
    public String toString()

 	 	
	  	
    {
 	  	
    /**
 	  	
    * @return String.
 	  	
    * Method toString.
 	  	
    */
 	  	
       return number + ""; 
 	  	
    }
 	  	
 
 	  	
 
 	  	
 
 	  	
 }
