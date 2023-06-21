 /** CentralizedDB file.
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
 /** CentralizedDB class with fields
 8	  	
 */
 9	  	
 
 10	  	
 import java.text.DecimalFormat;
 11	  	
 
 12	  	
 /** CentralizedDb class.
 13	  	
 */
 14	  	
 
 15	  	
 
 16	  	
 public class CentralizedDB extends DB {
 17	  	
 //fields
 18	  	
    private double license;
 19	  	
 
 20	  	
 //constructor
 21	  	
 /** CentralizedDB contrutor.
 22	  	
 * @param nameIn for name.
 23	  	
 * @param bCostIn for the cost.
 24	  	
 * @param storageIn for storage.
 25	  	
 * @param licenseIn for license.
 26	  	
 */
 27	  	
    public CentralizedDB(String nameIn, double bCostIn, 
 28	  	
       double storageIn, double licenseIn) {
 29	  	
       super(nameIn, bCostIn, storageIn);
 30	  	
       license = licenseIn;
 31	  	
    }
 32	  	
    
 33	  	
    //methods
 34	  	
    
 35	  	
    //getLicense
 36	  	
    /** getLicense method.
 37	  	
    * @return getLicense.
 38	  	
    */
 39	  	
    public double getLicense() {
 40	  	
       return license;
 41	  	
    }
 42	  	
    
 43	  	
    //setLicense
 44	  	
    /** setLicense method.
 45	  	
    * @return setLicense.
 46	  	
    * @param licenseIn for license.
 47	  	
    */
 48	  	
    public double setLicense(double licenseIn) {
 49	  	
       license = licenseIn;
 50	  	
       return license;
 51	  	
    }
 52	  	
    
 53	  	
   //montlycost
 54	  	
   /** monthlyCost method.
 55	  	
   * @return monthlyCost.
 56	  	
   */
 57	  	
    public double monthlyCost() {
 58	  	
       return (bCost + license);
 59	  	
    }
 60	  	
    
 61	  	
    //toString
 62	  	
    /** toString method.
 63	  	
    * @return toString.
 64	  	
    */
 65	  	
   
 66	  	
    public String toString() {
 67	  	
       super.toString();
 68	  	
       DecimalFormat df = new DecimalFormat("$#,##0.00");
 69	  	
       String string = super.toString() + "\nLicense: " 
 70	  	
          + df.format(getLicense());
 71	  	
       return string;
 72	  	
       
 73	  	
       
 74	  	
    }
 75	  	
    
 76	  	
    
 77	  	
 
 78	  	
 
 79	  	
 }
