/** OnlineArticle.
 2	  	
 * Activity 09.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/2/2020. 
 5	  	
 */
 6	  	
 
 7	  	
 /** OnlineArticle class with extender.
 8	  	
 */
 9	  	
 
 10	  	
 public class OnlineArticle extends OnlineTextItem {
 11	  	
    private int wordCount;
 12	  	
    
 13	  	
 //constructor
 14	  	
 /** OnlineArticle constructor.
 15	  	
 * @param nameIn for name.
 16	  	
 * @param priceIn for price.
 17	  	
 */
 18	  	
    public OnlineArticle(String nameIn, double priceIn) {
 19	  	
       super(nameIn, priceIn);
 20	  	
       wordCount = 0;
 21	  	
    }
 22	  	
    
 23	  	
    //setWordCount method
 24	  	
    /** setWordCount method.
 25	  	
    * @param wordCountIn that takes wordCount.
 26	  	
    * @return setWordCount.
 27	  	
    */
 28	  	
    public double setWordCount(int wordCountIn) {
 29	  	
       wordCount = wordCountIn;
 30	  	
       return wordCount;
 31	  	
    }
 32	  	
 
 33	  	
 }
