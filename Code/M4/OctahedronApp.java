 /**
 * Project 4.	  	
 */
 	  	
 import java.util.Scanner;
 	  	
 public class OctahedronApp 
 	  	
 {
 	  	
    public static void main(String[] args)
 	  	
    {
 	  	
       Scanner userInput = new Scanner(System.in);
 	  	
       System.out.println("Enter label, color, and edge length"
 	  	
          + " for and octahedron.");
 	  	
       System.out.print("\tlabel: ");
 	  	
       String label = userInput.nextLine();
 	  	
       System.out.print("\tcolor: ");
 	  	
       String color = userInput.nextLine();
 	  	
       System.out.print("\tedge: ");
 	  	
       double edge = userInput.nextDouble();
 	  	
       if (edge < 0)
 	  	
       {
 	  	
          System.out.println("Error: edge must be non-negative.");
 	  	
       }
 	  	
       else {
 	  	
          Octahedron octa = new Octahedron(label, color, edge);
 	  	
          System.out.println("\n" + octa.toString());
 	  	
       }
 	  	
    }
 	  	
 }
