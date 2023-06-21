 /** MonthlyCostComparator file.
 2	  	
 * Project 10.
 3	  	
 * @author Laura Wilson com 1210 -- 001.
 4	  	
 * @version 11/12/2020.
 5	  	
 */
 6	  	
 
 7	  	
 import java.util.Comparator;
 8	  	
 
 9	  	
 /** MonthlyCostComparator main method.
 10	  	
 */
 11	  	
 
 12	  	
 public class MonthlyCostComparator implements Comparator<DB> {
 13	  	
 //highest to lower compare two objects
 14	  	
 /** compare.
 15	  	
 * @return int.
 16	  	
 * @param d1 for the DB.
 17	  	
 * @param d2 for the DB.
 18	  	
  */
 19	  	
    public int compare(DB d1, DB d2) {
 20	  	
       if (d1.monthlyCost() > d2.monthlyCost()) { 
 21	  	
          return -1; 
 22	  	
       }
 23	  	
       else if (d1.monthlyCost() < d2.monthlyCost()) {
 24	  	
          return 1; 
 25	  	
       } 
 26	  	
       else { 
 27	  	
          return 0; 
 28	  	
       }
 29	  	
    }
 30	  	
 
 31	  	
 }
