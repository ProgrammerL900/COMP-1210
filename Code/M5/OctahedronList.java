 /**OctahedronList stores names of list.
 	  	
 *and ArrayList of objects.
 3	  	
 *
 4	  	
 *Project 05.
 5	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 6	  	
 * @version 9/25/2020.
 7	  	
 */
 8	  	
 
 9	  	
 //import scanner and array list
 10	  	
 
 11	  	
 import java.util.ArrayList;
 12	  	
 
 13	  	
 public class OctahedronList {
 14	  	
 /**
 15	  	
 *Octahedron class.
 16	  	
 */
 17	  	
 
 18	  	
 //fields
 19	  	
    private String listName;
 20	  	
    private ArrayList<Octahedron> octahedronList;
 21	  	
    
 22	  	
 //constructor
 23	  	
    public OctahedronList (String listNameIn, ArrayList<Octahedron> octahedronListIn) {
 24	  	
       /**
 25	  	
       *OctahedronList construtor.
 26	  	
       */
 27	  	
       octahedronList = octahedronListIn;
 28	  	
       listName= listNameIn;
 29	  	
    }
 30	  	
 //Methods
 31	  	
 
 32	  	
 //getName method
 33	  	
 
 34	  	
    public String getName() {
 35	  	
    /**
 36	  	
    *getName method.
 37	  	
    */
 38	  	
       return listName;
 39	  	
    }
 40	  	
    
 41	  	
 //number of octahedron method
 42	  	
    public int numberofOctahedron() {
 43	  	
    /** 
 44	  	
    *numberofOctahedron method.
 45	  	
    */
 46	  	
       int numberofOctahedron = 0;
 47	  	
       if (octahedronList.size() != 0) {
 48	  	
          return octahedronList.size();
 49	  	
       }
 50	  	
       else {
 51	  	
          return 0;
 52	  	
       }
 53	  	
    }
 54	  	
  
 55	  	
 //total surfaceArea
 56	  	
    public double totalSurfaceArea() {
 57	  	
    /**
 58	  	
    *total surfaceArea
 59	  	
    */
 60	  	
      
 61	  	
       if (octahedronList.size() == 0) {
 62	  	
          return 0.0;
 63	  	
       } else {
 64	  	
          double output = 0.0;
 65	  	
          int index = 0;
 66	  	
          while (index < octahedronList.size())
 67	  	
          {
 68	  	
             output += octahedronList.get(index).surfaceArea();
 69	  	
          }
 70	  	
          return output;
 71	  	
       }  
 72	  	
    } 
 73	  	
 
 74	  	
 //total Volume
 75	  	
    public double totalVolume() {
 76	  	
    /**
 77	  	
    *total Volume method.
 78	  	
    */
 79	  	
       
 80	  	
       if (octahedronList.size() == 0)
 81	  	
       {
 82	  	
          return 0.0;
 83	  	
       } else {
 84	  	
          double output = 0.0;
 85	  	
          int index = 0;
 86	  	
          while (index < octahedronList.size())
 87	  	
          {
 88	  	
             output += octahedronList.get(index).Volume();
 89	  	
             index++;
 90	  	
          }
 91	  	
          return output;
 92	  	
       }
 93	  	
    }
 94	  	
    
 95	  	
 // average surfaceArea
 96	  	
    public double averageSurfaceArea() {
 97	  	
    /** 
 98	  	
    *average surfaceArea
 99	  	
    */
 100	  	
       if (octahedronList.size() != 0) {
 101	  	
          return (totalSurfaceArea / octahedronList.size());
 102	  	
       } else {
 103	  	
          return 0.0;
 104	  	
       }
 105	  	
    }
 106	  	
    
 107	  	
 //average volume
 108	  	
    public double averageVolume() {
 109	  	
    /** 
 110	  	
    *average volume method.
 111	  	
    */
 112	  	
       
 113	  	
       if (octahedronList.size() != 0) {
 114	  	
          return totalVoume(octahedronList) / (double) ocatahedronList.size();
 115	  	
       } else {
 116	  	
          return 0.0;
 117	  	
       }
 118	  	
    }   
 119	  	
 
 120	  	
 //averageSurfaceToVolume Ratio
 121	  	
    public double averageSurfaceAreaToVolumeRatio () {
 122	  	
    /**
 123	  	
    *averageSurfaceToVolumeRatio method.
 124	  	
    */
 125	  	
       double ratio = 0.0;
 126	  	
       for (int i = octahedronList.size() -1; i > -1; i--)
 127	  	
       {
 128	  	
          averageRatio += octahedronList.get(i).surfaceToVolumeRation();
 129	  	
       }
 130	  	
       if (octahedronList.size() > 0)
 131	  	
       {
 132	  	
          return (averagRatio / octahedronList.size());
 133	  	
       } else { 
 134	  	
          return averageRatio;
 135	  	
       }
 136	  	
       
 137	  	
    
 138	  	
       
 139	  	
    }
 140	  	
 //toString
 141	  	
    public String toString() {
 142	  	
    /**
 143	  	
    *toString method.
 144	  	
    */
 145	  	
       String = result = "\n" + octahedronList + "\n";
 146	  	
       int index = 0;
 147	  	
       while (index < octahedron.size()) {
 148	  	
          result += "\n" + octahedron.get(index) + "\n";
 149	  	
          index++;
 150	  	
       }
 151	  	
       return result;
 152	  	
    }
 153	  	
    
 154	  	
 //summaryinfo
 155	  	
    public String summaryInfo() {
 156	  	
    /**
 157	  	
    *summaryInfo method.
 158	  	
    */
 159	  	
       DecimalFormat df = new DecimalFormat("#,##0.0##");
 160	  	
       String result = " ";
 161	  	
       result += "----- Summary for " + getName() + "-----";
 162	  	
       result += "Number of Ocathedrons: " + numberofOctahedron();
 163	  	
       result += "Total Surface Area: " + df.format(totalSurfaceArea());
 164	  	
       result += "Total Volume: " + df.format(totalVolume());
 165	  	
       result += "Average Surface Area: " + df.format(averageSurfaceArea());
 166	  	
       result += "Average Volume: " + df.format(averageVolume());
 167	  	
       result += "Average Surface/Volume Ratio: " 
 168	  	
          + df.format(averageSurfaceToVolumeRatio());
 169	  	
    
 170	  	
       return result;
 171	  	
    }   
 172	  	
 }
