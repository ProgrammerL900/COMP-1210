/** InventoryApp with main method.
 2	  	
 * Activity 09.
 3	  	
 * @author Laura Wilson comp 1210 001.
 4	  	
 * @version 11/2/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** InventoryApp class.
 8	  	
 * with main method.
 9	  	
 */
 10	  	
 
 11	  	
 public class InventoryApp {
 12	  	
 //main method
 13	  	
 
 14	  	
 /** main method.
 15	  	
 * @param args -- (not used).
 16	  	
 */
 17	  	
 
 18	  	
    public static void main(String[] args) {
 19	  	
       InventoryItem.setTaxRate(0.05);
 20	  	
    
 21	  	
       InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
 22	  	
       System.out.println(item1);
 23	  	
       
 24	  	
       ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
 25	  	
       System.out.println(item2);
 26	  	
       
 27	  	
       OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
 28	  	
       item3.setWordCount(700);
 29	  	
       System.out.println(item3);
 30	  	
       
 31	  	
       OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
 32	  	
       item4.setAuthor("L. G. Jones");
 33	  	
       System.out.println(item4);
 34	  	
    
 35	  	
    }
 36	  	
 
 37	  	
 
 38	  	
  
 39	  	
 }
