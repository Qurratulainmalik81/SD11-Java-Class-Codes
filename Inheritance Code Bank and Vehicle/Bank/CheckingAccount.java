public class CheckingAccount extends BankAccount {
    private double myInterest;//instance field
    public CheckingAccount()
    {   super();
        this.myInterest = 0.2;
    }
    public CheckingAccount(double interest)
    {   super();
        this.myInterest = interest;
    }
    public CheckingAccount(double amount, double interest)
    {   super(amount);
        this.myInterest = interest;
    }
    public double getMyInterest() {
        return myInterest;
    }
    public void setMyInterest(double myInterest) {
        this.myInterest = myInterest;
    }
    // @Override
    // public double getBalance() {
    //     // TODO Auto-generated method stub
    //     return super.getBalance();
    // }
    // @Override
    // public void setMyBal(double myBal) {
    //     // TODO Auto-generated method stub
    //     super.setMyBal(myBal);
    // }
    public void applyInterest() { 
        //we have interest rate this.myInterest
        //we need to find interest on this current balance --> super.getBalance()
        double currentInterest = super.getBalance() * this.myInterest /100;
        super.deposit(currentInterest);
        //this.setMyBal(currentInterest + getBalance());
       // super.setMyBal(currentInterest + getBalance());

     }
    public String toString()
    {
        return ("Checking Account:" + super.toString() + " Interest rate = " + this.myInterest);
    }
}
