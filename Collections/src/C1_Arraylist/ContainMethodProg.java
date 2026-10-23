package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainMethodProg {
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
        System.out.println("Now check the specific ele if exist.");
        System.out.print("ele value : ");
        int ele_val = sc.nextInt();
        if(ListIndex.contains(ele_val)){
            System.out.println("Yes, element present in the list.");
        }else {
            System.out.println("No, such as element in the list.");
        }
        System.out.println("Updated List : "+ListIndex);
    }
}
