import jdk.jfr.Enabled;
import org.w3c.dom.ls.LSOutput;

public class Encapsulation {
    // this is the instance variable
    private String AccountHolder;
    private int balance;

    // const
    Encapsulation(String name, int bal){
        this.AccountHolder = name;
        this.balance = bal;
        System.out.println("AccountHolder : "+name+" "+bal);
    }


    public static void main(String[] args) {
        System.out.println("We want to create example of encapsultion");
        // we want to create the object of the condt

    }
    void CheckBal(Encapsulation obj){
        System.out.println("AccountHolder : "+obj.AccountHolder);
        System.out.println("Balance : "+obj.balance);
    }

}
class ATM {
    public static void main(String[] args) {
        Encapsulation info = new Encapsulation("Ikram",393022);
        System.out.println("________________________");
        info.CheckBal(info);
//        info.balance = 34;
        info.CheckBal(info);



    }
}



