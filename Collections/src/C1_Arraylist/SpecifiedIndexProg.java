package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecifiedIndexProg {
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
        System.out.println("Now enter any ele at any specific indx value if exist.");
        System.out.print("new index : ");
        int idx_val = sc.nextInt();
        System.out.print("New index ele : ");
        int idx_ele = sc.nextInt();
//        if (idx_val>=0 && idx_val<=ListIndex.size()-1){
//            ListIndex.add(idx_val,idx_ele);
//        }else {
//            System.out.println("Error Msg");
//        }
        try {
            ListIndex.add(idx_val,idx_ele);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index value.");
        }
        System.out.println("Updated List : "+ListIndex);
    }
}
