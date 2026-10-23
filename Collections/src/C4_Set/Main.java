package C4_Set;

import java.util.*;

class Student {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Rahul", 22));
        students.add(new Student(1, "Zaid", 20));
        students.add(new Student(4, "Aman", 25));
        students.add(new Student(2, "Ikram", 21));


        // 1. Sort by ID
        Comparator<Student> byId = (s1, s2) ->
                Integer.compare(s1.id, s2.id);

        students.sort(byId);

        System.out.println("Sorted by ID:");
        System.out.println(students);


        // 2. Sort by NAME
        Comparator<Student> byName = (s1, s2) ->
                s1.name.compareTo(s2.name);

        students.sort(byName);

        System.out.println("\nSorted by Name:");
        System.out.println(students);


        // 3. Sort by AGE
        Comparator<Student> byAge = (s1, s2) ->
                Integer.compare(s1.age, s2.age);

        students.sort(byAge);

        System.out.println("\nSorted by Age:");
        System.out.println(students);
    }
}