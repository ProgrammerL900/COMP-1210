 /** DBPart2 file.
 2	  	
 * Project 10.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/12/2020.
 5	  	
 */
 6	  	
 
 7	  	
 import java.io.FileNotFoundException;
 8	  	
 
 9	  	
 /** DBpart2 class.
 10	  	
 */
 11	  	
 
 12	  	
 public class DBPart2 {
 13	  	
 /** main method.
 14	  	
 * @param args -- not used.
 15	  	
 * @throws FileNotFoundException for the filenotfound.
 16	  	
 */
 17	  	
    public static void main(String[] args) throws FileNotFoundException {
 18	  	
    
 19	  	
       try {
 20	  	
          if (args.length > 0) {
 21	  	
             String fileName = args[0];
 22	  	
             DBList dbList = new DBList();
 23	  	
             dbList.readFile(fileName);
 24	  	
             System.out.println(dbList.generateReport());
 25	  	
             System.out.println(dbList.generateReportByName());
 26	  	
             System.out.println(dbList.generateReportByMonthlyCost());
 27	  	
          }
 28	  	
       }
 29	  	
       catch (FileNotFoundException exception) {
 30	  	
          System.out.println("File name expected as command " 
 31	  	
             + "line argument. \n Program ending.");
 32	  	
       }
 33	  	
    }
 34	  	
 }
