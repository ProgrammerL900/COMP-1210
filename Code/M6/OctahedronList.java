/**OctahedronList stores names of list.
 	  	
 *and ArrayList of objects.
 	  	
 *
 	  	
 *Project 05.
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/25/2020.
 	  	
 */
 	  	
 
 	  	
 //import scanner and array list
 	  	
 
 	  	
 import java.util.ArrayList;
 	  	
 import java.text.DecimalFormat;
 	  	
 import java.util.Scanner;
 	  	
 import java.io.FileNotFoundException;
 	  	
 import java.io.File;
 	  	
 
 	  	
 public class OctahedronList {

  	
 /** OctahedronList class.
 	  	
 */
 	  	
 
 	  	
 //fields
 	  	
    private String listName;
 	  	
    private ArrayList<Octahedron> octahedronList; //objects
 	  	
    
 	  	
 //constructor
 	  	
    public OctahedronList (String listNameIn, ArrayList<Octahedron> octahedronListIn) {


      /** OctahedronList constructor.
 	  	
      */
 	  	
      octahedronList = octahedronListIn;
 	  	
       listName= listNameIn;
  	
    }
 	  	
 //Methods
 	  	
 
 	  	
 //getName method
 	  	
 
 	  	
    public String getName() {
 	
    /** getName method.
 	  	
    * @return String getName.
 	  	
    */
 	  	
       return listName;
 	  	
    }
 	  	
    
 	  	
 //number of octahedron method
 	  	
    public int numberofOctahedron() {
 	
    /** numberofOctahedron method.
 	  	
   * @return int numberofOctahedron. 
 	  	
    */
 	  	
       int numberofOctahedron = 0;
 	  	
       if (octahedronList.size() != 0) {
 	  	
          return octahedronList.size();
 	  	
       }
 	  	
       else {
 	  	
          return 0;
 	  	
       }
 	  	
    }
 	  	
  
 	  	
 //total surfaceArea
 	  	
    public double totalSurfaceArea() {
 	
    /** totalSurfaceArea method.
 	  	
    * @return totalSurfaceArea.
 	  	
    */
 	  	
      
 	  	
       if (octahedronList.size() == 0) {
 	  	
          return 0.0;
 	  	
       } else {
 	  	
          double output = 0.0;
 	  	
          int index = 0;
 	  	
          while (index < octahedronList.size())
 	  	
          {
 	  	
             output += octahedronList.get(index).surfaceArea();
 	  	
          }
 	  	
          return output;
 	  	
       }  
 	  	
    } 
 	  	
 
 	  	
 //total Volume
	  	
    public double totalVolume() {
	
    /** totalVolume method.
 	  	
    * @return totalVolume.
 	  	
    */
 	  	
       
 	  	
       if (octahedronList.size() == 0)
 	  	
       {
 	  	
          return 0.0;
 	  	
       } else {
 	  	
          double output = 0.0;
 	  	
          int index = 0;
 	  	
          while (index < octahedronList.size())
 	  	
          {
 	  	
             output += octahedronList.get(index).Volume();
 	  	
             index++;
 	  	
          }
 	  	
          return output;
 	  	
       }
 	  	
    }
 	  	
    
 	  	
 // average surfaceArea
 	  	
    public double averageSurfaceArea() {

 	
    /** averageSurfaceArea method.
 	  	
    * @return averageSurfaceArea.
 	  	
    */
 	  	
       if (octahedronList.size() != 0) {
 	  	
          return (totalSurfaceArea() / octahedronList.size());
 	  	
       } else {
 	  	
          return 0.0;
 	  	
       }
 	  	
    }
 	  	
    
 	  	
 //average volume
 	  	
    public double averageVolume() {
 	
    /** averageVolume method.
	  	
    * @return averageVolume.
 	  	
    */
 	  	
       
 	  	
       if (octahedronList.size() != 0) {
 	  	
          return totalVolume() / (double) octahedronList.size();
 	  	
       } else {
 	  	
          return 0.0;
 	  	
       }
 	  	
    }   
 	  	
 
 	  	
 //averageSurfaceToVolume Ratio
 	  	
    public double averageSurfaceAreaToVolumeRatio () {
  	
    /** averageSurfaceToVolumeRatio method.
 	  	
    * @return averageSurfaceAreaToVolumeRatio.
 	  	
    */
 	  	
       double averageRatio = 0.0;
 	  	
       for (int i = octahedronList.size() -1; i > -1; i--)
  	
       {
 	  	
          averageRatio += octahedronList.get(i).surfaceToVolumeRatio();
 	  	
       }
 	  	
       if (octahedronList.size() > 0)
 	  	
       {
 	  	
          return (averageRatio / octahedronList.size());
 	  	
       } else { 
 	  	
          return averageRatio;
 	  	
       }
 	  	
       
 	  	
    
 	  	
       
 	  	
    }
 	  	
    
 	  	
 //toString
 	  	
    public String toString() {
  	
    /** toString method.
 	  	
    * @return toString.
 	  	
    * @param toString.
 	  	
    */
 	  	
       String result = "\n" + octahedronList + "\n";
 	  	
       int index = 0;
 	  	
       while (index < octahedronList.size()) {
 	  	
          result += "\n" + octahedronList.get(index) + "\n";
 	  	
          index++;
 	  	
       }
 	  	
       return result;
 	  	
    }
 	  	
    
 	  	
 //summaryinfo
 	  	
    public String summaryInfo() {
	  	
    /** summaryInfo method.
 	  	
    * @return summaryInfo.
 	  	
    */
 	  	
       DecimalFormat df = new DecimalFormat("#,##0.0##");
 	  	
       String result = " ";
 	  	
       result += "----- Summary for " + getName() + "-----";
 	  	
       result += "Number of Ocathedrons: " + numberofOctahedron();
 	  	
       result += "Total Surface Area: " + df.format(totalSurfaceArea());
 	  	
       result += "Total Volume: " + df.format(totalVolume());
 	  	
       result += "Average Surface Area: " + df.format(averageSurfaceArea());
 	  	
       result += "Average Volume: " + df.format(averageVolume());
 	  	
       result += "Average Surface/Volume Ratio: " 
 	  	
          + df.format(averageSurfaceAreaToVolumeRatio());
 	  	
    
 	  	
       return (result);
 	  	
    }   
 	  	
    
 	  	
    //new methods
 	  	
    
 	  	
    /** getList method. 
 	  	
    * @return ArrayList getList.
 	  	
    */
 	  	
    public ArrayList getList() {
 	  	
       return octahedronList;
 	  	
    }
 	  	
    
 	  	
    /** readFile method.
 	  	
    * @return OctedronList.
 	  	
    * @param fileName.
 	  	
    * @throws FileNotFoundException
 	  	
    * @param fileNameIn for fileName to read
 	  	
 
 	  	
    */
 	  	
    public OctahedronList readFile(String fileNameIn) 
 	  	
                                     throws FileNotFoundException {
  	
       Scanner scanFile = new Scanner(new File(fileNameIn)); //scans file name
 	  	
       ArrayList<Octahedron> myList = new ArrayList<Octahedron>(); //arraylist of list names

 	
       String tListName = "";
 	  	
       String label = ""; 
 	  	
       String color = "";
 	  	
       double edge = 0;
 	  	
       
 	  	
       listName = scanFile.nextLine(); //scans list name
 	  	
       
 	  	
       while (scanFile.hasNext()) {
 	  	
          label = scanFile.nextLine();
 	  	
          color = scanFile.nextLine();
 	  	
          edge = Double.parseDouble(scanFile.next());
 	  	
          Octahedron t = new Octahedron(label, color, edge);
 	  	
          myList.add(t); //adds to arraylist of file
 	  	
       }
 	  	
       
 	  	
       OctahedronList tL = new OctahedronList(listName, myList); //octahedronlist object with list name and arraylist
	  	
       return tL; //returns octahedronlist object
 	  	
    }
 	  	
    
 	  	
    /** addOctahedron method.
 	  	
    *
 	  	
    */
 	  	
    public void addOctahedron(String label, String color, double edge) {
  	
       Octahedron t = new Octahedron(label, color, edge); //new octahedron object
 	  	
       octahedronList.add(t); 
 	  	
       
 	  	
    }
 	  	
    
 	  	
    /** findOctahedron method 
  	
    * @return findOctahedron.
 	  	
    */
 	  	
    public Octahedron findOctahedron(String labelIn) {
  	
       Octahedron z = null;
 	  	
       for (Octahedron t: octahedronList){
  	
          if (t.getLabel().equalsIgnoreCase(labelIn))
	  	
          {
 	  	
             z = t;
 	  	
             
 	  	
          }
 	  	
          return z;
 	  	
       
 	  	
       }
 	  	
       return null;
 	  	
    }
 	  	
  
 	  	
       /** deleteOctahedron method. 
 	  	
       * @return deleteOctahedron.
 	  	
       */
 	  	
    public Octahedron deleteOctahedron(String labelIn) {
 	
       Octahedron z = findOctahedron(labelIn);
 	  	
       if (z != null) {
 	  	
          octahedronList.remove(octahedronList.indexOf(z));
 	  	
       } 
 	  	
       return z;
 	  	
       
 	  	
          
 	  	
    }
 	  	
    
 	  	
    
 	  	
    /** editOctahedron method.
 	  	
    * @return editOctahedron.
 	  	
    */
 	  	
    
	  	
    public Octahedron editOctahedron(String labelIn, String colorIn, double edgeIn) {
  	
       for (Octahedron t : octahedronList) {
 	  	
          if (t.getLabel().equals(labelIn)) {
 	  	
             t.setColor(colorIn);
 	  	
             t.setEdge(edgeIn);
 	  	
             return t;
 	  	
             
 	  	
             
 	  	
          }
 	  	
       }
 	  	
       return null;
 	  	
    }
