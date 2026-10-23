package Questions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q2 {
    public static void main(String[] args){
        try {
            m1();
        }catch (Exception e){
            System.out.println("Humne exception pass kar di");
        }
//        m2("ikram.txt");
    }
    public static void m1() throws FileNotFoundException{
        m2();
        System.out.println("M1 called...");
    }
    public static void m2 () throws FileNotFoundException{
        FileReader fileReader = new FileReader("ikram.txt");
    }
}
