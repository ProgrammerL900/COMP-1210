 /**Program that displays users's name, age, and gender.
 	  	
 * Calculations for age in minutes and centuries. 
 	  	
 * Max heart rate based on age and gende.
 	  	
 *
 	  	
 * @author Laura Wilson -- comp 1210 -- 001
 	  	
 * @version 9/1/2020
 	  	
 */
 	  	
 
 	  	
 
 	  	
 import java.util.Scanner; 
 	  	
 
 	  	
 /**import for scanner.
 	  	
 */
 	  	
 
 	  	
 public class AgeStatistics {
 	  	
 
 	  	
 /**Age staticstics for every input.
 	  	
 * @param args Command Line argument (not used).
 	  	
 */
 	  	
 
 	  	
    public static void main(String[] args) {
 	  	
    
 	  	
    /** sets every variable. 
 	  	
    *  
 	  	
    */
 	  	
    
 	  	
       Scanner userInput = new Scanner(System.in);
 	  	
       String name = " ";
 	  	
       int ageInYears = 0;
 	  	
       int gender = 0;
 	  	
       double maxHeartRate = 0;
 	  	
    
 	  	
    //prompt the user for their name: 
 	  	
       System.out.print("Enter your name: ");
 	  	
       name = userInput.nextLine();
 	  	
    
 	  	
    //prompt the user for their age:
 	  	
       System.out.print("Enter your age in years: ");
 	  	
       ageInYears = userInput.nextInt();
 	  	
       
 	  	
    //prompt the suser for their gender: 
 	  	
       System.out.print("Enter your gender (1 for female and 0 for male): ");
   	
       gender = userInput.nextInt();
 	  	
    
 	  	
    //covert age: 
 	  	
       System.out.println(" \tYour age in minutes is "
 	  	
          + ageInYears * 525600 + " minutes.");
 	  	
       
 	  	
       System.out.println(" \tYour age in centures is "
 	  	
          + (double) ageInYears / 100 + " centuries.");
 	  	
       
 	  	
    //display max heart rate
 	  	
       System.out.print("Your max heart rate is ");
 	  	
       
 	  	
       if (gender == 1) { // female MHR calculations
 	  	
          maxHeartRate = (209 - (0.7 * ageInYears)); 
 	  	
       }
 	  	
       
 	  	
       else {  //male MHR calculations
 	  	
          maxHeartRate = (214 - (0.8 * ageInYears));
 	  	
       }
 	  	
       
 	  	
       System.out.println(maxHeartRate + " beats per minute.");
 	  	
     
 	  	
    }
 	  	
 }
