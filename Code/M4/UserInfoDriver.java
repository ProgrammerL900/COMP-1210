/**UserInfo driver.
 	  	
 *Creates two instances of UserInfo and.
 	  	
 *invokes the methods in them.
 	  	
 * 
 	  	
 *Activity 04.
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/14/2020.
 	  	
 */
   	
 
 	  	
 public class UserInfoDriver { 
 	  	
 /**UserInfoDriver.
 	  	
 * @param args -- (not used).
 	  	
 */
 	  	
    public static void main(String[] args) {
 	  	
    
 	  	
       UserInfo user1 = new UserInfo("Pat", "Doe");
 	  	
       System.out.println("\n" + user1);
 	  	
       user1.setLocation("Auburn");
 	  	
       user1.setAge(19);
 	  	
       user1.logOn();
 	  	
       System.out.println("\n" + user1);
 	  	
       
 	  	
       UserInfo user2 = new UserInfo("Sam", "Jones");
 	  	
       System.out.println("\n" + user2);
 	  	
       user2.setLocation("Atlanta");
 	  	
       user2.setAge(21);
 	  	
       user2.logOn();
 	  	
       System.out.println("\n" + user2);
 	  	
       
 	  	
    } 	  	
 }
