 /**Octahedron class that stores.
 	  	
 *the label, color and edgelength.
 	  	
 * 
 	  	
 *Project 04.
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/18/2020.
 	  	
 */
 	  	
 
   	
 import java.text.DecimalFormat;
 	  	
    
 	  	
 public class Octahedron {


 	  	
 /** Octahedron class. 
 	  	
 */
 	  	
 
 	  	
 
 	  	
 //fields (instance variables)
 	  	
    private String label = " ";
 	  	
    private String color = " ";
 	  	
    private double edge = 0;
 	  	
    
 	  	
 /** @param args -- (not used).
 	  	
 */
 	  	
 
 	  	
 /** Constructors.
 	  	
 * @param labelIn string value for the label of the object.
 	  	
 * @param colorIn string value for te color of the object.
 	  	
 * @param edgeIn double value for the edge length.
 	  	
 */
 	  	
 
 	  	
 //constructor
 	  	
    public Octahedron (String labelIn, String colorIn, double edgeIn) 

	  	
    {
 	  	
    /** Octahedron constructor.
 	  	
    */
 	  	
       label = labelIn;
 	  	
       color = colorIn;
 	  	
       edge = edgeIn;
 	  	
    }
 	  	
 /** Methods.
 	  	
 */
 	  	
 
 	  	
 //Methods
 	  	
 
 	  	
 /** getlabel method.
 	  	
 * @return getLabel.
 	  	
 */
 	  	
 
 	  	
    public String getLabel() 
 	  	
    {
 	  	
    /** getLabel method.
 	  	
    * @return getLabel.
 	  	
    */
 	  	
       return label;
 	  	
    
 	  	
    }
 	  	
 
 	  	
 /** setlabel method.
 	  	
 */
 	  	
    public boolean setLabel(String labelIn) {

    /** setlabel method
 	  	
    * @return boolean setLabel.
 	  	
    */
 	  	
       boolean check = false;
 	  	
       if (labelIn != null) {
 	  	
          labelIn = label.trim();
 	  	
          check = true;
 	  	
          
 	  	
       }
 	  	
       else {
 	  	
          check = false;
 	  	
       }
 	  	
       return check;
 	  	
    }
 	  	
 /** getcolor method. 
 	  	
 */
 	  	
    public String getColor() 


 	  	
    {
 	  	
    /** String getColor method.
 	  	
    * @return getColor.
 	  	
    */
 	  	
       return color;
 	  	
    }
 	  	
 /**setcolor method.
 	  	
 */
 	  	
    public boolean setColor(String colorIn) {

    /** setColor method
 	  	
    * @return setColor.
 	  	
    */
 	  	
       boolean check = false;
 	  	
       if (colorIn != null) {
 	  	
          colorIn = color.trim();
 	  	
          check = true;
 	  	
       }
 	  	
       else {
 	  	
          check = false;
 	  	
       }
 	  	
      return check;
 	  	
    }
 	  	
 
 	  	
 /**getEdge method.
 	  	
 */
 	  	
    public double getEdge() {
	  	
    /** getEdge method.
 	  	
* @return double getEdge.
 	  	
    */
 	  	
       return edge; 
 	  	
    }
 	  	
 /**setEdge method.
 	  	
 */
 	  	
    public boolean setEdge(double edgeIn) {

 	  	
    /** setEdge method
 	  	
    * @return boolean setEdge.
 	  	
    */
 	  	
       boolean check = false;
 	  	
       if (edgeIn > 0) {
 	  	
          edge = edgeIn;
 	  	
          check = true;
 	  	
       }
 	  	
       else {
 	  	
          check = false; 
 	  	
       }
 	  	
       return check;
 	  	
    }
 	  	
 /**surfaceArea method. 
 	  	
 */
 	  	
    public double surfaceArea() {
	  	
    /** surfaceArea method.
 	  	
    * @return double surfaceArea. 
 	  	
    */
 	  	
       return (2 * Math.sqrt(3) * Math.pow(edge, 2));
 	  	
       
 	  	
    }
 	  	
 
 	  	
 /**volume method. 
 	  	
 */
 	  	
    public double Volume() {

 	  	
    /** Volume method
 	  	
    * @return double Volume. 
 	  	
    */
 	  	
       return ((Math.sqrt(2) / 3) * Math.pow(edge, 3));
 	  	
        
 	  	
    }
 	  	
 
 	  	
 /**surfaceToVolumeRatio method. 
 	  	
 */
 	  	
    public double surfaceToVolumeRatio() {
  	
    /** surfaceToVolumeRatio method.
 	  	
    * @return surfaceToVolumeRatio.
 	  	
    */
 	  	
       return (surfaceArea() / Volume());
 	  	
       
 	  	
    }
 	  	
 /**String output.
 	  	
 */
 	  	
 
 	  	
    public String toString()
	  	
    {
 	  	
    /** String toString method. 
 	  	
    * @return toString.
 	  	
    * @param toString.
 	  	
    */
 	  	
       DecimalFormat df = new DecimalFormat("#,##0.0###");
   	
    
 	  	
       String output = ("Octahedron " + "/" + label + " is " 
 	  	
          + "/" + color + " with 12 edges of length" 
 	  	
          + edge + " units.\n" 
 	  	
          + "\tsurface area = " + df.format(surfaceArea()) 
 	  	
          + "square units/n" + "\tvolume = "
 	  	
          + df.format(Volume()) + " cubic units\n " 
 	  	
          + "\tsurface/volume ratio = " 
 	  	
          + df.format(surfaceToVolumeRatio()));
 	  	
    
 	  	
       return (output);
 	  	
    }
 	  	
 }
