
public class FeeAccount extends BankAccount {
    private static final double FEE = 1.00;


    public FeeAccount()
    {
        super();
    }
    public FeeAccount(double amount)
    {
        super(amount);
    }
    public void chargeFee() {
        withdraw(FEE);
      }      
      public void deposit(double amount)
      {
  
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
        
    public String toString() {     // overriding
      return  super.toString() + " (Fee: $" + FEE + ")";
  } }
  
