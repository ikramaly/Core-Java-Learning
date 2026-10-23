package CallByValue;

public class CallByValueDemo {
    public static void change(int x){
        x = 203;
    }

    public static void main(String[] args) {
        int a = 10;
        a = 23;
        change(a);
        System.out.println("Value of a : "+a);
    }
}
