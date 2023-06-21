 /** OnlineBook.
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
 /** OnlineBook class extends.
 8	  	
 */
 9	  	
 
 10	  	
 public class OnlineBook extends OnlineTextItem {
 11	  	
    protected String author;
 12	  	
 
 13	  	
 //constructor
 14	  	
 /** OnlineBook constructor.
 15	  	
 * @param nameIn for the name.
 16	  	
 * @param priceIn for the price.
 17	  	
 */
 18	  	
    public OnlineBook(String nameIn, double priceIn) {
 19	  	
       super(nameIn, priceIn);
 20	  	
       
 21	  	
       author = "Author Not Listed";
 22	  	
    }
 23	  	
    
 24	  	
       
 25	  	
    //setAuthor method
 26	  	
    /** setAuthor method.
 27	  	
    * @param authorIn for the author.
 28	  	
    * @return setAuthor.
 29	  	
    */
 30	  	
    public String setAuthor(String authorIn) {
 31	  	
       author = authorIn;
 32	  	
       return author;
 33	  	
    }
 34	  	
    
 35	  	
    //override of toString method
 36	  	
    /** toString method.
 37	  	
    * @return toString.
 38	  	
    */
 39	  	
    public String toString() {
 40	  	
       return name + " - " + author 
 41	  	
          + ": $" + price;
 42	  	
    }
 43	  	
 
 44	  	
 }
