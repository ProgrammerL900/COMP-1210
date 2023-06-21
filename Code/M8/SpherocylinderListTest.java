 import org.junit.Assert;
 2	  	
 //import static org.junit.Assert.*;
 3	  	
 import org.junit.Before;
 4	  	
 import org.junit.Test;
 5	  	
 
 6	  	
 
 7	  	
 
 8	  	
 public class SpherocylinderListTest {
 9	  	
 
 10	  	
 
 11	  	
    /** Fixture initialization (common initialization
 12	  	
     *  for all tests). **/
 13	  	
    //@Before public void setUp() {
 14	  	
    //}
 15	  	
 
 16	  	
 
 17	  	
    /** A test that always fails. **/
 18	  	
    //@Test public void defaultTest() {
 19	  	
       //Assert.assertEquals("Default test added by jGRASP. Delete "
 20	  	
          //   + "this test once you have added your own.", 0, 1);
 21	  	
    //}
 22	  	
    
 23	  	
    @Test public void addSpherocylinderTest() {
 24	  	
       Spherocylinder[] pTestArray = { new Spherocylinder("Small Example", 0.5, 0.25), 
 25	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 26	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 27	  	
    
 28	  	
       SpherocylinderList Test = new SpherocylinderList("Test", pTestArray, 3);
 29	  	
       Test.addSpherocylinder("Test", 1.0, 1.0);
 30	  	
    
 31	  	
    }
 32	  	
    
 33	  	
    
 34	  	
    @Test public void getNameTest() {
 35	  	
       Spherocylinder[] a = new Spherocylinder[100];
 36	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 37	  	
       
 38	  	
       String name = bob.getName();
 39	  	
       Assert.assertEquals("Spherocylinder Test List", name);
 40	  	
    
 41	  	
       
 42	  	
       
 43	  	
    
 44	  	
    }
 45	  	
    
 46	  	
    @Test public void numberOfSpherocylinder() {
 47	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 48	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 49	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 50	  	
          
 51	  	
       SpherocylinderList bob = new SpherocylinderList("bob", pTestArray, 3);
 52	  	
       bob.numberOfSpherocylinder(); 
 53	  	
    }
 54	  	
    
 55	  	
    @Test public void totalsurfaceArea() {
 56	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 57	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 58	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 59	  	
          
 60	  	
       Spherocylinder[] a = new Spherocylinder[100];
 61	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 62	  	
       double surfaceArea = bob.totalsurfaceArea();
 63	  	
          
 64	  	
    }
 65	  	
    
 66	  	
    @Test public void totalVolume() {
 67	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 68	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 69	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 70	  	
          
 71	  	
       Spherocylinder[] a = new Spherocylinder[100];
 72	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 73	  	
       double volume = bob.totalVolume();
 74	  	
    }
 75	  	
    
 76	  	
    @Test public void averagesurfaceArea() {
 77	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 78	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 79	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 80	  	
          
 81	  	
       Spherocylinder[] a = new Spherocylinder[100];
 82	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 83	  	
       double averagesurfaceArea = bob.averageSurfaceArea();
 84	  	
    }
 85	  	
    
 86	  	
    @Test public void averagesurfaceArea2() {
 87	  	
       Spherocylinder[] a = new Spherocylinder[100];
 88	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 89	  	
       double averagesurfaceArea = bob.averageSurfaceArea();
 90	  	
    }
 91	  	
    
 92	  	
    @Test public void averageVolume() {
 93	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 94	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 95	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 96	  	
          
 97	  	
       Spherocylinder[] a = new Spherocylinder[100];
 98	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 99	  	
       double averageVolume = bob.averageVolume();
 100	  	
          
 101	  	
    }
 102	  	
    
 103	  	
    @Test public void averageVolume2() {
 104	  	
       Spherocylinder[] a = new Spherocylinder[100];
 105	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 106	  	
       double averageVolume = bob.averageVolume();
 107	  	
    
 108	  	
    }
 109	  	
    
 110	  	
    @Test public void toStringTest() {
 111	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 112	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 113	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 114	  	
    }
 115	  	
    
 116	  	
    @Test public void getList() {
 117	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 118	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 119	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 120	  	
    }
 121	  	
    
 122	  	
    @Test public void findSpherocylinder() {
 123	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 124	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 125	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 126	  	
          
 127	  	
       SpherocylinderList bob = new Spherocylinder("bob", pTestArray, 3);
 128	  	
       Spherocylinder yes = bob.findSpherocylinder("Small Example");
 129	  	
          
 130	  	
    }
 131	  	
    
 132	  	
    @Test public void findSpherocylinderTest() {
 133	  	
       Spherocylinder[] a = {new Spherocylinder("late", 2.4, 2.5)};
 134	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 1);
 135	  	
       Spherocylinder yes = bob.findSpherocylinder("late");
 136	  	
    
 137	  	
    }
 138	  	
    
 139	  	
    @Test public void deleteSpherocylinder() {
 140	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 141	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 142	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 143	  	
          
 144	  	
       Spherocylinder[] a = new Spherocylinder[100];
 145	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 146	  	
       Spherocylinder g = new Spherocylinder("Bob", 0, 0);
 147	  	
       g = bob.deleteSpherocylinder("Small Example");
 148	  	
    }
 149	  	
    
 150	  	
    @Test public void deleteSpherocylinderTest() {
 151	  	
       Spherocylinder[] a = new Spherocylinder[100];
 152	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 153	  	
       Spherocylinder g = new Spherocylinder("Bob", 0, 0);
 154	  	
       g = bob.deleteSpherocylidner("Bob");
 155	  	
    }
 156	  	
    
 157	  	
    @Test public void editSpherocylinder() {
 158	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 159	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 160	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 161	  	
          
 162	  	
       SpherocylinderList bob = new SpherocylinderList("bob", pTestArray, 3);
 163	  	
       boolean yes = false;
 164	  	
       yes = bob.editSpherocylinder("Small Example", 1.5, 7.4);
 165	  	
          
 166	  	
    }
 167	  	
    
 168	  	
    @Test public void editSpherocylidnerTest() {
 169	  	
       Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 2.5)};
 170	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 1);
 171	  	
       boolean yes = false;
 172	  	
       yes = bob.editSpherocylinder("late", 1.5, 7.4);
 173	  	
    
 174	  	
    }
 175	  	
    
 176	  	
    @Test public void findSpherocylinderWithLargerVolume() {
 177	  	
       Spherocylinder[] pTestArray = {new Spherocylinder("Small Example", 0.5, 0.25), 
 178	  	
          new Spherocylinder("Medium Example", 10.8, 10.1), 
 179	  	
          new Spherocylinder("Large Example", 98.32, 99.0)};
 180	  	
          
 181	  	
       SpherocylinderList bob = new SpherocylidnerList("bob", pTestArray, 3);
 182	  	
       Spherocylinder yes = bob.findSpherocylinderWithLargerVolume();
 183	  	
    }
 184	  	
    
 185	  	
    @Test public void findSpherocylinderWithLargerVolume2() {
 186	  	
       Spherocylinder[] a = {new Spherocylinder("Cate", 7.6, 6.9),
 187	  	
          new Spherocylinder("Sam", 2.1, 1.2)};
 188	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 2);
 189	  	
       Spherocylinder yes = bob.findSpherocylinderWithLargerVolume();
 190	  	
    }
 191	  	
    
 192	  	
    @Test public void findSpherocylinderWithLargerVolume3() {
 193	  	
       Spherocylinder[] a = new Spherocylinder[0];
 194	  	
       SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
 195	  	
       Spherocylinder yes = bob.findSpherocylinderWithLargerVolume();
 196	  	
    
 197	  	
    }
 198	  	
    
 199	  	
   
 200	  	
 }
