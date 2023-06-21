 /** DBPart3 file.
 2	  	
 */
 3	  	
 
 4	  	
 import java.io.FileNotFoundException;
 5	  	
 
 6	  	
 /** public class DBPart3. 
 7	  	
 */
 8	  	
 
 9	  	
 public class DBPart3 {
 10	  	
 //main method
 11	  	
 /** main method.
 12	  	
 * @param args -- not used. */
 13	  	
    public static void main(String[] args) 
 14	  	
    {
 15	  	
       try {
 16	  	
          if (args.length > 0) {
 17	  	
             String fileName = args[0];
 18	  	
             DBList dbList = new DBList();
 19	  	
             dbList.readFile(fileName);
 20	  	
             System.out.print(dbList.generateReport());
 21	  	
             System.out.print(dbList.generateReportByName());
 22	  	
             System.out.print(dbList.generateReportByMonthlyCost());
 23	  	
             System.out.print(dbList.generateInvalidRecordsReport());
 24	  	
          }
 25	  	
          else {
 26	  	
             System.out.print("File name expected  as command " 
 27	  	
                + "line argument.\nProgram ending.");
 28	  	
          }
 29	  	
       }
 30	  	
       catch (FileNotFoundException exception) {
 31	  	
          System.out.println("*** Attempted to read file: " 
 32	  	
             + args[0] + " (No such file or directory)");
 33	  	
       }
 34	  	
    }
 35	  	
 }
