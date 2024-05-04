/**OctahedronListMenuApp.
 2	  	
 * 
 3	  	
 *Project 06.
 4	  	
 * @author Laura Wilson -- comp 1210.
 5	  	
 * @version 10/2/2020.
 6	  	
 */
 7	  	
 
 8	  	
 import java.util.ArrayList;
 9	  	
 import java.util.Scanner;
 10	  	
 import java.io.FileNotFoundException;
 11	  	
 import java.io.File;

 public class OctahedronListMenuApp

 	 	
 


 {
 15	  	
  
 16	  	
 /** OctahedronListMenuApp with main method.
 17	  	
  * @param args - (is not used).
 18	  	
  * @throws FileNotFoundException if the file cannot be opened.
 19	  	
  */
 20	  	
  
 21	  	
    public static void main(String[] args) throws FileNotFoundException
 22	  	
    {
 23	  	
       
 24	  	
         
 25	  	
       String tListName = "*** no list name assigned ***";
 26	  	
       ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
 27	  	
       OctahedronList myOList = new OctahedronList(tListName, myList);
 28	  	
       String fileName = " no file name";
 29	  	
       
 30	  	
       String code, color, label, labelIn, colorIn = "";
 31	  	
       double edge, edgeIn = 0;
 32	  	
       
 33	  	
       Scanner scan = new Scanner(System.in);
 34	  	
       
 35	  	
         
 36	  	
       
 37	  	
       //print out menu.
 38	  	
       System.out.println("OctahedronList System Menu\n"
 39	  	
                        + "R - Read in File and Create Octahedron List\n"
 40	  	
                        + "P - Print Octahedron List\n" 
 41	  	
                        + "S - Print Summary\n"
 42	  	
                        + "A - Print Octahedron\n"   
 43	  	
                        + "D - Delete Octahedron\n"   
 44	  	
                        + "F - Find Octahedron\n"
 45	  	
                        + "E - Edit Octahedron\n"
 46	  	
                        + "Q - Quit");
 47	  	
    
 48	  	
       do {
 49	  	
          System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
 50	  	
          code = scan.nextLine();
 51	  	
          code = code.trim();
 52	  	
          
 53	  	
          if (code.length() == 0) {
 54	  	
             continue;
 55	  	
          }
 56	  	
          
 57	  	
          char codeChar = code.charAt(0);
 58	  	
          switch(codeChar) {
 59	  	
             case 'R':
 60	  	
             case 'r':  // Read in File and Create OctahedronList
 61	  	
                System.out.print("\tFile name: ");
 62	  	
                fileName = scan.nextLine();
 63	  	
             
 64	  	
                myOList = myOList.readFile(fileName);
 65	  	
             
 66	  	
                System.out.println("\tFile read in and "
 67	  	
                               + "Octahedron List created\n");
 68	  	
                break; 
 69	  	
                     
 70	  	
             case 'P': // Print Octahedron list
 71	  	
             case 'p':
 72	  	
                System.out.println(myOList);
 73	  	
                break;
 74	  	
                
 75	  	
             case 'S': // Print summary info
 76	  	
             case 's':
 77	  	
                System.out.println("\n " + myOList.summaryInfo() 
 78	  	
                   + "\n ");
 79	  	
                break;
 80	  	
                
 81	  	
             case 'A': // add a octahedron
 82	  	
             case 'a': 
 83	  	
                System.out.print("\tLabel: ");
 84	  	
                label = scan.nextLine();
 85	  	
                System.out.print("\tColor: ");
 86	  	
                color = scan.nextLine();
 87	  	
                System.out.print("\tEdge: ");
 88	  	
                edge = Double.parseDouble(scan.nextLine());
 89	  	
                
 90	  	
                myOList.addOctahedron(label, color, edge);
 91	  	
                System.out.println("\t*** Octahedron added ***\n");
 92	  	
                                     
 93	  	
                break;
 94	  	
          
 95	  	
             case 'D': //delete octahedron object
 96	  	
             case 'd':
 97	  	
                System.out.print("\tLabel: ");
 98	  	
                label = scan.nextLine();
 99	  	
                
 100	  	
                
 101	  	
                if (myOList.deleteOctahedron(label) == null) {
 102	  	
                   System.out.println("\t\"" + label + "\" not found\n");
 103	  	
                }
 104	  	
                else {
 105	  	
                   System.out.println("\t\"" + label + "\" deleted\n");
 106	  	
                }
 107	  	
                break;
 108	  	
                
 109	  	
             case 'F': //Find Octahedron object
 110	  	
             case 'f':
 111	  	
                System.out.print("\tLabel: ");
 112	  	
                labelIn = scan.nextLine();
 113	  	
               
 114	  	
                if (myOList.findOctahedron(labelIn) == null) {
 115	  	
                   System.out.println("\t\"" + labelIn + "\" not found\n");
 116	  	
                }
 117	  	
                else {
 118	  	
                   System.out.println(myOList.findOctahedron(labelIn)
 119	  	
                      .toString() + "\n");
 120	  	
                }
 121	  	
             
 122	  	
                break;   
 123	  	
                
 124	  	
             case 'E': // Edit Octahedron Object
 125	  	
             case 'e': 
 126	  	
             
 127	  	
                System.out.print("\tLabel: ");
 128	  	
                labelIn = scan.nextLine();
 129	  	
                System.out.print("\tColor: ");
 130	  	
                colorIn = scan.nextLine();
 131	  	
                System.out.print("\tEdge: ");
 132	  	
                edgeIn = Double.parseDouble(scan.nextLine());
 133	  	
             
 134	  	
                if (myOList.findOctahedron(labelIn) == null) {
 135	  	
                   System.out.println("\t\"" + labelIn + "\" not found\n");
 136	  	
                }
 137	  	
                else {
 138	  	
                   myOList.editOctahedron(labelIn, colorIn, edgeIn);
 139	  	
                   System.out.println("\t\"" + labelIn
 140	  	
                      + "\" successfully edited\n");
 141	  	
                   
 142	  	
                }
 143	  	
                break;   
 144	  	
                   
 145	  	
             case 'Q': // Quit
 146	  	
             case 'q':
 147	  	
                break;
 148	  	
                
 149	  	
             default:  // no match, loop again
 150	  	
                System.out.println("t*** invalid code ***\n");
 151	  	
                break; 
 152	  	
          }
 153	  	
       
 154	  	
       } while (!code.equalsIgnoreCase("Q"));   
 155	  	
       
 156	  	
    }
 157	  	
 }
