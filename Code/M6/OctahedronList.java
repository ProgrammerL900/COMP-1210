/**OctahedronList stores names of list.
 2	  	
 *and ArrayList of objects.
 3	  	
 *
 4	  	
 *Project 05.
 5	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 6	  	
 * @version 9/25/2020.
 7	  	
 */
 8	  	
 
 9	  	
 //import scanner and array list
 10	  	
 
 11	  	
 import java.util.ArrayList;
 12	  	
 import java.text.DecimalFormat;
 13	  	
 import java.util.Scanner;
 14	  	
 import java.io.FileNotFoundException;
 15	  	
 import java.io.File;
 16	  	
 
 17	  	
 public class OctahedronList {

  	
 /** OctahedronList class.
 19	  	
 */
 20	  	
 
 21	  	
 //fields
 22	  	
    private String listName;
 23	  	
    private ArrayList<Octahedron> octahedronList; //objects
 24	  	
    
 25	  	
 //constructor
 26	  	
    public OctahedronList (String listNameIn, ArrayList<Octahedron> octahedronListIn) {


       /** OctahedronList constructor.
 28	  	
       */
 29	  	
       octahedronList = octahedronListIn;
 30	  	
       listName= listNameIn;
  	
    }
 32	  	
 //Methods
 33	  	
 
 34	  	
 //getName method
 35	  	
 
 36	  	
    public String getName() {
 	
    /** getName method.
 38	  	
    * @return String getName.
 39	  	
    */
 40	  	
       return listName;
 41	  	
    }
 42	  	
    
 43	  	
 //number of octahedron method
 44	  	
    public int numberofOctahedron() {
 	
    /** numberofOctahedron method.
 46	  	
    * @return int numberofOctahedron. 
 47	  	
    */
 48	  	
       int numberofOctahedron = 0;
 49	  	
       if (octahedronList.size() != 0) {
 50	  	
          return octahedronList.size();
 51	  	
       }
 52	  	
       else {
 53	  	
          return 0;
 54	  	
       }
 55	  	
    }
 56	  	
  
 57	  	
 //total surfaceArea
 58	  	
    public double totalSurfaceArea() {
 	
    /** totalSurfaceArea method.
 60	  	
    * @return totalSurfaceArea.
 61	  	
    */
 62	  	
      
 63	  	
       if (octahedronList.size() == 0) {
 64	  	
          return 0.0;
 65	  	
       } else {
 66	  	
          double output = 0.0;
 67	  	
          int index = 0;
 68	  	
          while (index < octahedronList.size())
 69	  	
          {
 70	  	
             output += octahedronList.get(index).surfaceArea();
 71	  	
          }
 72	  	
          return output;
 73	  	
       }  
 74	  	
    } 
 75	  	
 
 76	  	
 //total Volume
 77	  	
    public double totalVolume() {
	
    /** totalVolume method.
 79	  	
    * @return totalVolume.
 80	  	
    */
 81	  	
       
 82	  	
       if (octahedronList.size() == 0)
 83	  	
       {
 84	  	
          return 0.0;
 85	  	
       } else {
 86	  	
          double output = 0.0;
 87	  	
          int index = 0;
 88	  	
          while (index < octahedronList.size())
 89	  	
          {
 90	  	
             output += octahedronList.get(index).Volume();
 91	  	
             index++;
 92	  	
          }
 93	  	
          return output;
 94	  	
       }
 95	  	
    }
 96	  	
    
 97	  	
 // average surfaceArea
 98	  	
    public double averageSurfaceArea() {

 	
    /** averageSurfaceArea method.
 100	  	
    * @return averageSurfaceArea.
 101	  	
    */
 102	  	
       if (octahedronList.size() != 0) {
 103	  	
          return (totalSurfaceArea() / octahedronList.size());
 104	  	
       } else {
 105	  	
          return 0.0;
 106	  	
       }
 107	  	
    }
 108	  	
    
 109	  	
 //average volume
 110	  	
    public double averageVolume() {
 	
    /** averageVolume method.
 112	  	
    * @return averageVolume.
 113	  	
    */
 114	  	
       
 115	  	
       if (octahedronList.size() != 0) {
 116	  	
          return totalVolume() / (double) octahedronList.size();
 117	  	
       } else {
 118	  	
          return 0.0;
 119	  	
       }
 120	  	
    }   
 121	  	
 
 122	  	
 //averageSurfaceToVolume Ratio
 123	  	
    public double averageSurfaceAreaToVolumeRatio () {
  	
    /** averageSurfaceToVolumeRatio method.
 125	  	
    * @return averageSurfaceAreaToVolumeRatio.
 126	  	
    */
 127	  	
       double averageRatio = 0.0;
 128	  	
       for (int i = octahedronList.size() -1; i > -1; i--)
  	
       {
 130	  	
          averageRatio += octahedronList.get(i).surfaceToVolumeRatio();
 131	  	
       }
 132	  	
       if (octahedronList.size() > 0)
 133	  	
       {
 134	  	
          return (averageRatio / octahedronList.size());
 135	  	
       } else { 
 136	  	
          return averageRatio;
 137	  	
       }
 138	  	
       
 139	  	
    
 140	  	
       
 141	  	
    }
 142	  	
    
 143	  	
 //toString
 144	  	
    public String toString() {
  	
    /** toString method.
 146	  	
    * @return toString.
 147	  	
    * @param toString.
 148	  	
    */
 149	  	
       String result = "\n" + octahedronList + "\n";
 150	  	
       int index = 0;
 151	  	
       while (index < octahedronList.size()) {
 152	  	
          result += "\n" + octahedronList.get(index) + "\n";
 153	  	
          index++;
 154	  	
       }
 155	  	
       return result;
 156	  	
    }
 157	  	
    
 158	  	
 //summaryinfo
 159	  	
    public String summaryInfo() {
	  	
    /** summaryInfo method.
 161	  	
    * @return summaryInfo.
 162	  	
    */
 163	  	
       DecimalFormat df = new DecimalFormat("#,##0.0##");
 164	  	
       String result = " ";
 165	  	
       result += "----- Summary for " + getName() + "-----";
 166	  	
       result += "Number of Ocathedrons: " + numberofOctahedron();
 167	  	
       result += "Total Surface Area: " + df.format(totalSurfaceArea());
 168	  	
       result += "Total Volume: " + df.format(totalVolume());
 169	  	
       result += "Average Surface Area: " + df.format(averageSurfaceArea());
 170	  	
       result += "Average Volume: " + df.format(averageVolume());
 171	  	
       result += "Average Surface/Volume Ratio: " 
 172	  	
          + df.format(averageSurfaceAreaToVolumeRatio());
 173	  	
    
 174	  	
       return (result);
 175	  	
    }   
 176	  	
    
 177	  	
    //new methods
 178	  	
    
 179	  	
    /** getList method. 
 180	  	
    * @return ArrayList getList.
 181	  	
    */
 182	  	
    public ArrayList getList() {
 183	  	
       return octahedronList;
 184	  	
    }
 185	  	
    
 186	  	
    /** readFile method.
 187	  	
    * @return OctedronList.
 188	  	
    * @param fileName.
 189	  	
    * @throws FileNotFoundException
 190	  	
    * @param fileNameIn for fileName to read
 191	  	
 
 192	  	
    */
 193	  	
    public OctahedronList readFile(String fileNameIn) 
 	  	
                                     throws FileNotFoundException {
  	
       Scanner scanFile = new Scanner(new File(fileNameIn)); //scans file name
 197	  	
       ArrayList<Octahedron> myList = new ArrayList<Octahedron>(); //arraylist of list names

 	
       String tListName = "";
 199	  	
       String label = ""; 
 200	  	
       String color = "";
 201	  	
       double edge = 0;
 202	  	
       
 203	  	
       listName = scanFile.nextLine(); //scans list name
 204	  	
       
 205	  	
       while (scanFile.hasNext()) {
 206	  	
          label = scanFile.nextLine();
 207	  	
          color = scanFile.nextLine();
 208	  	
          edge = Double.parseDouble(scanFile.next());
 209	  	
          Octahedron t = new Octahedron(label, color, edge);
 210	  	
          myList.add(t); //adds to arraylist of file
 211	  	
       }
 212	  	
       
 213	  	
       OctahedronList tL = new OctahedronList(listName, myList); //octahedronlist object with list name and arraylist
	  	
       return tL; //returns octahedronlist object
 215	  	
    }
 216	  	
    
 217	  	
    /** addOctahedron method.
 218	  	
    *
 219	  	
    */
 220	  	
    public void addOctahedron(String label, String color, double edge) {
  	
       Octahedron t = new Octahedron(label, color, edge); //new octahedron object
 222	  	
       octahedronList.add(t); 
 223	  	
       
 224	  	
    }
 225	  	
    
 226	  	
    /** findOctahedron method 
  	
    * @return findOctahedron.
 228	  	
    */
 229	  	
    public Octahedron findOctahedron(String labelIn) {
  	
       Octahedron z = null;
 231	  	
       for (Octahedron t: octahedronList){
  	
          if (t.getLabel().equalsIgnoreCase(labelIn))
 233	  	
          {
 234	  	
             z = t;
 235	  	
             
 236	  	
          }
 237	  	
          return z;
 238	  	
       
 239	  	
       }
 240	  	
       return null;
 241	  	
    }
 242	  	
  
 243	  	
       /** deleteOctahedron method. 
 244	  	
       * @return deleteOctahedron.
 245	  	
       */
 246	  	
    public Octahedron deleteOctahedron(String labelIn) {
 	
       Octahedron z = findOctahedron(labelIn);
 248	  	
       if (z != null) {
 249	  	
          octahedronList.remove(octahedronList.indexOf(z));
 250	  	
       } 
 251	  	
       return z;
 252	  	
       
 253	  	
          
 254	  	
    }
 255	  	
    
 256	  	
    
 257	  	
    /** editOctahedron method.
 258	  	
    * @return editOctahedron.
 259	  	
    */
 260	  	
    
 261	  	
    public Octahedron editOctahedron(String labelIn, String colorIn, double edgeIn) {
  	
       for (Octahedron t : octahedronList) {
 265	  	
          if (t.getLabel().equals(labelIn)) {
 266	  	
             t.setColor(colorIn);
 267	  	
             t.setEdge(edgeIn);
 268	  	
             return t;
 269	  	
             
 270	  	
             
 271	  	
          }
 272	  	
       }
 273	  	
       return null;
 274	  	
    }
