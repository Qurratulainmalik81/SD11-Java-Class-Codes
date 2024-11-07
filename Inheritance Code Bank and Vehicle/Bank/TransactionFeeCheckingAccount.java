public class TransactionFeeCheckingAccount extends CheckingAccount {
    private static final double FEE = 2.00;
    public TransactionFeeCheckingAccount() {
      super();
      }
    public TransactionFeeCheckingAccount(double interest) {
     super(interest);
     }
     public TransactionFeeCheckingAccount(double amount, double interest) {
        super(amount, interest);
      }
    //Can add methods of your choice
      public void chargeFee() {
        withdraw(FEE);
      }
      
      public void deposit(double amount)
      {
       // super.deposit(amount-FEE);
     //  this.chargeFee();
     if((super.getBalance()+amount-FEE)>=FEE)
     {
       super.withdraw(FEE);
       super.deposit(amount);
     }
     else
     System.out.println("No enough funds for the FEE");
      }
      public void withdraw(double amount)
      {
        super.withdraw(amount+FEE);
        
      }
    public String toString()
   {
     return (super.toString() + " Transaction Fee = " + FEE);
   }

    }