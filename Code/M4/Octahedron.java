 /**Octahedron class that stores.
 	  	
 *the label, color and edgelength.
 	  	
 * 
 	  	
 *Project 04.
 	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 	  	
 * @version 9/18/2020.
 	  	
 */
 	  	
 
 	  	
 import java.text.DecimalFormat;
 	  	
 
 	  	
 public class Octahedron {
 	  	
 /**Octahedron class. 
 	  	
 */
 	  	
 
 	  	
 
 	  	
 //fields (instance variables)
 	  	
    private String label = " ";
 	  	
    private String color = " ";
 	  	
    private double edge = 0;
 	  	
    private boolean check = false;
 	  	
   private DecimalFormat df = new DecimalFormat("#,##0.0###");
 	  	
    
 	  	
 /**
 	  	
 * @param args -- not used.
 	  	
 */
 	  	
 
 	  	
    public static void main(String[] args)
 	  	
    {
 	  	
       Octahedron ex1 = new Octahedron("Ex 2", "orange", 5.2);
 	  	
       System.out.println(ex1);
 	  	
    }
 	  	
 /**Constructors.
 	  	
 *@param labelIn string value for the label of the object
 	  	
 * @param colorIn string value for te color of the object
 	  	
 * @param edgeIn double value for the edge length
 	  	
 */
 	  	
 
 	  	
 //constructor
 	  	
    public Octahedron (String labelIn, String colorIn, double edgeIn) 
 	  	
    {
 	  	
       setLabel(labelIn);
 	  	
       setColor(colorIn);
 	  	
       setEdge(edgeIn);
 	  	
    }
 	  	
 /**Methods.
 	  	
 */
 	  	
 
 	  	
 //Methods
 	  	
 
 	  	
 /**getlabel method.
 	  	
 *@return local variables
 	  	
 */
   	
 
 	  	
    public String getLabel() 
 	  	
    {
 	  	
       return label;
 	  	
    
 	  	
    }
 	  	
 
 	  	
 /**setlabel method.
 	  	
 */
 	  	
    public boolean setLabel(String labelIn) {
 	  	
       boolean check = false;
 	  	
       if (labelIn != null) {
 	  	
          label = labelIn.trim();
 	  	
          check = true;
 	  	
          
 	  	
       }
 	  	
       else {
 	  	
          check = false;
 	  	
       }
 	  	
       return check;
 	  	
    }
 	  	
 /**getcolor method. 
 	  	
 */
 	  	
    public String getColor() 
 	  	
    {
 	  	
    /** 
 	  	
    * @return a string of the color.
 	  	
    */
 	  	
       return color;
 	  	
    }
 	  	
 /**setcolor method.
 	  	
 */
 	  	
    public String setColor(String colorIn) {
 	  	
     check = false;
 	  	
       if (colorIn != null) {
 	  	
          color = colorIn.trim();
 	  	
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
 	  	
       return edge; 
 	  	
    }
 	  	
 /**setEdge method.
 	  	
 */
   	
    public double setEdge(double edge) {
 	  	
       double check = false;
 	  	
       if (edge > 0) {
 	  	
          edge = edge;
 	  	
         check = true;
 	  	
       }
 	  	
       else {
 	  	
          check = false;
 	  	
         edge = edge; 
 	  	
       }
 	  	
       return check;
 	  	
    }
 	  	
 /**surfaceArea method. 
 	  	
 */
 	  	
    public double surfaceArea() {
 	  	
       return surfacearea;
 	  	
    }
 	  	
 
 	  	
 /**volume method. 
 	  	
 */
 	  	
    public double Volume() {
 	  	
       return volume; 
 	  	
    }
 	  	
 
 	  	
 /**surfaceToVolumeRatio method. 
 	  	
 */
 	  	
    public double surfaceToVolumeRatio() {
 	  	
       return ((2 * Math.sqrt(3) * Math.pow(edge, 2)) / ((Math.sqrt(2) / 3) * Math.pow(edge, 3)));
 	  	
    }
 	  	
 /**String output.
 	  	
 */
 	  	
 
 	  	
    pulic String toString()
 	  	
    {
 	  	
       String output = ("Octahedron " + "/" + label + " is " 
 	  	
          + "/" + color + " with 12 edges of length" 
 	  	
          + edge + " units.\n" 
 	  	
          + "\tsurface area = " + df.format(surfacearea) 
 	  	
          + "square units/n" + "\tvolume = "
 	  	
          + df.format(volume) + " cubic units\n " 
 	  	
          + "\tsurface/volume ratio = " 
 	  	
          + df.format(surfacetoVolumeRatio()));
 	  	
    
 	  	
       return (output);
 	  	
    }

 }
