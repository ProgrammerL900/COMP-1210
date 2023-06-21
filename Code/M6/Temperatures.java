/**Temperature that will hold integer. 
 2	  	
 *set values of daily temps.
 3	  	
 * 
 4	  	
 *Activity 06.
 5	  	
 * @author Laura Wilson -- comp 1210 -- 001. 
 6	  	
 * @version 9/28/2020.
 7	  	
 */
 8	  	
 
 9	  	
 import java.util.ArrayList;
 10	  	
 
 11	  	
 /** public class Temperatures.
 12	  	
 *that holds integer values of daily temps.
 13	  	
 */
 14	  	
 
 15	  	
 public class Temperatures {
 16	  	
     /** public Temperature class that holds daily temps. 
 17	  	
     */
 18	  	
 
 19	  	
     //instance variable
 20	  	
    /**
 21	  	
    * instance variable ArrayList.
 22	  	
    */
 23	  	
    private ArrayList<Integer> temperatures;
 24	  	
    
 25	  	
    //constuctor
 26	  	
    /** public Temperatures constructor with ArrayList.
 27	  	
    * @param temperaturesIn.
 28	  	
    */
 29	  	
    public Temperatures(ArrayList<Integer> temperaturesIn) {
	  	
    /** public Temperatures constructor with ArrayList.
 31	  	
    * @param temperaturesIn.
 32	  	
    */
 33	  	
    
 34	  	
       temperatures = temperaturesIn;
 35	  	
    }
 36	  	
    //methods
 37	  	
    /** public getLowTemp that returns ints.
 38	  	
    * @return getLowTemp method.
 39	  	
    */
 40	  	
    public int getLowTemp() {
 41	  	
    /** 
 42	  	
    * getLowTemp method that returns ints.
 43	  	
    * @return getLowTemp method.
 44	  	
    */
 45	  	
       if (temperatures.isEmpty()) {
 46	  	
          return 0;
 47	  	
       }
 48	  	
    
 49	  	
       int low = temperatures.get(0);
 50	  	
       for (int i = 0; i < temperatures.size(); i++) { 
 51	  	
          if (temperatures.get(i) < low) {
 52	  	
             low = temperatures.get(i);
 53	  	
          }
 54	  	
       }
 55	  	
    
 56	  	
       return low;
 57	  	
    }
 58	  	
    
 59	  	
    /** public getHighTemp method that returns ints.
 60	  	
    * @return getHighTemp method.
 61	  	
    */
 62	  	
    
 63	  	
    public int getHighTemp() {
 64	  	
    /** getHighTemp method that returns int.
 65	  	
    * @return getHighTemp method.
 66	  	
    */
 67	  	
       if (temperatures.isEmpty()) {
 68	  	
          return 0;
 69	  	
       }
 70	  	
       int high = temperatures.get(0);
 71	  	
       for (Integer temp: temperatures) {
 72	  	
          if (temp > high) { 
 73	  	
             high = temp;
 74	  	
          }
 75	  	
       }
 76	  	
       return high;
 77	  	
    }
 78	  	
    
 79	  	
    /** public lowerMinimum method that returns lowIn.
 80	  	
    * @return lowerMinimum method. 
 81	  	
    * @param lowIn.
 82	  	
    */
 83	  	
    
 84	  	
    public int lowerMinimum(int lowIn) {

 85	  	
    /** lowerMinimum method return lowIn.
 86	  	
    * @return lowerMinimum method.
 87	  	
    * @param lowIn.
 88	  	
    */
 89	  	
       return lowIn < getLowTemp() ? lowIn : getLowTemp();
 90	  	
    }
 91	  	
    
 92	  	
    /** public higherMaximum method that returns highIn.
 93	  	
    * @return higherMaximum method.
 94	  	
    * @param highIn.
 95	  	
    */
 96	  	
    
 97	  	
    public int higherMaximum(int highIn) {
 	
    /**
 99	  	
    * higherMaximum method that returns highIn.
 100	  	
    * @return higherMaximum method.
 101	  	
    * @param highIn.
 102	  	
    */
 103	  	
       return highIn > getHighTemp() ? highIn : getHighTemp();
 104	  	
    }
 105	  	
    
 106	  	
    /** public string toString method that returns string.
 107	  	
    * @return String toString.
 108	  	
    */
 109	  	
    
 110	  	
    public String toString() {
 111	  	
    /**
 112	  	
    * toString method that returns a string.
 113	  	
    * @return String toString.
 114	  	
    */
 115	  	
       return "\tTemperatures: " + temperatures
 116	  	
          + "\n\tLow: " + getLowTemp()
 117	  	
          + "\n\tHigh: " + getHighTemp();
 118	  	
    }
 119	  	
 }
