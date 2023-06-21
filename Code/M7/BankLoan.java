/** BankLoan Activity. 
 2	  	
 * Activity 07.
 3	  	
 * @author Laura Wilson -- comp 1210 -- 001.
 4	  	
 * @version 10/13/2020.
 5	  	
 */
 6	  	
 
 7	  	
 /** BankLoan public class.
 8	  	
 * with instance variables.
 9	  	
 */
 10	  	
 public class BankLoan {
 11	  	
  /** BankLoan public class.
 12	  	
 * with instance variables.
 13	  	
 */
 14	  	
 
 15	  	
     // constant fields
 16	  	
    private static final int MAX_LOAN_AMOUNT = 100000;
 17	  	
 
 18	  	
    // instance variables (can be used within the class)
 19	  	
    private String customerName;
 20	  	
    private double balance, interestRate;
 21	  	
    // add static variable
 22	  	
    private static int loansCreated = 0; 
 23	  	
    
 24	  	
    /* BankLoan constructor with parameter.
 25	  	
    * loanCreated++.
 26	  	
    * @param customerNameIn.
 27	  	
    * @param interestRateIn.
 28	  	
    */
 29	  	
 
 30	  	
    public BankLoan(String customerNameIn, double interestRateIn) { 

 	 	
 Error [Checkstyle]: -4
Missing a Javadoc comment.

 31	  	
    
 32	  	
       customerName = customerNameIn;
 33	  	
       interestRate = interestRateIn;
 34	  	
       balance = 0;
 35	  	
       //increments when instatntiated
 36	  	
       loansCreated++; 
 37	  	
    }
 38	  	
    /** borrowFromBank method with amount parameter.
 39	  	
    * @return borrowFromBank.
 40	  	
    * @param borrowFromBank amount.

 	 	
 Error [Checkstyle]: -4
Unused @param tag for 'borrowFromBank'.

 41	  	
    */
 42	  	
 
 43	  	
    public boolean borrowFromBank(double amount) {

 	 	
 Error [Checkstyle]: -4
Expected @param tag for 'amount'.

 44	  	
       
 45	  	
       boolean wasLoanMade = false;
 46	  	
       
 47	  	
       if (balance + amount < MAX_LOAN_AMOUNT) {
 48	  	
          wasLoanMade = true;
 49	  	
          balance += amount;
 50	  	
       }
 51	  	
    
 52	  	
       return wasLoanMade;
 53	  	
    }
 54	  	
    
 55	  	
    /** payBank method with amountPaid parameter.
 56	  	
    * @return payBank.
 57	  	
    * @param payBank amountPaid.

 	 	
 Error [Checkstyle]: -4
Unused @param tag for 'payBank'.

 58	  	
    */
 59	  	
 
 60	  	
    public double payBank(double amountPaid) {

 	 	
 Error [Checkstyle]: -4
Expected @param tag for 'amountPaid'.

 61	  	
       double newBalance = balance - amountPaid;
 62	  	
       if (newBalance < 0) {
 63	  	
          balance = 0;
 64	  	
          // paid too much, return the overcharge
 65	  	
          return Math.abs(newBalance);
 66	  	
       }
 67	  	
       else {
 68	  	
          balance = newBalance;
 69	  	
          return 0;
 70	  	
       }
 71	  	
    }
 72	  	
    
 73	  	
    /* getBalance method with no parameter.
 74	  	
    * @return getBalance.
 75	  	
    */
 76	  	
    
 77	  	
    public double getBalance() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 78	  	
    /* getBalance method with no parameter.
 79	  	
    * @return getBalance.
 80	  	
    */
 81	  	
    
 82	  	
       return balance;
 83	  	
    }
 84	  	
    
 85	  	
    /** setInterstRate method with interestRateIn parameter.
 86	  	
    * @return setInerestRate. 
 87	  	
    * @param setInterestRate interestRateIn.

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Unused @param tag for 'setInterestRate'.

 88	  	
    */
 89	  	
    
 90	  	
    public boolean setInterestRate(double interestRateIn) {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Expected @param tag for 'interestRateIn'.

 91	  	
    
 92	  	
       if (interestRateIn >= 0 && interestRateIn <= 1) {
 93	  	
          interestRate = interestRateIn;
 94	  	
          return true;
 95	  	
       }
 96	  	
       else {
 97	  	
          return false;
 98	  	
       }
 99	  	
    }
 100	  	
    
 101	  	
    /** getInerestRate method.
 102	  	
    * @return getInerestRate.
 103	  	
    *
 104	  	
    */
 105	  	
    
 106	  	
    public double getInterestRate() {
 107	  	
       return interestRate;
 108	  	
    }
 109	  	
    
 110	  	
    /** chargeInterest method.
 111	  	
    * 
 112	  	
    */
 113	  	
    
 114	  	
    public void chargeInterest() {
 115	  	
       balance = balance * (1 + interestRate);
 116	  	
       
 117	  	
    }
 118	  	
    
 119	  	
    /** toString method.
 120	  	
    * @param String toString.

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Unused @param tag for 'String'.

 121	  	
    * @return toString.
 122	  	
    */
 123	  	
    
 124	  	
    public String toString() {
 125	  	
       String output = "Name: " + customerName + "\r\n" 
 126	  	
          + "Interest rate: " + interestRate + "%\r\n" 
 127	  	
          + "Balance: $" + balance + "\r\n";
 128	  	
       return output;
 129	  	
    }
 130	  	
    
 131	  	
    /** isAmountValid method with amount parameter.
 132	  	
    * @return amount.
 133	  	
    * @param isAmountValid amount.

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Unused @param tag for 'isAmountValid'.

 134	  	
    */
 135	  	
    
 136	  	
    public static boolean isAmountValid(double amount) {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Expected @param tag for 'amount'.

 137	  	
       return amount >= 0;
 138	  	
        
 139	  	
       
 140	  	
      
 141	  	
    }
 142	  	
    
 143	  	
    /** isInDebt method with BankLoan loan parameter.
 144	  	
    * @return isInDebt.
 145	  	
    * @param isInDebt loan.

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Unused @param tag for 'isInDebt'.

 146	  	
    * new method added.
 147	  	
    */
 148	  	
    
 149	  	
    public static boolean isInDebt(BankLoan loan) {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Expected @param tag for 'loan'.

 150	  	
       if (loan.getBalance() > 0) {
 151	  	
          return true;
 152	  	
       }
 153	  	
       return false;
 154	  	
    }
 155	  	
    
 156	  	
    //access the variable
 157	  	
    /** getLoansCreated method.
 158	  	
    * @return getLoansCreated. 
 159	  	
    * new method added. 
 160	  	
    */
 161	  	
    public static int getLoansCreated() {
 162	  	
       return loansCreated;
 163	  	
    }
 164	  	
    
 165	  	
    //resets the number of loans created to 0
 166	  	
    
 167	  	
    /** resetLoansCreated method.
 168	  	
    * new method created.
 169	  	
    */
 170	  	
    public static void resetLoansCreated() {
 171	  	
       loansCreated = 0;
 172	  	
    }
 173	  	
 
 174	  	
 }
