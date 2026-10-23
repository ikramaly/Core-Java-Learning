class ATM{
    private String accountHolderName;
    private double  balance;

    // Constructor...
    ATM(String accountHolderName, double balance){
      this.accountHolderName = accountHolderName;
      this.balance = balance;

    }
    void showBal(){
        System.out.println("Balance : "+balance);
    }
}

public class OOPS {
    public static void main(String[] args) {
        System.out.println("____");
        ATM s1 = new ATM("IKRAM ALI", 3034696);
        s1.showBal();
        s1.showBal();
    }
}
