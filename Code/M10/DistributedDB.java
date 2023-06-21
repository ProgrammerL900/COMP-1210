 /** DistributedDB file.
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
 /** DistributedDB class
 8	  	
 */
 9	  	
 import java.text.DecimalFormat;
 10	  	
 
 11	  	
 /** DistributedDB class.
 12	  	
 */
 13	  	
 
 14	  	
 public class DistributedDB extends DB {
 15	  	
 //fields
 16	  	
    protected int users = 0;
 17	  	
    protected double uCost = 0;
 18	  	
    /** COST_FACTOR  constant.
 19	  	
    */
 20	  	
    public static final double COST_FACTOR = 1.1;
 21	  	
 
 22	  	
 //constructor
 23	  	
 /** DistributedDB constructor.
 24	  	
 * @param nameIn for name.
 25	  	
 * @param bCostIn for cost.
 26	  	
 * @param storageIn for storage.
 27	  	
 * @param usersIn for users.
 28	  	
 * @param uCostIn for cost. 
 29	  	
 */
 30	  	
    public DistributedDB(String nameIn, double bCostIn, double storageIn, 
 31	  	
       int usersIn, double uCostIn) {
 32	  	
       super(nameIn, bCostIn, storageIn);
 33	  	
       users = usersIn;
 34	  	
       uCost = uCostIn;
 35	  	
    }
 36	  	
    
 37	  	
    //methods
 38	  	
    
 39	  	
    //getNumberOfUsers 
 40	  	
    /** getNumberOfUsers method.
 41	  	
    * @return getNumbersOfUsers.
 42	  	
    */
 43	  	
    public int getNumberOfUsers() {
 44	  	
       
 45	  	
       return users;
 46	  	
    }
 47	  	
    
 48	  	
    //setnumberofUsers
 49	  	
    /** setNumberOfUsers method.
 50	  	
    * @param usersIn for name.
 51	  	
    * @return setNumbeOfUsers.
 52	  	
    */
 53	  	
    public int setNumberOfUsers(int usersIn) {
 54	  	
       users = usersIn;
 55	  	
       return users;
 56	  	
    }
 57	  	
    
 58	  	
    //getCostPerUsers
 59	  	
    /** getCostPerUsers method.
 60	  	
    * @return getCostPerUser.
 61	  	
    */
 62	  	
    public double getCostPerUser() {
 63	  	
       
 64	  	
       return uCost;
 65	  	
    }
 66	  	
    
 67	  	
    //setCostPerUsers
 68	  	
    /** setCostPerUser method.
 69	  	
    * @param uCostIn for cost.
 70	  	
    * @return setCostPerUser. 
 71	  	
    */
 72	  	
    public double setCostPerUser(double uCostIn) {
 73	  	
       uCost = uCostIn;
 74	  	
       return uCost;
 75	  	
    }
 76	  	
    
 77	  	
    //userCost
 78	  	
    /** userCost method.
 79	  	
    * @return userCost. 
 80	  	
    */
 81	  	
    public double userCost() {
 82	  	
       return (users * uCost);
 83	  	
    }
 84	  	
    
 85	  	
    //getCostFactor
 86	  	
    /** getCostFactor method.
 87	  	
    * @return getCostFactor.
 88	  	
    */
 89	  	
    public double getCostFactor() {
 90	  	
       return COST_FACTOR;
 91	  	
    }
 92	  	
    
 93	  	
    //monthlyCost
 94	  	
    /** monthlyCost method.
 95	  	
    * @return monthlyCost.
 96	  	
    */
 97	  	
    public double monthlyCost() {
 98	  	
       return (bCost + userCost() * DistributedDB.COST_FACTOR);
 99	  	
    }
 100	  	
    
 101	  	
    //toString
 102	  	
    /** toString method. 
 103	  	
    * @return toString.
 104	  	
    */
 105	  	
    public String toString() {
 106	  	
       DecimalFormat df = new DecimalFormat("#.###");
 107	  	
       DecimalFormat ds = new DecimalFormat("$#,##0.00");
 108	  	
       String string = super.toString() + "\nNumber of Users: " 
 109	  	
          + getNumberOfUsers() 
 110	  	
          + "\nCost per User: " + ds.format(getCostPerUser()) + "\n" 
 111	  	
          + "User Cost: " + ds.format(userCost()) + "\n" 
 112	  	
          + "Cost Factor: " + getCostFactor();
 113	  	
          
 114	  	
       return string;
 115	  	
    }
 116	  	
 }
