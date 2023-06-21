 /** Spherocylinder class with methods.
 2	  	
 *Project 07.
 3	  	
 * @author Laura Wilson -- comp 1210 -- 001. 
 4	  	
 * @version 10/14/2020.
 5	  	
 */
 6	  	
 
 7	  	
 import java.text.DecimalFormat;
 8	  	
 
 9	  	
 /** Spherocylinder class with fields, constructor and mehtods.
 10	  	
 */
 11	  	
 
 12	  	
 public class Spherocylinder implements Comparable<Spherocylinder> {
 13	  	
 /** Spherocylinder class with fields, construtor.
 14	  	
 * and methods.
 15	  	
 */
 16	  	
 
 17	  	
 //instance variables 
 18	  	
    private String label = "";
 19	  	
    private double radius, cylinheight = 0;
 20	  	
 //class variable that increments
 21	  	
    private static int classVariable = 0;
 22	  	
    
 23	  	
    
 24	  	
 
 25	  	
 
 26	  	
  //constructor
 27	  	
  /** Spherocylinder constructor.
 28	  	
  * @param labelIn for labelIn.
 29	  	
  * @param radiusIn for radiusIn.
 30	  	
  * @param cylinheightIn.
 31	  	
  * @param  cylinheightIn .
 32	  	
  */
 33	  	
    public Spherocylinder(String labelIn, double radiusIn, double cylinheightIn) 
 34	  	
    {
 35	  	
    /** @param cylinheightIn.
 36	  	
    */
 37	  	
    
 38	  	
       label = labelIn.trim();
 39	  	
       radius = radiusIn;
 40	  	
       cylinheight = cylinheightIn;
 41	  	
       classVariable++; //increments when an object is created
 42	  	
       
 43	  	
                
 44	  	
    }
 45	  	
    
 46	  	
    //methods
 47	  	
    /** getLabel method tat returns label field.
 48	  	
    * @return getLabel.
 49	  	
    */
 50	  	
    public String getLabel() {
 51	  	
    
 52	  	
       return label;
 53	  	
    }
 54	  	
    
 55	  	
    /** setLabel mehtod with labelIn parameter.
 56	  	
    * @return setLabel.
 57	  	
    * @param labelIn for labelIn.
 58	  	
    */
 59	  	
    
 60	  	
    public boolean setLabel(String labelIn) {
 61	  	
    
 62	  	
       if (labelIn == null || labelIn.trim().equals("")) 
 63	  	
       {
 64	  	
          return false;
 65	  	
          
 66	  	
       }
 67	  	
       else {
 68	  	
          this.label = label;
 69	  	
          return true;
 70	  	
       }
 71	  	
    }
 72	  	
    
 73	  	
    /** getRadius method.
 74	  	
    * @return getRadius.
 75	  	
    */
 76	  	
          
 77	  	
    public double getRadius() {
 78	  	
    
 79	  	
       return radius;
 80	  	
    }
 81	  	
    
 82	  	
    /** setRadius method.
 83	  	
    * that returns radius double.
 84	  	
    * @return setRadius.
 85	  	
    * @param radiusIn for radiusIn.
 86	  	
    */
 87	  	
 
 88	  	
    
 89	  	
    public boolean setRadius(double radiusIn) {
 90	  	
    
 91	  	
       if (radiusIn >= 0) {
 92	  	
          radius = radiusIn;
 93	  	
          return true;
 94	  	
       } else {
 95	  	
          return false;
 96	  	
       }
 97	  	
    }
 98	  	
    
 99	  	
    /** getCylinderHeight.
 100	  	
    * @return getCylinderHeight.
 101	  	
    */
 102	  	
 
 103	  	
    
 104	  	
    public double getCylinderHeight() {
 105	  	
    
 106	  	
       return cylinheight;
 107	  	
    }
 108	  	
    
 109	  	
    /** setCylinderHeight with parameter.
 110	  	
    * @return setCylinderHeight.
 111	  	
    * @param cylinheightIn for the height.
 112	  	
    */
 113	  	
    
 114	  	
    public boolean setCylinderHeight(double cylinheightIn) {
 115	  	
    
 116	  	
    /** @param cylinheightIn.
 117	  	
    */
 118	  	
    
 119	  	
       if (cylinheightIn >= 0) {
 120	  	
          cylinheight = cylinheightIn;
 121	  	
          return true;
 122	  	
       } else {
 123	  	
          return false;
 124	  	
       }
 125	  	
    } 
 126	  	
    
 127	  	
    /** circumference method.
 128	  	
    * @return circumference.
 129	  	
    */
 130	  	
 
 131	  	
    
 132	  	
    public double circumference() {
 133	  	
    
 134	  	
       return (2 * Math.PI * radius);
 135	  	
    }
 136	  	
    
 137	  	
     /** surfaceArea method.
 138	  	
    * @return surfaceArea.
 139	  	
    */
 140	  	
    
 141	  	
    public double surfaceArea() {
 142	  	
    
 143	  	
       return (2 * Math.PI * radius * (2 * radius + cylinheight));
 144	  	
    }
 145	  	
    
 146	  	
    /** volume method.
 147	  	
    * @return volume.
 148	  	
    */
 149	  	
 
 150	  	
    
 151	  	
    public double volume() {
 152	  	
       return ((Math.PI * Math.pow(radius, 2)) * (4 * radius / 3 + cylinheight));
 153	  	
    }
 154	  	
    
 155	  	
    /** toString method. 
 156	  	
    * @return toString.
 157	  	
    */
 158	  	
 
 159	  	
    
 160	  	
    public String toString() {
 161	  	
    
 162	  	
    
 163	  	
       DecimalFormat df = new DecimalFormat("#,##0.0##");
 164	  	
    
 165	  	
       String output = ("Spherocylinder " + "\"" + label + "\"" 
 166	  	
          +  " with radius " + df.format(radius) + " and cylinder height " 
 167	  	
          + df.format(cylinheight) + " has:"
 168	  	
          + "\n" + "\t" 
 169	  	
          + "circumference = " + df.format(circumference()) 
 170	  	
          + " units" + "\n" + "\t" + "surface area = "
 171	  	
          + df.format(surfaceArea()) + " square units" + "\n" 
 172	  	
          + "\t" + "volume = " 
 173	  	
          + df.format(volume()) + " cubic units");
 174	  	
          
 175	  	
       return (output);    
 176	  	
    
 177	  	
    }
 178	  	
    
 179	  	
      /** getcount method. 
 180	  	
    * @return getCount.
 181	  	
    */
 182	  	
    
 183	  	
    public static int getCount() {
 184	  	
    
 185	  	
       return classVariable;
 186	  	
    }
 187	  	
    
 188	  	
    /** resetCount mehtod.
 189	  	
    */
 190	  	
    
 191	  	
    public static void resetCount() {
 192	  	
    
 193	  	
       classVariable = 0;
 194	  	
    }
 195	  	
    
 196	  	
     /** equals method.
 197	  	
    * @return equals.
 198	  	
    * @param obj.
 199	  	
    * @param obj .
 200	  	
    */
 201	  	
    
 202	  	
    public boolean equals(Object obj) {
 203	  	
    
 204	  	
    
 205	  	
       if (!(obj instanceof Spherocylinder)) {
 206	  	
          return false;
 207	  	
       }
 208	  	
       else {
 209	  	
          Spherocylinder d = (Spherocylinder) obj;
 210	  	
          return (label.equalsIgnoreCase(d.getLabel()) 
 211	  	
             && Math.abs(radius - d.getRadius()) < .000001
 212	  	
             && Math.abs(cylinheight - d.getCylinderHeight())
 213	  	
             < .000001);
 214	  	
       }
 215	  	
    }
 216	  	
    
 217	  	
     /** hashCode method for Checkstyle.
 218	  	
    * @return hashCode.
 219	  	
    */
 220	  	
    
 221	  	
    public int hashCode() {
 222	  	
    
 223	  	
    
 224	  	
       return 0;
 225	  	
    }
 226	  	
    
 227	  	
    //new method 
 228	  	
    /** compareTo method.
 229	  	
    * @return compareTo.
 230	  	
    * @param obj for the parameter of compareTo.
 231	  	
    */
 232	  	
    public int compareTo(Spherocylinder obj) {
 233	  	
       if (this.volume() > obj.volume()) {
 234	  	
          return 1;
 235	  	
       }
 236	  	
       else if (this.volume() < obj.volume()) {
 237	  	
          return -1;
 238	  	
       }
 239	  	
       else {
 240	  	
          return 0;
 241	  	
       }
 242	  	
    }
 243	  	
 
 244	  	
 }
