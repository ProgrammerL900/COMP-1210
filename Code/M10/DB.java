/** DB file.
 2	  	
 * Project 09.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/4/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** abstract DB class with fields.
 8	  	
 */
 9	  	
 
 10	  	
 import java.text.DecimalFormat;
 11	  	
 
 12	  	
 /** DB abract class. 
 13	  	
 */
 14	  	
 
 15	  	
 public abstract class DB {
 16	  	
 //fields
 17	  	
    protected String name = "";
 18	  	
    protected double bCost = 0;
 19	  	
    protected double storage = 0; 
 20	  	
    protected static int countObj = 0;
 21	  	
 
 22	  	
 //constructor
 23	  	
 
 24	  	
 /** DB construtor with parameters.
 25	  	
 * @param nameIn for name.
 26	  	
 * @param bCostIn for cost.
 27	  	
 * @param storageIn for storage.
 28	  	
 */
 29	  	
    public DB(String nameIn, double bCostIn, double storageIn) {
 30	  	
       name = nameIn;
 31	  	
       bCost = bCostIn;
 32	  	
       storage = storageIn;
 33	  	
       countObj++;
 34	  	
    }
 35	  	
    
 36	  	
    //methods
 37	  	
    
 38	  	
    //getName
 39	  	
    /** getName method.
 40	  	
    * @return getName.
 41	  	
    */
 42	  	
    public String getName() {
 43	  	
       
 44	  	
       return name;
 45	  	
    }
 46	  	
    
 47	  	
    //setName
 48	  	
    /** setName method.
 49	  	
    * @param nameIn for name.
 50	  	
    * @return setName.
 51	  	
    */
 52	  	
    public String setName(String nameIn) {
 53	  	
       name = nameIn;
 54	  	
       return name;
 55	  	
    }
 56	  	
    
 57	  	
    //getBaseCost
 58	  	
    /** getBaseCost method.
 59	  	
    * @return getBaseCost.
 60	  	
    */
 61	  	
    public double getBaseCost() {
 62	  	
       return bCost;
 63	  	
    }
 64	  	
    
 65	  	
    //setBaseCost
 66	  	
    /** setBaseCost method.
 67	  	
    * @param bCostIn for cost.
 68	  	
    * @return setBaseCost.
 69	  	
    */
 70	  	
    public double setBaseCost(double bCostIn) {
 71	  	
       bCost = bCostIn;
 72	  	
       return bCost;
 73	  	
    }
 74	  	
    
 75	  	
    //getDBstorage
 76	  	
    /** getDbStorage method.
 77	  	
    * @return getDbStorage.
 78	  	
    */
 79	  	
    public double getDbStorage() {
 80	  	
       return storage;
 81	  	
    }
 82	  	
    
 83	  	
    //getDbStorage
 84	  	
    /** setDbStorage method.
 85	  	
    * @param storageIn for storage.
 86	  	
    * @return setDbStorage.
 87	  	
    */
 88	  	
    public double setDbStorage(double storageIn) {
 89	  	
       storage = storageIn;
 90	  	
       return storage;
 91	  	
    }
 92	  	
    
 93	  	
    //getCount
 94	  	
    /** getCount method.
 95	  	
    * @return getCount.
 96	  	
    */
 97	  	
    public static int getCount() {
 98	  	
       return countObj;
 99	  	
    }
 100	  	
    
 101	  	
    //resetCount
 102	  	
    /** resetCount method.
 103	  	
    * @return resetCount.
 104	  	
    */
 105	  	
    public static int resetCount() {
 106	  	
       countObj = 0;
 107	  	
       return countObj;
 108	  	
    }
 109	  	
    
 110	  	
    //toString
 111	  	
    /** toString method.
 112	  	
    * @return toString.
 113	  	
    */
 114	  	
    public String toString() {
 115	  	
       String result = "";
 116	  	
       DecimalFormat df = new DecimalFormat("$#,##0.00");
 117	  	
       DecimalFormat ds = new DecimalFormat("#.000");
 118	  	
       result = getName() + " (" + this.getClass() + ")" + " Monthly Cost: " 
 119	  	
          + df.format(monthlyCost()) + "\n"
 120	  	
          + "Storage: " + ds.format(getDbStorage()) + " TB\n"
 121	  	
          + "Base Cost: " + df.format(getBaseCost());
 122	  	
          
 123	  	
      
 124	  	
       return result;
 125	  	
    }
 126	  	
    
 127	  	
    
 128	  	
    //monthly cost
 129	  	
    /** monthly cost method.
 130	  	
    * @return monthlyCost.
 131	  	
    */
 132	  	
    public abstract double monthlyCost();
 133	  	
    
 134	  	
    
 135	  	
    /** compareTo method.
 136	  	
    * @return compareTo.
 137	  	
    * @param obj for the DB obj.
 138	  	
    */
 139	  	
    public int compareTo(DB obj) {
 140	  	
       return this.getName().compareToIgnoreCase(obj.getName());
 141	  	
    }
 142	  	
       
 143	  	
    
 144	  	
 }
