 /** DBList file.
 2	  	
 * Project 10.
 3	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 4	  	
 * @version 11/12/2020.
 5	  	
 */
 6	  	
 
 7	  	
 import java.util.Arrays;
 8	  	
 import java.util.Scanner;
 9	  	
 import java.io.FileNotFoundException;
 10	  	
 import java.io.File;
 11	  	
 import java.util.NoSuchElementException;
 12	  	
 
 13	  	
 /** DBList class.
 14	  	
 */
 15	  	
 
 16	  	
 public class DBList {
 17	  	
    private DB[] objArray;
 18	  	
    private String[] invalRec;
 19	  	
    
 20	  	
    //constructor
 21	  	
    /** DBList constructor. */
 22	  	
 
 23	  	
    public DBList() {
 24	  	
       objArray = new DB[0];
 25	  	
       invalRec = new String[0];
 26	  	
    }
 27	  	
    
 28	  	
    //methods
 29	  	
    /** getDBArray method.
 30	  	
    * @return DB[] -- array of objects.
 31	  	
    */
 32	  	
    public DB[] getDBArray() {
 33	  	
       return objArray;
 34	  	
    }
 35	  	
    
 36	  	
    /** get invalid record array.
 37	  	
    * @return String[] string for array.
 38	  	
    */
 39	  	
    
 40	  	
    public String generateInvalidRecordsReport() {
 41	  	
       String result = "----------------------" 
 42	  	
          + "\nInvalid Records Report\n"
 43	  	
          + "----------------------\n";
 44	  	
       for (int i = 0; i < invalRec.length; i++) {
 45	  	
          result += invalRec[i] + "\n\n";
 46	  	
       }
 47	  	
       return result;
 48	  	
    
 49	  	
    }
 50	  	
    
 51	  	
    
 52	  	
    
 53	  	
    /** getInvalidRecordsArray method.
 54	  	
    * @return invalRec.
 55	  	
    */
 56	  	
    
 57	  	
    public String[] getInvalidRecordsArray() {
 58	  	
       return invalRec;
 59	  	
    }
 60	  	
    
 61	  	
    /** addDB method.
 62	  	
    * @param object for the DB object.
 63	  	
    */
 64	  	
    
 65	  	
    public void addDB(DB object) {
 66	  	
    
 67	  	
       objArray = Arrays.copyOf(objArray, objArray.length + 1);
 68	  	
       objArray[objArray.length - 1] = object;
 69	  	
    }
 70	  	
    
 71	  	
    /** addInvalidRecord method.
 72	  	
    * @param val for the string.
 73	  	
    */
 74	  	
    
 75	  	
    public void addInvalidRecord(String val) {
 76	  	
    
 77	  	
       invalRec = Arrays.copyOf(invalRec, invalRec.length + 1);
 78	  	
       invalRec[invalRec.length - 1] = val;
 79	  	
    }
 80	  	
    
 81	  	
    /** readFile method.
 82	  	
    * @param dataFile for the dataFile.
 83	  	
    * @throws FileNotFoundException for the exception.
 84	  	
    * @throws InvalidCategoryException for the exception.
 85	  	
    */
 86	  	
    
 87	  	
    public void readFile(String dataFile) 
 88	  	
       throws FileNotFoundException {
 89	  	
       Scanner scanFile = new Scanner(new File(dataFile));
 90	  	
       while (scanFile.hasNext()) 
 91	  	
       {
 92	  	
          String line = scanFile.nextLine();
 93	  	
          Scanner scanDB = new Scanner(line);
 94	  	
          scanDB.useDelimiter(",");
 95	  	
          try {
 96	  	
             char firstChar = scanDB.next().charAt(0);
 97	  	
             String name = scanDB.next();
 98	  	
             double bCost = Double.parseDouble(scanDB.next());
 99	  	
          
 100	  	
             DB dbObj;
 101	  	
             switch (firstChar) {
 102	  	
                case 'C': 
 103	  	
                   double monthlyCost = Double.parseDouble(scanDB.next());
 104	  	
                   double license = Double.parseDouble(scanDB.next());
 105	  	
                   dbObj = new CentralizedDB(name, bCost, monthlyCost, license);
 106	  	
                   addDB(dbObj);
 107	  	
                   break; 
 108	  	
             
 109	  	
                case 'D':
 110	  	
                   double storage = Double.parseDouble(scanDB.next());
 111	  	
                   int users = Integer.parseInt(scanDB.next());
 112	  	
                   double uCost = Double.parseDouble(scanDB.next());
 113	  	
                   dbObj = new DistributedDB(name, bCost, storage, users, uCost);
 114	  	
                   addDB(dbObj);
 115	  	
                   break;
 116	  	
                
 117	  	
                case 'H':
 118	  	
                   double storageIn = Double.parseDouble(scanDB.next());
 119	  	
                   int usersIn = Integer.parseInt(scanDB.next());
 120	  	
                   double uCostIn = Double.parseDouble(scanDB.next());
 121	  	
                   dbObj = new HomogeneousDB(name, bCost, storageIn,
 122	  	
                      usersIn, uCostIn);
 123	  	
                   addDB(dbObj);
 124	  	
                   break;
 125	  	
                
 126	  	
             
 127	  	
                
 128	  	
                case 'E':
 129	  	
                   double storageIns = Double.parseDouble(scanDB.next());
 130	  	
                   int usersIns = Integer.parseInt(scanDB.next());
 131	  	
                   double uCostIns = Double.parseDouble(scanDB.next());
 132	  	
                   dbObj = new HeterogeneousDB(name, bCost, storageIns,
 133	  	
                      usersIns, uCostIns);
 134	  	
                   addDB(dbObj);
 135	  	
                   break;
 136	  	
             
 137	  	
                default:
 138	  	
                   String str = String.valueOf(firstChar);
 139	  	
                   throw new InvalidCategoryException(str);
 140	  	
             
 141	  	
                
 142	  	
             
 143	  	
             }
 144	  	
          }
 145	  	
          
 146	  	
          catch (NumberFormatException error) {
 147	  	
             String arr = line + "\n" + error + "\n";
 148	  	
             addInvalidRecord(arr);
 149	  	
          }
 150	  	
          catch (InvalidCategoryException error) {
 151	  	
             String arr = line + "\n" + error + "\n";
 152	  	
             addInvalidRecord(arr);
 153	  	
          
 154	  	
          }
 155	  	
          catch (NoSuchElementException error) {
 156	  	
             String arr = line + "\n" + error
 157	  	
                + ": For missing input data.";
 158	  	
             addInvalidRecord(arr);
 159	  	
          }
 160	  	
       }
 161	  	
       scanFile.close();
 162	  	
       
 163	  	
    }
 164	  	
    
 165	  	
    /** generateReport method.
 166	  	
    * @return output.
 167	  	
    */
 168	  	
   
 169	  	
    
 170	  	
    public String generateReport() {
 171	  	
    
 172	  	
       String result = "";
 173	  	
       for (DB x : objArray) {
 174	  	
          result += x.toString() + "\n\n";
 175	  	
       }
 176	  	
       String output = "-------------------------------"
 177	  	
          + "\nMonthly Database Report\n"  
 178	  	
          + "-------------------------------\n"
 179	  	
          
 180	  	
          + result;
 181	  	
       return output;
 182	  	
       
 183	  	
    }
 184	  	
    
 185	  	
    /** generateReportByName method.
 186	  	
    * @return output.
 187	  	
    */
 188	  	
    
 189	  	
    public String generateReportByName() {
 190	  	
       
 191	  	
       
 192	  	
       Arrays.sort(getDBArray());
 193	  	
       String output = "-----------------------------------------"
 194	  	
             + "\nMonthly Database Report (by Name)\n"
 195	  	
             + "-----------------------------------------\n";
 196	  	
             
 197	  	
       
 198	  	
       for (DB db : getDBArray()) {
 199	  	
          output += db.toString() + "\n\n";
 200	  	
       }
 201	  	
       
 202	  	
       
 203	  	
            
 204	  	
       return output;
 205	  	
    }
 206	  	
    
 207	  	
    
 208	  	
    /** generateReportByMonthlyCost method.
 209	  	
    * @return output.
 210	  	
    */
 211	  	
    
 212	  	
    
 213	  	
    public String generateReportByMonthlyCost() {
 214	  	
       Arrays.sort(getDBArray(), new MonthlyCostComparator());
 215	  	
       String result = "";
 216	  	
       String output;
 217	  	
       for (int i = 0; i < objArray.length; i++) {
 218	  	
          result += objArray[i] + "\n\n";
 219	  	
       }
 220	  	
       output = "-------------------------------------------------"
 221	  	
             + "\nMonthly Database Report (by Monthly Cost)\n"
 222	  	
             + "-------------------------------------------------\n"
 223	  	
             + result;
 224	  	
       return output;
 225	  	
       
 226	  	
    
 227	  	
    }
 228	  	
    
 229	  	
    
 230	  	
 
 231	  	
 
 232	  	
 }
