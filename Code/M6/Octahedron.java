 /**Octahedron class that stores.
 2	  	
 *the label, color and edgelength.
 3	  	
 * 
 4	  	
 *Project 04.
 5	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 6	  	
 * @version 9/18/2020.
 7	  	
 */
 8	  	
 
 9	  	
 import java.text.DecimalFormat;
 10	  	
    
 11	  	
 public class Octahedron {


 12	  	
 /** Octahedron class. 
 13	  	
 */
 14	  	
 
 15	  	
 
 16	  	
 //fields (instance variables)
 17	  	
    private String label = " ";
 18	  	
    private String color = " ";
 19	  	
    private double edge = 0;
 20	  	
    
 21	  	
 /** @param args -- (not used).
 22	  	
 */
 23	  	
 
 24	  	
 /** Constructors.
 25	  	
 * @param labelIn string value for the label of the object.
 26	  	
 * @param colorIn string value for te color of the object.
 27	  	
 * @param edgeIn double value for the edge length.
 28	  	
 */
 29	  	
 
 30	  	
 //constructor
 31	  	
    public Octahedron (String labelIn, String colorIn, double edgeIn) 

	  	
    {
 33	  	
    /** Octahedron constructor.
 34	  	
    */
 35	  	
       label = labelIn;
 36	  	
       color = colorIn;
 37	  	
       edge = edgeIn;
 38	  	
    }
 39	  	
 /** Methods.
 40	  	
 */
 41	  	
 
 42	  	
 //Methods
 43	  	
 
 44	  	
 /** getlabel method.
 45	  	
 * @return getLabel.
 46	  	
 */
 47	  	
 
 48	  	
    public String getLabel() 
 49	  	
    {
 50	  	
    /** getLabel method.
 51	  	
    * @return getLabel.
 52	  	
    */
 53	  	
       return label;
 54	  	
    
 55	  	
    }
 56	  	
 
 57	  	
 /** setlabel method.
 58	  	
 */
 59	  	
    public boolean setLabel(String labelIn) {

    /** setlabel method
 61	  	
    * @return boolean setLabel.
 62	  	
    */
 63	  	
       boolean check = false;
 64	  	
       if (labelIn != null) {
 65	  	
          labelIn = label.trim();
 66	  	
          check = true;
 67	  	
          
 68	  	
       }
 69	  	
       else {
 70	  	
          check = false;
 71	  	
       }
 72	  	
       return check;
 73	  	
    }
 74	  	
 /** getcolor method. 
 75	  	
 */
 76	  	
    public String getColor() 


 77	  	
    {
 78	  	
    /** String getColor method.
 79	  	
    * @return getColor.
 80	  	
    */
 81	  	
       return color;
 82	  	
    }
 83	  	
 /**setcolor method.
 84	  	
 */
 85	  	
    public boolean setColor(String colorIn) {

    /** setColor method
 87	  	
    * @return setColor.
 88	  	
    */
 89	  	
       boolean check = false;
 90	  	
       if (colorIn != null) {
 91	  	
          colorIn = color.trim();
 92	  	
          check = true;
 93	  	
       }
 94	  	
       else {
 95	  	
          check = false;
 96	  	
       }
 97	  	
       return check;
 98	  	
    }
 99	  	
 
 100	  	
 /**getEdge method.
 101	  	
 */
 102	  	
    public double getEdge() {
	  	
    /** getEdge method.
 104	  	
    * @return double getEdge.
 105	  	
    */
 106	  	
       return edge; 
 107	  	
    }
 108	  	
 /**setEdge method.
 109	  	
 */
 110	  	
    public boolean setEdge(double edgeIn) {

 111	  	
    /** setEdge method
 112	  	
    * @return boolean setEdge.
 113	  	
    */
 114	  	
       boolean check = false;
 115	  	
       if (edgeIn > 0) {
 116	  	
          edge = edgeIn;
 117	  	
          check = true;
 118	  	
       }
 119	  	
       else {
 120	  	
          check = false; 
 121	  	
       }
 122	  	
       return check;
 123	  	
    }
 124	  	
 /**surfaceArea method. 
 125	  	
 */
 126	  	
    public double surfaceArea() {
	  	
    /** surfaceArea method.
 128	  	
    * @return double surfaceArea. 
 129	  	
    */
 130	  	
       return (2 * Math.sqrt(3) * Math.pow(edge, 2));
 131	  	
       
 132	  	
    }
 133	  	
 
 134	  	
 /**volume method. 
 135	  	
 */
 136	  	
    public double Volume() {

 137	  	
    /** Volume method
 138	  	
    * @return double Volume. 
 139	  	
    */
 140	  	
       return ((Math.sqrt(2) / 3) * Math.pow(edge, 3));
 141	  	
        
 142	  	
    }
 143	  	
 
 144	  	
 /**surfaceToVolumeRatio method. 
 145	  	
 */
 146	  	
    public double surfaceToVolumeRatio() {
  	
    /** surfaceToVolumeRatio method.
 148	  	
    * @return surfaceToVolumeRatio.
 149	  	
    */
 150	  	
       return (surfaceArea() / Volume());
 151	  	
       
 152	  	
    }
 153	  	
 /**String output.
 154	  	
 */
 155	  	
 
 156	  	
    public String toString()
	  	
    {
 158	  	
    /** String toString method. 
 159	  	
    * @return toString.
 160	  	
    * @param toString.
 161	  	
    */
 162	  	
       DecimalFormat df = new DecimalFormat("#,##0.0###");
 163	  	
    
 164	  	
       String output = ("Octahedron " + "/" + label + " is " 
 165	  	
          + "/" + color + " with 12 edges of length" 
 166	  	
          + edge + " units.\n" 
 167	  	
          + "\tsurface area = " + df.format(surfaceArea()) 
 168	  	
          + "square units/n" + "\tvolume = "
 169	  	
          + df.format(Volume()) + " cubic units\n " 
 170	  	
          + "\tsurface/volume ratio = " 
 171	  	
          + df.format(surfaceToVolumeRatio()));
 172	  	
    
 173	  	
       return (output);
 174	  	
    }
 175	  	
 }
