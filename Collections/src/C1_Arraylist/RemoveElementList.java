package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElementList {
    public static void main(String[] args) {
        System.out.println("We will create the list 5 elements.");
        Scanner sc = new Scanner(System.in);
        List<Integer> ArryListDemo = new ArrayList<>();
//        System.out.print("Enter the ele :");
        for (int i =0; i<5; i++){
            System.out.print("idx "+i+" elemtnt : ");
            int num = sc.nextInt();
            ArryListDemo.add(num);
        }
        if (ArryListDemo.isEmpty()){
            System.out.println("Arraylist is Empty.");
        }else {
            System.out.println("Arraylist is not Empty");
        }
        System.out.println("ArrayListDemo : "+ArryListDemo);


        System.out.println("Now i will print the idx value ");
        System.out.print("Enter the inx value : ");
        int idx_val = sc.nextInt();
        try{
            System.out.println(idx_val+" element is : "+ArryListDemo.get(idx_val));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index value.");
        }
        System.out.println(ArryListDemo);
//        if (idx_val>=0 && idx_val<=ArryListDemo.size()-1){
//            System.out.println(idx_val+" element is : "+ArryListDemo.get(idx_val));
//        }else {
//            System.out.println("Invalid Value.");
//        }
    }
}
