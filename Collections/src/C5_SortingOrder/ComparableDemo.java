package C5_SortingOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo implements Comparable<ComparableDemo> {
    int id;
    String name;
    int age;

    ComparableDemo(int id , String name,int age ) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(ComparableDemo o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<ComparableDemo> list = new ArrayList<>();
        System.out.println("list : "+list);
        ComparableDemo s1 = new ComparableDemo(11,"Raj",25);
        ComparableDemo s2 = new ComparableDemo(1,"Vinay",10);
        ComparableDemo s3 = new ComparableDemo(40,"Simran",40);
        ComparableDemo s4 = new ComparableDemo(5,"Eeham",30);
        ComparableDemo s5 = new ComparableDemo(8,"Patvad",9);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println("list : "+list);
        System.out.println("-------------------");
        Collections.sort(list);
        System.out.println("list sort by name : "+list);
    }

}
