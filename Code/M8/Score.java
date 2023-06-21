 * Activity 08.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 10/25/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** Scores class with.
 8	  	
 * instance variables and constructor.
 9	  	
 */
 10	  	
 public class Scores {
 11	  	
 //instance variable
 12	  	
    private int[] numbers;
 13	  	
 
 14	  	
 /** Scores constructor.
 15	  	
 * @param numbersIn for the int[] numbersIn.
 16	  	
 */
 17	  	
    public Scores(int[] numbersIn) {
 18	  	
       numbers = numbersIn;
 19	  	
    }
 20	  	
    /** findEvens method with array evens.
 21	  	
    * @return findEvens.
 22	  	
    */
 23	  	
    public int[] findEvens() {
 24	  	
       int numberEvens = 0;
 25	  	
       for (int i = 0; i < numbers.length; i++) {
 26	  	
          if (numbers[i] % 2 == 0) {
 27	  	
             numberEvens++;
 28	  	
          }
 29	  	
       }
 30	  	
          
 31	  	
          
 32	  	
       int[] evens = new int[numberEvens];
 33	  	
       int count = 0;
 34	  	
       for (int i = 0; i < numbers.length; i++) {
 35	  	
          if (numbers[i] % 2 == 0) {
 36	  	
             evens[count] = numbers[i];
 37	  	
             count++;
 38	  	
          }
 39	  	
       }
 40	  	
       return evens;
 41	  	
    }
 42	  	
    
 43	  	
    
 44	  	
    /** findOdds method with array odds.
 45	  	
    * @return findOdds.
 46	  	
    */
 47	  	
    public int[] findOdds() {
 48	  	
       int numberOdds = 0;
 49	  	
       for (int i = 0; i < numbers.length; i++) {
 50	  	
          if (numbers[i] % 2 != 0) {
 51	  	
             numberOdds++;
 52	  	
          }
 53	  	
       }
 54	  	
          
 55	  	
          
 56	  	
       int[] odds = new int[numberOdds];
 57	  	
       int count = 0;
 58	  	
       for (int i = 0; i < numbers.length; i++) {
 59	  	
          if (numbers[i] % 2 != 0) {
 60	  	
             odds[count] = numbers[i];
 61	  	
             count++;
 62	  	
          }
 63	  	
       }
 64	  	
       return odds;
 65	  	
    }
 66	  	
    
 67	  	
 
 68	  	
    
 69	  	
    
 70	  	
    /** calculateAverage method.
 71	  	
    * @return calculateAverage.
 72	  	
    */
 73	  	
    public double calculateAverage() {
 74	  	
       int sum = 0;
 75	  	
       
 76	  	
       for (int i = 0; i < numbers.length; i++) {
 77	  	
          sum += numbers[i];
 78	  	
       }
 79	  	
       
 80	  	
       return sum / numbers.length;
 81	  	
    }
 82	  	
    
 83	  	
    /** toString method.
 84	  	
    * @return toString.
 85	  	
    */
 86	  	
    public String toString() {
 87	  	
       String result = "";
 88	  	
       for (int i = 0; i < numbers.length; i++) {
 89	  	
          result += numbers[i] + "\t";
 90	  	
       }
 91	  	
       
 92	  	
       return result;
 93	  	
    }
 94	  	
    
 95	  	
    /** toStringInReverse method.
 96	  	
    * @return toStringInReverse.
 97	  	
    */
 98	  	
    public String toStringInReverse() {
 99	  	
       String result = "";
 100	  	
       
 101	  	
       for (int i = numbers.length - 1; i >= 0; i--) {
 102	  	
          result += numbers[i] + "\t";
 103	  	
       }
 104	  	
         
 105	  	
       return result;
 106	  	
    }
 107	  	
    
 108	  	
    
 109	  	
 
 110	  	
 
 111	  	
 }
