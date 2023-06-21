 /** HomogenousDB file.
 2	  	
 * Project 09.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/6/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** HomogeneousDB class with fields.
 8	  	
 */
 9	  	
 
 10	  	
 public class HomogeneousDB extends DistributedDB {
 11	  	
 //fields
 12	  	
 /** COST_FACTOR constant.
 13	  	
 */
 14	  	
    public static final double COST_FACTOR = 1.2;
 15	  	
 
 16	  	
 //constructor
 17	  	
 /** HomogeneousDB constructor.
 18	  	
 * @param nameIn for name.
 19	  	
 * @param bCostIn for cost.
 20	  	
 * @param storageIn for storage.
 21	  	
 * @param users for users.
 22	  	
 * @param uCost for cost of users.
 23	  	
 */
 24	  	
    public HomogeneousDB(String nameIn, double bCostIn, double storageIn,
 25	  	
       int users, double uCost) {
 26	  	
       super(nameIn, bCostIn, storageIn, users, uCost);
 27	  	
       
 28	  	
    }
 29	  	
    
 30	  	
    //methods
 31	  	
    
 32	  	
    //getCostFactor
 33	  	
    /** getCostFactor method.
 34	  	
    * @return getCostFactor.
 35	  	
    */
 36	  	
    public double getCostFactor() {
 37	  	
       return COST_FACTOR;
 38	  	
    }
 39	  	
    
 40	  	
    //monthlyCost
 41	  	
    /** monthlyCost method.
 42	  	
    * @return monthlyCost.
 43	  	
    */
 44	  	
    public double monthlyCost() {
 45	  	
       return (bCost + userCost() * HomogeneousDB.COST_FACTOR);
 46	  	
    }
 47	  	
    
 48	  	
    
 49	  	
 }
