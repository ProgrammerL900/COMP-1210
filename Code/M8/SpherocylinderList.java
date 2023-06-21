 /** SpherocylinderListfile.
 2	  	
 * 
 3	  	
 * Project 08.
 4	  	
 * @author Laura Wilson comp 1210 -- 001.
 5	  	
 * @version 10/28/2020.
 6	  	
 */
 7	  	
 
 8	  	
 /** SpherocylinderList class with methods, constructor and fields */
 9	  	
 
 10	  	
 public class SpherocylinderList {
 11	  	
 //three fields
 12	  	
    private String listName = "";
 13	  	
    private Spherocylinder[] cylinder;
 14	  	
    private int numOfSpherocylinder = 0;
 15	  	
    
 16	  	
    /** Spherocylinder constructor. 
 17	  	
    * @param listNameIn for constructor.
 18	  	
    * @param Spherocylinder[] cylinder for constructor.
 19	  	
    * @param numOfSpherocylinder for the constructor.
 20	  	
    */
 21	  	
    
 22	  	
    public SpherocylinderList(String listNameIn, Spherocylinder[] cylinderIn, int numOfSpherocylinderIn) {
 23	  	
       listName = listNameIn;
 24	  	
       cylinder = cylinderIn;
 25	  	
       numOfSpherocylinder = numOfSpherocylinderIn;
 26	  	
    
 27	  	
    }
 28	  	
    
 29	  	
    //methods
 30	  	
    
 31	  	
    /** getName method.
 32	  	
    * @return getName. 
 33	  	
    */
 34	  	
    public String getName() {
 35	  	
       return listName;
 36	  	
    }
 37	  	
    
 38	  	
    /** numberOfSpherocylinder method.
 39	  	
    * @return numberOfSpherocylinder.
 40	  	
    */
 41	  	
    public int numberOfSpherocylinder() {
 42	  	
       return numOfSpherocylinder;
 43	  	
    }
 44	  	
    
 45	  	
    /** totalsurfaceArea method.
 46	  	
    * @return totalsurfaceArea.
 47	  	
    */
 48	  	
    public double totalsurfaceArea() {
 49	  	
       double total = 0;
 50	  	
       for (int i = 0; i < this.numOfSpherocylinder; i++) {
 51	  	
          total += this.cylinder[i].surfaceArea();
 52	  	
          
 53	  	
       }
 54	  	
       return total;
 55	  	
    }
 56	  	
    
 57	  	
    /** totalVolume method.
 58	  	
    * @return totalVolume.
 59	  	
    */
 60	  	
    public double totalVolume() {
 61	  	
       double total = 0;
 62	  	
       for (int i = 0; i < this.numOfSpherocylinder; i++) {
 63	  	
          total += this.cylinder[i].volume();
 64	  	
       }
 65	  	
       return total;
 66	  	
    }
 67	  	
   
 68	  	
   
 69	  	
   /** averagesurfaceArea method.
 70	  	
   * @return averagesurfaceArea.
 71	  	
   */
 72	  	
   
 73	  	
    public double averageSurfaceArea() {
 74	  	
       return (totalsurfaceArea() / this.numOfSpherocylinder);
 75	  	
    }
 76	  	
    
 77	  	
    /** averageVolume method.
 78	  	
    * @return averageVolume.
 79	  	
    */
 80	  	
    public double averageVolume() {
 81	  	
       return (totalVolume() / this.numOfSpherocylinder);
 82	  	
    }
 83	  	
    
 84	  	
    /** toString method.
 85	  	
    */
 86	  	
    
 87	  	
    public String toString() {
 88	  	
    
 89	  	
       String output = "----- Summary for " + this.listName + "-----\n"
 90	  	
          + "Number of Spherocylinder: " + numOfSpherocylinder + "\n"
 91	  	
          + "Total Surface Area: " + String.format("%,.3f", totalsurfaceArea()) + "\n"
 92	  	
          + "Total Volume: " + String.format("%,.3f", totalVolume()) + "\n" 
 93	  	
          + "Average Surface Area: " + String.format("%,.3f", averageSurfaceArea()) + "\n" 
 94	  	
          + "Average Volume: " + String.format("%,.3f", averageVolume()) + "\n";
 95	  	
       return output;
 96	  	
    }
 97	  	
    
 98	  	
    /** getList method
 99	  	
    * @return getList.
 100	  	
    */
 101	  	
    public Spherocylinder[] getList() {
 102	  	
       return this.cylinder;
 103	  	
    }
 104	  	
    
 105	  	
    /** add Spherocylinder method.
 106	  	
    * @return addSpherocylinder.
 107	  	
    * @param
 108	  	
    */
 109	  	
    public void addSpherocylinder(String label, double radius, double height) {
 110	  	
       
 111	  	
       this.cylinder[this.numOfSpherocylinder++] = new Spherocylinder(label, radius, height);
 112	  	
    }
 113	  	
    
 114	  	
    /** findSpherocylinder method.
 115	  	
    * @return findSpherocylinder.
 116	  	
    * @param 
 117	  	
    */
 118	  	
    
 119	  	
    public Spherocylinder findSpherocylinder(String label) {
 120	  	
       Spherocylinder res = null;
 121	  	
       for (int i = 0; i < this.numOfSpherocylinder; i++) {
 122	  	
          if (this.cylinder[i].getLabel().equalsIgnoreCase(label)) {
 123	  	
             res = this.cylinder[i];
 124	  	
             break;
 125	  	
          }
 126	  	
       }
 127	  	
       return res;
 128	  	
    }
 129	  	
    
 130	  	
    /** deleteSpherocylinder method.
 131	  	
    * @return deleteSpherocylinder.
 132	  	
    * @param
 133	  	
    */
 134	  	
    public Spherocylinder deleteSpherocylinder(String label) {
 135	  	
       Spherocylinder res = null;
 136	  	
       for (int i = 0; i < this.numOfSpherocylinder; i++) {
 137	  	
          if(this.cylinder[i].getLabel().equalsIgnoreCase(label)) {
 138	  	
             res = this.cylinder[i];
 139	  	
             this.cylinder[i] = this.cylinder[i + 1];
 140	  	
          }
 141	  	
       }
 142	  	
       this.cylinder[this.numOfSpherocylinder] = null;
 143	  	
       this.numOfSpherocylinder--;
 144	  	
       return res;
 145	  	
    }
 146	  	
    
 147	  	
    /** editSpherocylinder method.
 148	  	
    * @return editSpherocylinder.
 149	  	
    * @param
 150	  	
    */
 151	  	
    public boolean editSpherocylinder(String label, double radius, double height) {
 152	  	
       for (int i = 0; i < this.numOfSpherocylinder; i++) {
 153	  	
          if (this.cylinder[i].getLabel().equalsIgnoreCase(label)) {
 154	  	
             this.cylinder[i].setRadius(radius);
 155	  	
             this.cylinder[i].setCylinderHeight(height);
 156	  	
             return true;
 157	  	
          }
 158	  	
       }
 159	  	
       return false;
 160	  	
    }
 161	  	
    
 162	  	
    /**findSpherocylinder method.
 163	  	
    * @reutrn findSpherocylinder.
 164	  	
    * @param
 165	  	
    */
 166	  	
    public Spherocylinder findSpherocylinderWithLargerVolume() {
 167	  	
       Spherocylinder res = null;
 168	  	
       double max = this.cylinder[0].volume();
 169	  	
       for (int i = 0; i < this.numOfSpherocylinder; i++) {
 170	  	
          if (this.cylinder[i].volume() > max) {
 171	  	
             max = this.cylinder[i].volume();
 172	  	
             res = this.cylinder[i];
 173	  	
          }
 174	  	
       }
 175	  	
       return res;
 176	  	
    }
 177	  	
    
 178	  	
    
 179	  	
 }
