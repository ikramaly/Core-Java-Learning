import  java.util.*;
public class PracticeJava {
    public static void main(String[] args) {
        PracticeJava m1 = new PracticeJava();
        System.out.println(m1.DisplayInt());
        System.out.println(m1.DisplayString());
        System.out.println("_______________________________________________");
        m1.DisplayVoid();
        System.out.println("Sum() : ");
        System.out.println(m1.SUM(20,20));
        System.out.println("___________________________________________________");
        System.out.println("Area Of Triangle : "+m1.TriangleArea(5,10));
        System.out.println("____________________________________________________");
        System.out.println("Array () : ");
        m1.Array();

    }
    public static String DisplayString() {
        return "Ikram ALi";
    }
    public static int DisplayInt() {
        return 2025;
    }
    public static void DisplayVoid(){
        int age = 20;
        String name = "Ikram Ali";
        System.out.println("Age : "+age+" & "+"Name : "+name);
    }
    public static int SUM(int a , int b){
        return (a+b);
    }
    public int TriangleArea(int base, int height ){
        int Area = (base * height )/2;
        return Area;
    }
    public void Array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Array Value : ");
        int num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Enter the "+num+" value in the array[].");
        for (int i=0; i<num; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array Createad Successfully..");
        System.out.println("Now Array is printing .........");
        for (int i=0; i<num ;i++){
            System.out.println("array["+i+"]"+array[i]);
        }
        System.out.println("Array Finished...................");
    }

}
