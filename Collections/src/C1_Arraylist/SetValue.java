package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetValue {
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
        System.out.println("Now we will replace the old value with new value if old value exist.");
        System.out.print("new add ele val : ");
        int new_ele_value = sc.nextInt();
        System.out.print("old value we want to replace : ");
        int old_ele_val = sc.nextInt();
        if(ListIndex.contains(old_ele_val)){
            int indexVal = ListIndex.indexOf(old_ele_val);
            ListIndex.set(indexVal,new_ele_value);
            System.out.println("Yes, such as element exist in list.");
        }else {
            System.out.println("Error : Such as element not exist in list.");
        }

        System.out.println("Updated List : "+ListIndex);
        // from tommorow inshallah i will start from here.
    }
}
