package C1_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Ikram","Java");
        Student s2 = new Student(2,"Ikram","Java");
        Student s3 = new Student(3,"Ikram","Java");

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        System.out.println(studentsList);

    }
}
class Student {
    int id;
    String name;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
