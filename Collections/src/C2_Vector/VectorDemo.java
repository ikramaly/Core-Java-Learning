package C2_Vector;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>();
        num.add("Python");
        num.add("React");
        num.add("Devops");
        num.add("Javascript");
        num.add("DSA");
        ListIterator<String> lit = num.listIterator();
        System.out.println(num);
        lit.add("Rana");
        System.out.println(num);
//        Main1();
    }
    public void Main1(){
        System.out.println("Hii");
    }

}

