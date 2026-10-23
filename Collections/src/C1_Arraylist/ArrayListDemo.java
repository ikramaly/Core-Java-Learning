package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(34);
        nums1.add(33);
        nums1.add(344);
        nums1.add(234);
        nums1.add(234);
        System.out.println(nums1);

        System.out.println(nums1.get(3));
        System.out.println(nums1.size());
        System.out.println(nums1.get(3));
        System.out.println(nums1.getFirst());

        if (nums1.isEmpty()){
            System.out.println("List Empty");
        }else {
            System.out.println("Not Empty");
        }
        nums1.add(3,90);
        System.out.println(nums1);
    }

}
