

public class DemoBanking {
    public static void main(String[] args) {
        // CheckingAccount c = new CheckingAccount(0.10);
        // System.out.println(c.getBalance());
        // c.applyInterest();
        // BankAccount b2 = new CheckingAccount(0.06);
        // System.out.println(b2.getBalance());

        // Object o = new CheckingAccount(0.06);
        // System.out.println(o.getBalance());
        // o.applyInterest();
       
    //    b.applyInterest();

    //     BankAccount Ba1 = new BankAccount(1000);
    //     System.out.println(Ba1);
    //     Ba1.deposit(100);
    //     System.out.println(Ba1);
    //     Ba1.withdraw(10000);
    //     System.out.println(Ba1);
     
    //    System.out.println();
    //    CheckingAccount Ca1 = new CheckingAccount(0.4);
    //    System.out.println(Ca1);
    //    Ca1.deposit(1000);
    //    System.out.println(Ca1);
    //    Ca1.withdraw(50);
    //    System.out.println(Ca1);
    //    System.out.println();
    //    System.out.println("Checking account 2");
    //    CheckingAccount Ca2 = new CheckingAccount(1000, 0.4);
    //    System.out.println(Ca2);
    //    System.out.println();
    //    System.out.println("Transaction Fee Checking account 2");

    //    TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount(0.3);
    //    System.out.println(TFCA);
    //    TFCA.chargeFee();
    //    System.out.println(TFCA);
    //    TFCA.deposit(1);
    //    System.out.println(TFCA);
    //    TFCA.withdraw(50);
    //    System.out.println(TFCA);
    //    TFCA.withdraw(2);
    //    System.out.println();
    //    System.out.println("Fee Account");
    //     FeeAccount FA1 = new FeeAccount(100);
    //     System.out.println(FA1);
    //     FA1.chargeFee();
    //     System.out.println(FA1);
    //     FA1.deposit(100);
    //     System.out.println(FA1);
    //     FA1.withdraw(20);
    //     System.out.println(FA1);

           BankAccount b = new FeeAccount( 9.00);
           System.out.println(b);
           b.getBalance();
           
        //   b.chargeFee();
           b.withdraw(5.0);
           System.out.println(b);


    }
}
