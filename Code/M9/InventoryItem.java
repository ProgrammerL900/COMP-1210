 /** Inventory Item. 
 2	  	
 * 
 3	  	
 * Activity 09.
 4	  	
 * @Author Laura Wilson -- comp 1210 -- 001.
 5	  	
 * @version 11/2/2020.
 6	  	
 */
 7	  	
 
 8	  	
 /** Inventory Item class. 
 9	  	
 */
 10	  	
 public class InventoryItem {
 11	  	
 //three variables
 12	  	
    protected String name = "";
 13	  	
    protected double price;
 14	  	
    private static double taxRate = 0;
 15	  	
    
 16	  	
    /** Contructor InventroyItem.
 17	  	
    * @param nameIn for the string name.
 18	  	
    * @param priceIn for the double price.
 19	  	
    */
 20	  	
    
 21	  	
    public InventoryItem(String nameIn, double priceIn) {
 22	  	
       name = nameIn;
 23	  	
       price = priceIn;
 24	  	
    }
 25	  	
    
 26	  	
    /** getName method.
 27	  	
    * @return getName.
 28	  	
    */
 29	  	
    
 30	  	
    public String getName() {
 31	  	
       return name;
 32	  	
    }
 33	  	
    
 34	  	
    /** calculateCost method.
 35	  	
    * @return calculateCost.
 36	  	
    */
 37	  	
    public double calculateCost() {
 38	  	
       return price * (1 + taxRate);
 39	  	
    }
 40	  	
    
 41	  	
    /** setTaxRate method.
 42	  	
    * @param taxRateIn for the taxRate.
 43	  	
    */
 44	  	
    public static void setTaxRate(double taxRateIn) {
 45	  	
       taxRate = taxRateIn;
 46	  	
    }
 47	  	
    
 48	  	
    /** toString method. 
 49	  	
    * @return toString.
 50	  	
    */
 51	  	
    public String toString() {
 52	  	
       return name + ": $" + calculateCost();
 53	  	
    }
 54	  	
 }
