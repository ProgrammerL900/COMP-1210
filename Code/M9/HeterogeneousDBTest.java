 //import org.junit.Assert;
 2	  	
 //import static org.junit.Assert.*;
 3	  	
 //import org.junit.Before;
 4	  	
 import org.junit.Test;
 5	  	
 
 6	  	
 /** HeterogeneosDbTest. 
 7	  	
 */
 8	  	
 
 9	  	
 public class HeterogeneousDBTest {
 10	  	
 
 11	  	
 
 12	  	
    /** Fixture initialization (common initialization
 13	  	
     *  for all tests). **/
 14	  	
    /** @Before public void setUp() {
 15	  	
    } */
 16	  	
 
 17	  	
 
 18	  	
    /** A test that always fails. **/
 19	  	
    /**@Test public void defaultTest() {
 20	  	
       Assert.assertEquals("Default test added by jGRASP. Delete "
 21	  	
             + "this test once you have added your own.", 0, 1);
 22	  	
    } */
 23	  	
    
 24	  	
    /** getCostFactor test. **/
 25	  	
    
 26	  	
    @Test public void getCostFactor() {
 27	  	
       HeterogeneousDB new1 = new HeterogeneousDB("Data", 1.29, 21.2, 38, 9.3);
 28	  	
       new1.getCostFactor();
 29	  	
    }
 30	  	
    
 31	  	
    /** monthlyCost. **/
 32	  	
    
 33	  	
    @Test public void monthlyCost() {
 34	  	
       HeterogeneousDB new1 = new HeterogeneousDB("Data", 1.29, 21.2, 38, 9.3);
 35	  	
       new1.monthlyCost();
 36	  	
    }
 37	  	
 }
