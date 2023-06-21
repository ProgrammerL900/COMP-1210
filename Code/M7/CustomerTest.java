 import org.junit.Assert;
 2	  	
 //import static org.junit.Assert.*;
 3	  	
 //import org.junit.Before;
 4	  	
 import org.junit.Test;
 5	  	
 
 6	  	
 /** CustomerTest class. 
 7	  	
 * has multiple test.
 8	  	
 */
 9	  	
 
 10	  	
 public class CustomerTest {
 11	  	
 
 12	  	
 
 13	  	
    /** Fixture initialization (common initialization
 14	  	
     *  for all tests). **/
 15	  	
    //@Before public void setUp() {
 16	  	
    
 17	  	
 
 18	  	
 
 19	  	
    /** A test that always fails. **/
 20	  	
    //@Test public void defaultTest() {
 21	  	
       //Assert.assertEquals("Default test added by jGRASP. Delete "
 22	  	
          //   + "this test once you have added your own.", 0, 1);
 23	  	
          
 24	  	
    /** setLocationTest.
 25	  	
    */
 26	  	
    @Test public void setLocationTest1() {
 27	  	
       Customer cstmr = new Customer("Lane, Jane");
 28	  	
       cstmr.setLocation("Boston, MA");
 29	  	
       Assert.assertEquals("Boston, MA", cstmr.getLocation());
 30	  	
    }
 31	  	
    
 32	  	
    /** setLocationTest2.
 33	  	
    */
 34	  	
    
 35	  	
    @Test public void setLocationTest2() {
 36	  	
       Customer cstmr = new Customer("Lane, Jane");
 37	  	
       cstmr.setLocation("Atlanta", "GA");
 38	  	
       Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
 39	  	
    }
 40	  	
    
 41	  	
    /** changeBalanceTest.
 42	  	
    */
 43	  	
    
 44	  	
    @Test public void changeBalanceTest() {
 45	  	
       Customer cstmr = new Customer("Lane, Jane");
 46	  	
       cstmr.changeBalance(100);
 47	  	
       Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
 48	  	
    }
 49	  	
    
 50	  	
    /** toStringTest.
 51	  	
    */
 52	  	
       
 53	  	
    @Test public void toStringTest() {
 54	  	
       Customer cstmr = new Customer("Lane, Jane");
 55	  	
       cstmr.setLocation("Auburn, AL");
 56	  	
       cstmr.changeBalance(999);
 57	  	
       Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
 58	  	
    }
 59	  	
    
 60	  	
    /** compareToTest.
 61	  	
    */
 62	  	
    
 63	  	
    @Test public void compareToTest1() {
 64	  	
       Customer cstmr1 = new Customer("Lane, Jane");
 65	  	
       cstmr1.changeBalance(500);
 66	  	
    
 67	  	
       Customer cstmr2 = new Customer("Lane, Lois");
 68	  	
       cstmr2.changeBalance(500);
 69	  	
    
 70	  	
       Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
 71	  	
    }
 72	  	
    
 73	  	
    /** compareToTest2.
 74	  	
    */
 75	  	
    
 76	  	
    @Test public void compareToTest2() {
 77	  	
       Customer cstmr1 = new Customer("Lane, Jane");
 78	  	
       cstmr1.changeBalance(100);
 79	  	
    
 80	  	
       Customer cstmr2 = new Customer("Lane, Lois");
 81	  	
       cstmr2.changeBalance(500);
 82	  	
    
 83	  	
       Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
 84	  	
    }
 85	  	
    
 86	  	
    /** compareToTest3.
 87	  	
    */
 88	  	
    
 89	  	
    @Test public void compareToTest3() {
 90	  	
       Customer cstmr1 = new Customer("Lane, Jane");
 91	  	
       cstmr1.changeBalance(1000);
 92	  	
    
 93	  	
       Customer cstmr2 = new Customer("Lane, Lois");
 94	  	
       cstmr2.changeBalance(500);
 95	  	
    
 96	  	
       Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
 97	  	
    
 98	  	
    }
