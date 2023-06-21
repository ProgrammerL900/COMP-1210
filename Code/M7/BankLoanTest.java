 import org.junit.Assert;
 2	  	
 import static org.junit.Assert.*;

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Using the '.*' form of import should be avoided - org.junit.Assert.*.

 3	  	
 import org.junit.Before;

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Unused import - org.junit.Before.

 4	  	
 import org.junit.Test;
 5	  	
 
 6	  	
 
 7	  	
 public class BankLoanTest {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 8	  	
 
 9	  	
 
 10	  	
    /** Fixture initialization (common initialization
 11	  	
     *  for all tests). **/
 12	  	
    //@Before public void setUp() {
 13	  	
    //}
 14	  	
 
 15	  	
 
 16	  	
    /** A test that always fails. **/
 17	  	
    //@Test public void defaultTest() {
 18	  	
       //Assert.assertEquals("Default test added by jGRASP. Delete "
 19	  	
          //   + "this test once you have added your own.", 0, 1);
 20	  	
    
 21	  	
    @Test public void chargeInterestTest() {
 22	  	
       BankLoan loan1 = new BankLoan("Jane", .10);
 23	  	
       loan1.borrowFromBank(1000.00);
 24	  	
       loan1.chargeInterest();
 25	  	
       Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
 26	  	
    }
 27	  	
    
 28	  	
    @Test public void borrowFromBankTest() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 29	  	
       BankLoan loan2 = new BankLoan("Joe", .20);
 30	  	
       loan2.borrowFromBank(1000.00);
 31	  	
       loan2.borrowFromBank(200.00);
 32	  	
       Assert.assertEquals(" ", 1200.00, loan2.getBalance(), .001);
 33	  	
    }
 34	  	
    
 35	  	
    @Test public void payBankTest() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 36	  	
       BankLoan loan3 = new BankLoan("Fred", .20);
 37	  	
       loan3.borrowFromBank(4000.00);
 38	  	
       loan3.payBank(1300.00);
 39	  	
       Assert.assertEquals(" ", 2700, loan3.getBalance(), .001);
 40	  	
    }
 41	  	
    
 42	  	
    @Test public void payBankTest2() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 43	  	
       BankLoan loan3 = new BankLoan("Fred", .20);
 44	  	
       loan3.payBank(1300.00);
 45	  	
       Assert.assertEquals(" ", 0.0, loan3.getBalance(), .001);
 46	  	
    }
 47	  	
    
 48	  	
    @Test public void setInterestRateTest1() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 49	  	
       BankLoan loan4 = new BankLoan("Ed", .10);
 50	  	
       loan4.setInterestRate(.50);
 51	  	
       Assert.assertEquals(" ", 0.0, loan4.getBalance(), .0001);
 52	  	
    }
 53	  	
    
 54	  	
    @Test public void setInterestRateTest2() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 55	  	
       BankLoan loan4 = new BankLoan("Ed", .10);
 56	  	
       loan4.setInterestRate(1.5);
 57	  	
       Assert.assertEquals(" ", 0.1, loan4.getInterestRate(), .0001);
 58	  	
    }
 59	  	
    
 60	  	
    @Test public void toStringTest() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 61	  	
       BankLoan loan5 = new BankLoan("Jess", .10);
 62	  	
       Assert.assertEquals(" ", loan5.toString());
 63	  	
       loan5.borrowFromBank(1000.00);
 64	  	
       Assert.assertEquals("", loan5.toString());
 65	  	
    }
 66	  	
    
 67	  	
    @Test public void isInDebtTest() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 68	  	
       BankLoan loan6 = new BankLoan("Bob", .10);
 69	  	
       loan6.isInDebt(loan6);
 70	  	
       loan6.borrowFromBank(100.00);
 71	  	
       loan6.isInDebt(loan6);
 72	  	
    }
 73	  	
    
 74	  	
    @Test public void LoanTest() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.


 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Name 'LoanTest' must match pattern '^[a-z][a-zA-Z0-9]*$'.

 75	  	
       BankLoan loan1 = new BankLoan("Bob", .10);
 76	  	
       BankLoan loan35 = new BankLoan("Pat", .29);
 77	  	
       BankLoan loan12 = new BankLoan("Ulta", .17);
 78	  	
       loan1.getLoansCreated();
 79	  	
       loan35.resetLoansCreated();
 80	  	
       loan12.getLoansCreated();
 81	  	
    }
 82	  	
    
 83	  	
    @Test public void isAmountValid() {

 	 	
 Error [Checkstyle]: 0 (limit exceeded)
Missing a Javadoc comment.

 84	  	
       BankLoan loan1 = new BankLoan("Tiff", .10);
 85	  	
       loan1.isAmountValid(50.00);
 86	  	
       loan1.isAmountValid(-14.00);
 87	  	
    
 88	  	
    }
 89	  	
 }
