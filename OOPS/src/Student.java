import java.sql.SQLOutput;

public class Student {
    String name;
    String college;
    int age ;
    String course ;

    // parameter constructor
    Student(String name, String college, int age, String course){
        System.out.println("Name : "+name);
        System.out.println("College : "+college);
        System.out.println("Age : "+age);
        System.out.println("Course : "+course);
        
        this.name = name;
        this.college = college;
        this.age = age;
        this.course = course;

    }
    //main method, without this main method we canm run the ant value this is very
// important to create the prestigeous code.
    public static void main(String[] args) {
        Student stu1  = new Student("Ikram ALi","SRGC",20,"JAVA");
        System.out.println("Object created successfully -------------------");

        Student stu2  = new Student("Manish Kumar","SRGC",20,"PYTHON");
        System.out.println("Object created successfully -------------------");
        System.out.println(stu1.name);
        System.out.println(stu2.name);
        System.out.println(stu1.age);
        System.out.println(stu2.age);
        //name() method
        System.out.println("Name method is called ");
        stu1.Info(stu1);
        stu2.Info(stu2);

    }
    // METHOD
    public void Info(Student obj){
        System.out.println("Course Name : "+obj.course);
    }
}
