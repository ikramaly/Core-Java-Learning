import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class TestException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name :");
        String name = null;
        try {
            int length = name.length();
            System.out.println("Length of your name : "+length);
        } catch (ArithmeticException e){
            System.out.println("Airthmetic Exception");
        }catch (ClassCastException e){
            System.out.println("ClassCastException");
        }
        catch (NullPointerException e){
        System.out.println("NullPointerException");
         }
        finally {
            System.out.println("Your are really amazing person.");
        }

    }

}