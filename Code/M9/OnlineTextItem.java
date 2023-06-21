 /** OnlineTextItems.
 2	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 3	  	
 * @version 11/2/2020.
 4	  	
 */
 5	  	
 
 6	  	
 //class
 7	  	
 /** OnlineTextItem class.
 8	  	
 */
 9	  	
 public abstract class OnlineTextItem extends InventoryItem {
 10	  	
    //constructor
 11	  	
    /** OnlinceTextItem cosntructor.
 12	  	
    * @param nameIn for the name.
 13	  	
    * @param priceIn for the price.
 14	  	
    */
 15	  	
    public OnlineTextItem(String nameIn, double priceIn) {
 16	  	
       super(nameIn, priceIn);
 17	  	
    }
 18	  	
    //calculateCost method
 19	  	
    /** calulateCost method.
 20	  	
    * @return price.
 21	  	
    */
 22	  	
    public double calculateCost() {
 23	  	
       return price;
 24	  	
    }
 25	  	
 }
