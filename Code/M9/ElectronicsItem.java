 /** ElectricItems file.
 2	  	
 * Activity 09.
 3	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 4	  	
 * @version 11/2/2020.
 5	  	
 */
 6	  	
 /** ElectronicsItem class that extends from InventroyItem.
 7	  	
 */
 8	  	
 public class ElectronicsItem extends InventoryItem {
 9	  	
    protected double weight;
 10	  	
    /** SHIPPING_COST java doc.
 11	  	
    */
 12	  	
    public static final double SHIPPING_COST = 1.5;
 13	  	
    
 14	  	
    //constructor
 15	  	
   /** Constructor.
 16	  	
   * @param nameIn for the name.
 17	  	
   * @param priceIn for the price.
 18	  	
   * @param weightIn for the weight.
 19	  	
   */
 20	  	
    public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
 21	  	
       super(nameIn, priceIn);
 22	  	
       weight = weightIn;
 23	  	
    }
 24	  	
    
 25	  	
    /** CalculateCost method override.
 26	  	
    * @return calculateCost.
 27	  	
    */
 28	  	
    public double calculateCost() {
 29	  	
       return super.calculateCost() + (SHIPPING_COST * weight);
 30	  	
    }
 31	  	
 }
