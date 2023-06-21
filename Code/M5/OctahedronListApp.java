 /**OctahedronListApp
 2	  	
 *
 3	  	
 *Project 05 
 4	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 5	  	
 * @version 9/25/2020.
 6	  	
 */
 7	  	
 
 8	  	
 import java.util.Scanner;
 9	  	
 import java.util.ArrayList;
 10	  	
 import java.io.File;
 11	  	
 import java.io.IOException;
 12	  	
 import java.text.DecimalFormat;
 13	  	
 
 14	  	
 /**
 15	  	
 *Creates class OctahedronListApp.
 16	  	
 */
 17	  	
 
 18	  	
 public class OctahedronListApp {
 19	  	
 /**
 20	  	
 *OctahedronListApp class.
 21	  	
 */
 22	  	
    public static void main(String[] args) throws IOException 
 23	  	
    {
 24	  	
    /**
 25	  	
    *main string method.
 26	  	
    */
 27	  	
       ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
 28	  	
       String fileName = "";
 29	  	
       String listName = "";
 30	  	
    
 31	  	
       Scanner scan = new Scanner(System.in);
 32	  	
    
 33	  	
       System.out.print("Enter file name: ");
 34	  	
       String fileName = scan.nextLine();
 35	  	
    
 36	  	
       Scanner scanFile = new Scanner (new file (fileName));
 37	  	
    
 38	  	
    
 39	  	
       while (scanFile.hasNext()) {
 40	  	
          label = scanFile.nextLine();
 41	  	
          color = scanFile.nextLine();
 42	  	
          edge = Double.parseDouble(scanFile.nextLine());
 43	  	
       
 44	  	
          Octhedron OctaObj = new Octahedron (label, color, edge);
 45	  	
          octaObjLiast.add(octaObj);
 46	  	
       
 47	  	
       }
 48	  	
       ScanFile.close();
 49	  	
       OctahedronList myList = new OctahedronList(listName, OctaObjectList);
 50	  	
    
 51	  	
       System.out.println("\n" + myList);
 52	  	
    
 53	  	
       System.out.println(myList.summaryInfo());
 54	  	
    
 55	  	
    }
 56	  	
 }
