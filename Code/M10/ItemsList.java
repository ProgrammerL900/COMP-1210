/** ItemsList.
 2	  	
 * Activity 10.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/9/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** public class. */
 8	  	
 public class ItemsList {
 9	  	
 //instance variables
 10	  	
 
 11	  	
    private InventoryItem[] inventory;
 12	  	
    private int count;
 13	  	
 
 14	  	
 //constructor
 15	  	
 /** ItemList constructor. */
 16	  	
    public ItemsList() {
 17	  	
       inventory = new InventoryItem[20];
 18	  	
       count = 0;
 19	  	
    
 20	  	
    }
 21	  	
    
 22	  	
    //methods
 23	  	
    /** addItem method.
 24	  	
    * @param itemIn for the itemIn.
 25	  	
    */
 26	  	
    
 27	  	
    public void addItem(InventoryItem itemIn) {
 28	  	
       inventory[count] = itemIn;
 29	  	
       count++;
 30	  	
    }
 31	  	
    
 32	  	
    /** calculateTotal method.
 33	  	
    * @param electronicsSurcharge for the surcharge.
 34	  	
    * @return calculateTotal.
 35	  	
    */
 36	  	
    
 37	  	
    public double calculateTotal(double electronicsSurcharge) {
 38	  	
       double total = 0;
 39	  	
       for (int i = 0; i < count; i++) {
 40	  	
          if (inventory[i] instanceof ElectronicsItem) {
 41	  	
             total += inventory[i].calculateCost() + electronicsSurcharge;
 42	  	
          } else {
 43	  	
             total += inventory[i].calculateCost();
 44	  	
          }
 45	  	
       
 46	  	
       }
 47	  	
       return total;
 48	  	
       
 49	  	
    }
 50	  	
    
 51	  	
    /** toString method.
 52	  	
    * @return toString.
 53	  	
    */
 54	  	
    
 55	  	
    public String toString() {
 56	  	
       String output = "All inventory:\n\n";
 57	  	
    
 58	  	
       for (int i = 0; i < count; i++) {
 59	  	
          output += inventory[i] + "\n";
 60	  	
       }
 61	  	
       return output;
 62	  	
    }
 63	  	
    
 64	  	
    
 65	  	
 }
