/**TemperatureInfo
 2	  	
 *
 3	  	
 *Activity 06.
 4	  	
 * @author Laura Wilson comp 1210 -- 001.
 5	  	
 * @version 9/29/2020.
 6	  	
 */
 7	  	
 
 8	  	
 import java.util.Scanner;
 9	  	
 import java.util.ArrayList;
 10	  	
 
 11	  	
 
 12	  	
 /** public class TemperatureInfo that holds main method.
 13	  	
 */
 14	  	
 
 15	  	
 public class TemperatureInfo {
 16	  	
 /** public class TemperaturesInfo.
 17	  	
 * @param args Command line arguments (not used).
 18	  	
 */
 19	  	
 
 20	  	
    public static void main(String[] args) {
 21	  	
    /** main sting method.
 22	  	
    * @param args Command line arguments (not used). 
 23	  	
    */
 24	  	
    
 25	  	
       Scanner userInput = new Scanner(System.in);
 26	  	
       ArrayList<Integer> tempsList = new ArrayList<Integer>();
 27	  	
    
 28	  	
       String tempInput = "";
 29	  	
       do {
 30	  	
          System.out.print("Enter a temperature (or nothing to end list): ");
 31	  	
          tempInput = userInput.nextLine().trim();
 32	  	
          if (!tempInput.equals("")) {
 33	  	
             tempsList.add(Integer.parseInt(tempInput));
 34	  	
          }
 35	  	
       } while (!tempInput.equals(""));
 36	  	
       Temperatures temps = new Temperatures(tempsList);
 37	  	
    
 38	  	
       char choice = 'E';
 39	  	
       do {
 40	  	
          System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
 41	  	
             + "[P]rint, [E]nd: ");
 42	  	
          choice = userInput.nextLine().toUpperCase().charAt(0);
 43	  	
          switch (choice) {
 44	  	
             case 'L':
 45	  	
                System.out.println("\tLow is " + temps.getLowTemp());
 46	  	
                break;
 47	  	
             case 'H':
 48	  	
                System.out.println("\tHigh is " + temps.getHighTemp());
 49	  	
                break;
 50	  	
             case 'P':
 51	  	
                System.out.println(temps);
 52	  	
                break;
 53	  	
             case 'E':
 54	  	
                System.out.println("\tDone");
 55	  	
                break;
 56	  	
             default:
 57	  	
                System.out.println("\tInvalid choice!");
 58	  	
          }
 59	  	
       } while (choice != 'E');
 60	  	
       
 61	  	
    
 62	  	
    }
 63	  	
 }
