 /** DivisionDriver file.
 2	  	
 * Activity 11.
 3	  	
 * @author Laura Wilson comp 1210 -- 001.
 4	  	
 * @version 11/16/2020.
 5	  	
 */
 6	  	
 
 7	  	
 import javax.swing.JOptionPane;
 8	  	
 
 9	  	
 /** public class DivisionDriver. */
 10	  	
 
 11	  	
 
 12	  	
 public class DivisionDriver {
 13	  	
 
 14	  	
 /** public main method.
 15	  	
 * @param args -- not used.
 16	  	
 */
 17	  	
 
 18	  	
    public static void main(String[] args) {
 19	  	
       String numInput = JOptionPane.showInputDialog("Enter the numerator");
 20	  	
       String denomInput = JOptionPane.showInputDialog("Enter the denominator");
 21	  	
       try {
 22	  	
          int num = Integer.parseInt(numInput);
 23	  	
          int denom = Integer.parseInt(denomInput);
 24	  	
       
 25	  	
          String result = "Integer division: \n" 
 26	  	
             + Division.intDivide(num, denom) 
 27	  	
             + "\n\nFloating point division: \n" 
 28	  	
             + Division.decimalDivide(num, denom);
 29	  	
       
 30	  	
          JOptionPane.showMessageDialog(null, result, "Result",
 31	  	
             JOptionPane.PLAIN_MESSAGE);
 32	  	
       } catch (NumberFormatException e) {
 33	  	
          JOptionPane.showMessageDialog(null,
 34	  	
             "Invalid input: enter numerical integer values only.",
 35	  	
              "Error", 
 36	  	
             JOptionPane.ERROR_MESSAGE);
 37	  	
       }
 38	  	
       catch (IllegalArgumentException e) {
 39	  	
          JOptionPane.showMessageDialog(null, e, "Error",
 40	  	
             JOptionPane.ERROR_MESSAGE);
 41	  	
       }
 42	  	
    }
}
