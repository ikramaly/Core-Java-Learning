package Questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hiiiiiii");
        try {
            m3("ikram.txt");
            m1();
        }catch (Exception e){
            System.out.println("filee noooottt founddd");
        }
    }
    public static void m1() throws FileNotFoundException{
        m3("ikram.txt");
        System.out.println("m1() is calling");
    }
    public static void m3(String file) throws FileNotFoundException{

       FileReader File = new FileReader(file);

    }
}
