 import org.junit.Assert;
 3	  	
 //import static org.junit.Assert.*;
 4	  	
 //import org.junit.Before;
 5	  	
 import org.junit.Test;
 6	  	
 
 7	  	
 /** SpherocylinderTest class.
 8	  	
 * project 08.
 9	  	
 * @author Laura Wilson -- comp 1210 --001.
 10	  	
 * @version 10/14/2020.
 11	  	
 */
 12	  	
 
 13	  	
 
 14	  	
 public class SpherocylinderTest {
 15	  	
 
 16	  	
 
 17	  	
    /** Fixture initialization (common initialization
 18	  	
     *  for all tests). **/
 19	  	
    //@Before public void setUp() {
 20	  	
   
 21	  	
 
 22	  	
 
 23	  	
    /** A test that always fails. 
 24	  	
    * @param args -- (not used).
 25	  	
    **/
 26	  	
    //@Test public void defaultTest() {
 27	  	
       //Assert.assertEquals("Default test added by jGRASP. Delete "
 28	  	
          //   + "this test once you have added your own.", 0, 1);
 29	  	
          
 30	  	
    public static void main(String[] args) {
 31	  	
       Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
 32	  	
       Spherocylinder example2 = new Spherocylinder("Medium Example",
 33	  	
          10.8, 10.1);
 34	  	
       Spherocylinder example3 = new Spherocylinder("Large Example",
 35	  	
          98.32, 99.0);
 36	  	
    
 37	  	
       
 38	  	
    }
 39	  	
    
 40	  	
    /** getLabelTest.
 41	  	
    */
 42	  	
 
 43	  	
    @Test public void getLabelTest() {
 44	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 45	  	
       s1.getLabel();
 46	  	
       Assert.assertEquals(" ", "Ex 1", s1.getLabel());
 47	  	
    }
 48	  	
    
 49	  	
    /** setLabelTest.
 50	  	
    */
 51	  	
    
 52	  	
    @Test public void setLabelTest() {
 53	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 54	  	
       s1.setLabel(" Ex. 1");
 55	  	
       Assert.assertEquals(" ", true, s1.setLabel(" Ex. 1"));
 56	  	
       s1.setLabel(null);
 57	  	
       Assert.assertEquals("", false, s1.setLabel(null));
 58	  	
       s1.setLabel("");
 59	  	
       Assert.assertEquals("", false, s1.setLabel(""));
 60	  	
       
 61	  	
    }
 62	  	
    
 63	  	
    /** getRadiusTest.
 64	  	
    */
 65	  	
    
 66	  	
    @Test public void getRadiusTest() {
 67	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 68	  	
       s1.getRadius();
 69	  	
       Spherocylinder s2 = new Spherocylinder("Ex 2", -12, 92);
 70	  	
       s2.getRadius();
 71	  	
    
 72	  	
       
 73	  	
    }
 74	  	
    
 75	  	
    /** setRadiusTest.
 76	  	
    */
 77	  	
    
 78	  	
    @Test public void setRadiusTest() {
 79	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 80	  	
       s1.setRadius(50.25);
 81	  	
       Assert.assertEquals("", true, s1.setRadius(50.25));
 82	  	
       s1.setRadius(-11);
 83	  	
       Assert.assertEquals("", false, s1.setRadius(-11));
 84	  	
       Spherocylinder s2 = new Spherocylinder("ex2", 0, 20);
 85	  	
    }
 86	  	
    
 87	  	
    /** getHeightTest.
 88	  	
    */
 89	  	
    
 90	  	
    @Test public void getHeightTest() {
 91	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 92	  	
       s1.getCylinderHeight();
 93	  	
       Assert.assertEquals("", 5.2, s1.getCylinderHeight(), .001);
 94	  	
       s1.setCylinderHeight(125);
 95	  	
       s1.setCylinderHeight(-125);
 96	  	
    }
 97	  	
    
 98	  	
    /** circumferenceTest.
 99	  	
    */
 100	  	
    
 101	  	
    @Test public void circumferenceTest() {
 102	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 103	  	
       s1.circumference();
 104	  	
       Assert.assertEquals("", 128.8052987971815, s1.circumference(), .00001);
 105	  	
    }
 106	  	
    
 107	  	
    /** surfaceAreasTest.
 108	  	
    */
 109	  	
    
 110	  	
    @Test public void surfaceAreaTest() {
 111	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 112	  	
       s1.surfaceArea();
 113	  	
       Assert.assertEquals("", 5950.804804429786, s1.surfaceArea(), .00001);
 114	  	
    }
 115	  	
    
 116	  	
    /** volumeTest.
 117	  	
    */
 118	  	
    
 119	  	
    @Test public void volumeTest() {
 120	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 121	  	
       s1.volume();
 122	  	
       Assert.assertEquals("", 42952.27363890012, s1.volume(), .0001);
 123	  	
    }
 124	  	
    
 125	  	
    /** toStringTest.
 126	  	
    */
 127	  	
    
 128	  	
    @Test public void toStringTest() {
 129	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 130	  	
       s1.toString();
 131	  	
    
 132	  	
    
 133	  	
    }
 134	  	
    
 135	  	
    /** CountTest.
 136	  	
    */
 137	  	
    
 138	  	
    @Test public void getCountTest() {
 139	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 140	  	
       Spherocylinder s2 = new Spherocylinder("Ex 2", 29.22, 8.0);
 141	  	
       s1.getCount();
 142	  	
       s1.resetCount();
 143	  	
       s2.getCount();
 144	  	
    }
 145	  	
    
 146	  	
    /** EqualsTest.
 147	  	
    */
 148	  	
    
 149	  	
    @Test public void equalsTest() {
 150	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 151	  	
       Spherocylinder s2 = new Spherocylinder("Ex 2", 32.2, 5.2);
 152	  	
       Spherocylinder s3 = new Spherocylinder("Ex 1", 0.9, 5.2);
 153	  	
       Spherocylinder s4 = new Spherocylinder("Ex 1", 20.5, -32.2);
 154	  	
       Spherocylinder s5 = new Spherocylinder("Ex 1", 20.5, 5.2);
 155	  	
       Spherocylinder s42 = new Spherocylinder("Ex 23", -23, -.39);
 156	  	
       s1.equals(s2);
 157	  	
       s1.equals(s3);
 158	  	
       s1.equals(s4);
 159	  	
       s1.equals(s5);
 160	  	
       s42.equals(s3);
 161	  	
         
 162	  	
    }
 163	  	
    
 164	  	
    /** hashCodeTest.
 165	  	
    */
 166	  	
    
 167	  	
    @Test public void hashCodeTest() {
 168	  	
       Spherocylinder s1 = new Spherocylinder("Ex 1", 20.5, 5.2);
 169	  	
       s1.hashCode();
 170	  	
    }
 171	  	
 }
