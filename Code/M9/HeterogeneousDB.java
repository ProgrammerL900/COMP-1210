 /** HeterogeneousDB file.
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
 /** HeterogeneousDB class.
 8	  	
 */
 9	  	
 
 10	  	
 public class HeterogeneousDB extends DistributedDB {
 11	  	
 //fields
 12	  	
 /** COST_FACTOR constant.
 13	  	
 */
 14	  	
    public static final double COST_FACTOR = 1.3;
 15	  	
 
 16	  	
 //constructor
 17	  	
 /** HeterogeneousDB constructor.
 18	  	
 * @param nameIn for name field.
 19	  	
 * @param bCostIn for basecost.
 20	  	
 * @param storageIn for storage.
 21	  	
 * @param usersIn for users.
 22	  	
 * @param uCost for user cost.
 23	  	
 */
 24	  	
    public HeterogeneousDB(String nameIn, double bCostIn, 
 25	  	
       double storageIn, int usersIn, double uCost) {
 26	  	
       super(nameIn, bCostIn, storageIn, usersIn, uCost);
 27	  	
    }
 28	  	
    
 29	  	
    //methods
 30	  	
    
 31	  	
    //getCostFactor
 32	  	
    /** getCostFactor method.
 33	  	
    * @return getCostFactor.
 34	  	
    */
 35	  	
    public double getCostFactor() {
 36	  	
       return COST_FACTOR;
 37	  	
    }
 38	  	
    
 39	  	
    //monthlyCost
 40	  	
    /** monthlyCost method.
 41	  	
    * @return monthlyCost.
 42	  	
    */
 43	  	
    public double monthlyCost() {
 44	  	
       return (bCost + userCost() * HeterogeneousDB.COST_FACTOR);
 45	  	
    }
 46	  	
    
 47	  	
    
 48	  	
 }
