package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println("Create ArrayList with 5 elements 10, 20, 30, 40, 50 ");
        List<Integer> ListIndex = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.print("idx "+i+" element :");
            int ele_val = sc.nextInt();
            ListIndex.add(ele_val);
        }
        System.out.println(" ListIndex : "+ListIndex);
        System.out.println("Now Remove any ele at any specific indx value if exist.");
        System.out.print("Remove index element: ");
        int idx_val = sc.nextInt();
        try {
            ListIndex.remove(idx_val);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index value.");
        }
        System.out.println("Updated List : "+ListIndex);
    }
}
