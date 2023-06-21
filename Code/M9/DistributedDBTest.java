 //import org.junit.Assert;
 2	  	
 //import static org.junit.Assert.*;
 3	  	
 //import org.junit.Before;
 4	  	
 import org.junit.Test;
 5	  	
 
 6	  	
 
 7	  	
 /** DistributedDB Test. */
 8	  	
 
 9	  	
 public class DistributedDBTest {
 10	  	
 
 11	  	
 
 12	  	
    /** Fixture initialization (common initialization
 13	  	
     *  for all tests). **/
 14	  	
    //@Before public void setUp() {
 15	  	
    //}
 16	  	
 
 17	  	
 
 18	  	
    /** A test that always fails. **/
 19	  	
    //@Test public void defaultTest() {
 20	  	
       //Assert.assertEquals("Default test added by jGRASP. Delete "
 21	  	
          //   + "this test once you have added your own.", 0, 1);
 22	  	
    //}
 23	  	
    
 24	  	
    /** getNumberOfUser test. */
 25	  	
    
 26	  	
    @Test public void getNumberOfUser() {
 27	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 28	  	
       neet.getNumberOfUsers();
 29	  	
    }
 30	  	
    
 31	  	
    /** setNumberOfUser test. */
 32	  	
    
 33	  	
    @Test public void setNumberOfUser() {
 34	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 35	  	
       neet.setNumberOfUsers(2);
 36	  	
       neet.getNumberOfUsers();
 37	  	
    }
 38	  	
    
 39	  	
    /** getCostPerUser test. */
 40	  	
    
 41	  	
    @Test public void getCostPerUser() {
 42	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 43	  	
       neet.getCostPerUser();
 44	  	
    }
 45	  	
    
 46	  	
    /** setCostPerUser test. */
 47	  	
    
 48	  	
    @Test public void setCostPerUser() {
 49	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 50	  	
       neet.getCostPerUser();
 51	  	
       neet.setCostPerUser(1.25);
 52	  	
       neet.getCostPerUser();
 53	  	
    }
 54	  	
    
 55	  	
    /** userCost. */
 56	  	
    
 57	  	
    @Test public void userCost() {
 58	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 59	  	
       neet.userCost();
 60	  	
    }
 61	  	
    
 62	  	
    /** getCostFactor test. */
 63	  	
    
 64	  	
    @Test public void getCostFactor() {
 65	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 66	  	
       neet.getCostFactor();
 67	  	
    }
 68	  	
    
 69	  	
    /** monthlyCost test. */
 70	  	
    
 71	  	
    @Test public void monthlyCost() {
 72	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 73	  	
       neet.monthlyCost();
 74	  	
    
 75	  	
    }
 76	  	
    
 77	  	
    /** toString test. */
 78	  	
    
 79	  	
    @Test public void toStringTest() {
 80	  	
       DistributedDB neet = new DistributedDB("Data1", 50.0, 1.2, 30, .30);
 81	  	
       neet.toString();
 82	  	
    }
 83	  	
 }
