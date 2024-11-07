class BankAccount {
    private double myBal;//single instance variable
    public BankAccount() { myBal = 0.0; }// no argument constructor
    public BankAccount(double bal) { this.myBal = bal; }//parameterized constructor
    public double getBalance() { return myBal; }
    public void setMyBal(double myBal) { this.myBal = myBal;}
    public void deposit(double amount)
    {       // this.myBal = this.myBal + amount;
       setMyBal(amount + this.myBal);
    }
    public void withdraw(double amount)
    {
        if(this.myBal>=amount)
        this.myBal = this.myBal - amount;
        else
        System.out.println("Do not have enough balance");
    }
    public String toString()
    {
        return ("Balance = " + this.myBal);
    }

  }
  