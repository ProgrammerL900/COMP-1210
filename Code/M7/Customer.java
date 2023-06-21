/** Customer files.
 2	  	
 * Activity 07B -- Customer.
 3	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 4	  	
 * @version 10/19/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** class Customer with three fields.
 8	  	
 * implements comparable.
 9	  	
 */
 10	  	
 
 11	  	
 public class Customer implements Comparable<Customer> {
 12	  	
 //three instance variables
 13	  	
    private String name, location;
 14	  	
    private double balance;
 15	  	
    
 16	  	
    
 17	  	
 
 18	  	
 //constructor
 19	  	
 /** Customer constructor.
 20	  	
 * sets three variables.
 21	  	
 * @param nameIn for thet string.
 22	  	
 */
 23	  	
    public Customer(String nameIn) {
 24	  	
       name = nameIn;
 25	  	
       location = "";
 26	  	
       balance = 0; 
 27	  	
    }
 28	  	
   
 29	  	
    //methods 
 30	  	
    /** setLocation method with parameter.
 31	  	
    * @param locationIn for the parameter.
 32	  	
    */
 33	  	
 
 34	  	
    public void setLocation(String locationIn) {
 35	  	
       location = locationIn;
 36	  	
    }
 37	  	
    
 38	  	
    /** changeBalance method.
 39	  	
    *@param amount for the parameter.
 40	  	
    */
 41	  	
    
 42	  	
    public void changeBalance(double amount) {
 43	  	
       this.balance += amount;
 44	  	
      
 45	  	
    }
 46	  	
    
 47	  	
    /** getLocation method.
 48	  	
    * @return getLocation.
 49	  	
    */
 50	  	
    
 51	  	
    public String getLocation() {
 52	  	
       return location;
 53	  	
    }
 54	  	
    
 55	  	
    /** getBalance method.
 56	  	
    * @return getBalance.
 57	  	
    */
 58	  	
    
 59	  	
    public double getBalance() {
 60	  	
       return balance;
 61	  	
    }
 62	  	
    
 63	  	
       
 64	  	
    //second method for setLocation
 65	  	
    /** setLocation method.
 66	  	
    * @param city for the parameter.
 67	  	
    * @param state for the parameter.
 68	  	
    */
 69	  	
    
 70	  	
    public void setLocation(String city, String state) {
 71	  	
       location = city + ", " + state;
 72	  	
    }
 73	  	
    
 74	  	
    //create toString method 
 75	  	
    /** toString method.
 76	  	
    * @return toString.
 77	  	
    */
 78	  	
    public String toString() {
 79	  	
       String output = name + "\n" 
 80	  	
          + location + "\n" + "$" + balance;
 81	  	
    
 82	  	
       return output; 
 83	  	
    
 84	  	
    }
 85	  	
    
 86	  	
    //new method for comparable
 87	  	
    /** compareTo method.
 88	  	
    * @param obj for the Customer obj.
 89	  	
    * @return compareTo.
 90	  	
    */
 91	  	
    
 92	  	
    public int compareTo(Customer obj) {
 93	  	
       if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
 94	  	
          return 0;
 95	  	
       }
 96	  	
       else if (this.balance < obj.getBalance()) {
 97	  	
          return -1;
 98	  	
       }
 99	  	
       else {
 100	  	
          return 1;
 101	  	
       }
 102	  	
    }
 103	  	
    
 104	  	
 }
