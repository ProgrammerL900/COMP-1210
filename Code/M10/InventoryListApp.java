/** InventoryListApp.
 2	  	
 * Activity 10.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/10/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** public class. */
 8	  	
 
 9	  	
 public class InventoryListApp {
 10	  	
 /** main method.
 11	  	
 * @param args (not used).
 12	  	
 */
 13	  	
 
 14	  	
    public static void main(String[] args) {
 15	  	
       
 16	  	
       ItemsList myItems = new ItemsList();
 17	  	
       InventoryItem.setTaxRate(0.05);
 18	  	
    
 19	  	
       myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
 20	  	
       myItems.addItem(new InventoryItem("motor oil", 9.8));
 21	  	
       myItems.addItem(new OnlineBook("All Things Java", 12.3));
 22	  	
       myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));   
 23	  	
    
 24	  	
       System.out.print(myItems);
 25	  	
       System.out.println("\nTotal: " + myItems.calculateTotal(2.0));
 26	  	
    
 27	  	
    }
 28	  	
    
 29	  	
    
 30	  	
       
 31	  	
 
 32	  	
 }
