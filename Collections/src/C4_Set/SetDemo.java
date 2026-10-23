package C4_Set;

import java.util.*;

public class SetDemo implements Comparator<SetDemo>  {
    int age;
    String name ;


    @Override
    public int compare(SetDemo o1,SetDemo o2) {
        return o1.age-o2.age;
    }
//    @Override
//    public int compare(SetDemo o1, SetDemo o2) {
//        return o1.name.compareTo(o2.name);
//    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public SetDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        List<SetDemo> setDemos = new ArrayList<>();
        setDemos.add(new SetDemo(101,"Ikram"));
        setDemos.add(new SetDemo(100,"Neha"));
        setDemos.add(new SetDemo(90,"Priya"));
        setDemos.add(new SetDemo(89,"Khushi"));
        setDemos.add(new SetDemo(189,"baba"));
        setDemos.add(new SetDemo(83,"Aayushi"));
//        studentsData.put(200,"Ikram");
//        studentsData.put(100,"Manish");
//        studentsData.put(50,"Neha");
//        studentsData.put(80,"Kanishka");
//        studentsData.put(6,"HOD");
        System.out.println(setDemos);
//        Collections.sort(setDemos);
        System.out.println(setDemos);

    }
}
