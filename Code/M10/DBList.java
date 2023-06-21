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
 
 12	  	
 /** DBList class.
 13	  	
 */
 14	  	
 
 15	  	
 public class DBList {
 16	  	
    private DB[] objArray;
 17	  	
    private String[] invalRec;
 18	  	
    
 19	  	
    //constructor
 20	  	
    /** DBList constructor. */
 21	  	
 
 22	  	
    public DBList() {
 23	  	
       objArray = new DB[0];
 24	  	
       invalRec = new String[0];
 25	  	
    }
 26	  	
    
 27	  	
    //methods
 28	  	
    /** getDBArray method.
 29	  	
    * @return DB[] -- array of objects.
 30	  	
    */
 31	  	
    public DB[] getDBArray() {
 32	  	
       return objArray;
 33	  	
    }
 34	  	
    
 35	  	
    /** getInvalidRecordsArray method.
 36	  	
    * @return invalRec.
 37	  	
    */
 38	  	
    
 39	  	
    public String[] getInvalidRecordsArray() {
 40	  	
       return invalRec;
 41	  	
    }
 42	  	
    
 43	  	
    /** addDB method.
 44	  	
    * @param object for the DB object.
 45	  	
    */
 46	  	
    
 47	  	
    public void addDB(DB object) {
 48	  	
    //hints on last page
 49	  	
       objArray = Arrays.copyOf(objArray, objArray.length + 1);
 50	  	
       objArray[objArray.length - 1] = object;
 51	  	
    }
 52	  	
    
 53	  	
    /** addInvalidRecord method.
 54	  	
    * @param val for the string.
 55	  	
    */
 56	  	
    
 57	  	
    public void addInvalidRecord(String val) {
 58	  	
    //hints on class notes
 59	  	
       invalRec = Arrays.copyOf(invalRec, invalRec.length + 1);
 60	  	
       invalRec[invalRec.length - 1] = val;
 61	  	
    }
 62	  	
    
 63	  	
    /** readFile method.
 64	  	
    * @param dataFile for the dataFile.
 65	  	
    * @throws FileNotFoundException for the exception.
 66	  	
    */
 67	  	
    
 68	  	
    public void readFile(String dataFile) throws FileNotFoundException {
 69	  	
       Scanner scanFile = new Scanner(new File(dataFile));
 70	  	
       while (scanFile.hasNext()) 
 71	  	
       {
 72	  	
          String line = scanFile.nextLine();
 73	  	
          Scanner scanDB = new Scanner(line);
 74	  	
          scanDB.useDelimiter(",");
 75	  	
          char firstChar = scanDB.next().charAt(0);
 76	  	
          String name = scanDB.next();
 77	  	
          double bCost = Double.parseDouble(scanDB.next());
 78	  	
          
 79	  	
          DB dbObj;
 80	  	
          switch (firstChar) {
 81	  	
             case 'C': 
 82	  	
                double monthlyCost = Double.parseDouble(scanDB.next());
 83	  	
                double license = Double.parseDouble(scanDB.next());
 84	  	
                dbObj = new CentralizedDB(name, bCost, monthlyCost, license);
 85	  	
                addDB(dbObj);
 86	  	
                break; 
 87	  	
          
 88	  	
             case 'D':
 89	  	
                double storage = Double.parseDouble(scanDB.next());
 90	  	
                int users = Integer.parseInt(scanDB.next());
 91	  	
                double uCost = Double.parseDouble(scanDB.next());
 92	  	
                dbObj = new DistributedDB(name, bCost, storage, users, uCost);
 93	  	
                addDB(dbObj);
 94	  	
                break;
 95	  	
                
 96	  	
             case 'H':
 97	  	
                double storageIn = Double.parseDouble(scanDB.next());
 98	  	
                int usersIn = Integer.parseInt(scanDB.next());
 99	  	
                double uCostIn = Double.parseDouble(scanDB.next());
 100	  	
                dbObj = new HomogeneousDB(name, bCost, storageIn,
 101	  	
                   usersIn, uCostIn);
 102	  	
                addDB(dbObj);
 103	  	
                break;
 104	  	
                
 105	  	
           
 106	  	
                
 107	  	
             case 'E':
 108	  	
                double storageIns = Double.parseDouble(scanDB.next());
 109	  	
                int usersIns = Integer.parseInt(scanDB.next());
 110	  	
                double uCostIns = Double.parseDouble(scanDB.next());
 111	  	
                dbObj = new HeterogeneousDB(name, bCost, storageIns,
 112	  	
                   usersIns, uCostIns);
 113	  	
                addDB(dbObj);
 114	  	
                break;
 115	  	
             
 116	  	
             default:
 117	  	
                addInvalidRecord(name);
 118	  	
                break;
 119	  	
          
 120	  	
          }
 121	  	
       }
 122	  	
       
 123	  	
    }
 124	  	
    
 125	  	
    /** generateReport method.
 126	  	
    * @return output.
 127	  	
    */
 128	  	
   
 129	  	
    
 130	  	
    public String generateReport() {
 131	  	
    
 132	  	
       String result = "";
 133	  	
       for (DB x : objArray) {
 134	  	
          result += x.toString() + "\n\n";
 135	  	
       }
 136	  	
       String output = "-------------------------------"
 137	  	
          + "\nMonthly Database Report\n"
 138	  	
          + "-----------------------\n"
 139	  	
          + result;
 140	  	
       return output;
 141	  	
       
 142	  	
    }
 143	  	
    
 144	  	
    /** generateReportByName method.
 145	  	
    * @return output.
 146	  	
    */
 147	  	
    
 148	  	
    public String generateReportByName() {
 149	  	
       
 150	  	
       String result = "";
 151	  	
       String output;
 152	  	
       Arrays.sort(getDBArray());
 153	  	
       for (int i = 0; i < objArray.length; i++) {
 154	  	
          result += objArray[i] + "\n\n";
 155	  	
       }
 156	  	
       
 157	  	
       output = "-----------------------------------------------"
 158	  	
             + "\nMonthly Database Report (by Name)\n"
 159	  	
             + "------------------------------------------------\n"
 160	  	
             + result;
 161	  	
       return output;
 162	  	
    }
 163	  	
    
 164	  	
    /** generateReportByMonthlyCost method.
 165	  	
    * @return output.
 166	  	
    */
 167	  	
    
 168	  	
    
 169	  	
    public String generateReportByMonthlyCost() {
 170	  	
       Arrays.sort(getDBArray(), new MonthlyCostComparator());
 171	  	
       String result = "";
 172	  	
       String output;
 173	  	
       for (int i = 0; i < objArray.length; i++) {
 174	  	
          result += objArray[i] + "\n\n";
 175	  	
       }
 176	  	
       output = "-----------------------------------------------------"
 177	  	
             + "\nMonthly Database Report (by Monthly Cost)\n"
 178	  	
             + "------------------------------------------------------\n"
 179	  	
             + result;
 180	  	
       return output;
 181	  	
       
 182	  	
    
 183	  	
    }
 184	  	
    
 185	  	
    
 186	  	
 
 187	  	
 
 188	  	
 }
