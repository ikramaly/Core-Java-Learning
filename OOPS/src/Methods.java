import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("We are calling printMyName for print above name");
        System.out.print("Enter the name : ");
        String namee = sc.next();
        printMyName(namee);
        System.out.println("________________________________");
        System.out.println("We are calling printSumOfTwoNum()");
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();
        int sum = printSumOfTwoNum(a,b);
        System.out.println("Sum = "+sum);
        System.out.println("_____________________________");
        System.out.println("Calling Multiply() ");
        System.out.print("a = ");
        int aa = sc.nextInt();
        System.out.print("b = ");
        int bb = sc.nextInt();
        System.out.println("multiplication = "+Multiply(aa,bb));


    }
    public static void printMyName(String Name){
        System.out.println(Name);
        return;
    }
    public static int printSumOfTwoNum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int Multiply(int a, int b){
        return a*b;*/
        System.out.print("Enter any num for factorial : ");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+" = "+Factorial(a));
    }
    public static int Factorial(int a ){
        if (a < 0 ){
            return 0;
        }
        int facto = 1;
        for (int i=a; i>=1; i--){
            facto *= i;
        }
        return facto;
    }
}
