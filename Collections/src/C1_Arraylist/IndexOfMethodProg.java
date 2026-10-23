package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfMethodProg {
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
            System.out.println("Now we will return the index value with the help of element.");
            System.out.print("check ele index of  : ");
            int ele_val = sc.nextInt();
            if(ListIndex.contains(ele_val)){
                System.out.println("index value of "+ele_val+" : "+ListIndex.indexOf(ele_val));
            }else {
                System.out.println("Invalid ele value.");
            }

        }
}
