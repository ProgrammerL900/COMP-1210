 /**User Info.
 	  	
 *Activity 04.
 	  	
 *
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/14/2020.
 	  	
 */
 	  	
 
 	  	
 public class UserInfo {
 	  	
 
 	  	
 //instance varibles
 	  	
 
 	  	
    private String firstName;
 	  	
    private String lastName;
 	  	
    private String location;
 	  	
    private int age;
 	  	
    private int status;
 	  	
 
 	  	
    private static final int OFFLINE = 0, ONLINE = 1;
 	  	
 
 	  	
 //constructor
 	  	
 
 	  	
 /**constructor that stores first, last name, location.
 	  	
 *age and status.
 	  	
 */
 	  	
 
 	  	
    public UserInfo(String firstNameIn, String lastNameIn) {

 	   
 	  	
    /**UserInfo string.
 	  	
    * @param args -- (not used).
 	  	
    * @param firstNameIn.
 	  	
    * @param lastNameIn.
 	  	
    */
 	  	
    
 	  	
       firstName = firstNameIn;
 	  	
       lastName = lastNameIn;
 	  	
       location = "Not specified";
 	  	
       age = 0;
 	  	
       status = OFFLINE;
 	  	
    }
 	  	
 
 	  	
 //methods
 	  	
 
 	  	
 /**Method creates and returns output.
 	  	
 *info about UserInfo object.
 	  	
 */
 	  	
 
 	  	
    public String toString() {
 	
    
 	  	
    /**method that creates outputs.
 	  	
    *toString method.
 	  	
    * @param firstNameIn user first name.
 	  	
    * @param lastNameIn user last name. 
 	  	
    */
 	  	
    
 	  	
       String output = "Name: " + firstName + " " 
 	  	
          + lastName + "\n";
 	  	
       output += "Location: " + location + "\n";
 	  	
       output += "Age: " + age + "\n";
 	  	
       output += "Status: ";
 	  	
       if (status == OFFLINE) { 
 	  	
          output += "Offline";
 	  	
       }
 	  	
       else {
 	  	
          output += "Online";
 	  	
       }
 	  	
       return output; 
 	  	
    }
 	  	
    
 	  	
   /**method that sets of the location.
 	  	
    */
 	  	
    
 	  	
    public void setLocation(String locationIn) {

 	 	


 	  	
    /**method for setLocaion.
 	  	
   *setLocation method.
 	  	
    *
 	  	
    */
 	  	
       location = locationIn;
 	  	
    }
 	  	
    
 	  	
    /**method that uses boolean. 
 	  	
    *to set value of age.
 	  	
    */
 	  	
    
 	  	
    public boolean setAge(int ageIn) {

 	  	  	
    /**Method for setAge.
 	  	
    *sets age to value.
 	  	
    * @return ageIn returns ageIn.
 	  	
    */
 	  	
       boolean isSet = false;
 	  	
       if (ageIn > 0) {
 	  	
          age = ageIn;
 	  	
          isSet = true; 
 	  	
       }
 	  	
       return isSet;
 	  	
    }
 	  	
    
 	  	
    /**method that returns age.
 	  	
    */
 	  	
    
 	  	
    public int getAge() {

 	 	
 	  	
    /**method getAge.
 	  	
    *returns the age.
 	  	
    * @return returns age.
 	  	
    */
 	  	
       return age;
 	  	
    }
 	  	
    
 	  	
   /**method that returns location.
 	  	
    */
 	  	
    
 	  	
    public String getLocation() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Expected @return tag.

 	  	
    /**method getLocaion.
 	  	
    *returns the location.
 	  	
    * @return returns location.
 	  	
    */
 	  	
       return location;
 	  	
    }
 	  	
    
 	  	
    /**method for log off.
 	  	
    */ 
 	  	
    
 	  	
    public void logOff() {
 	  	
    /**method for logOff.
 	  	
    *logOff status.
 	  	
    */
 	  	
       status = OFFLINE;
 	  	
    }
 	  	
    
 	  	
    /**method for log on.
 	  	
    */
 	  	
    
 	  	
    public void logOn() {
 	  	
    /**method for log on.
 	  	
    *logOn status.
 	  	
    */
 	  	
       status = ONLINE;
 	  	
    }
 	  	
    
 	  	
 }
