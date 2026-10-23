package C5_SortingOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// mainPublicclass
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students(5,"CC",20));
        studentsList.add(new Students(2,"AA",24));
        studentsList.add(new Students(3,"BB",40));
        studentsList.add(new Students(1,"FF",50));
//        studentsList.add(new Students(0,"Chanchak",32));

        System.out.println("List : "+studentsList);
        System.out.println("------------------------------");



    }
};