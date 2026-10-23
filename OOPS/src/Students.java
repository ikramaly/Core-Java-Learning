public class Students {
    // instance variable
    String name;
    int age;
    int roll_no;
    String course;
    // constructor
    Students(String name, int age, int roll_no, String course){
        this.name = name;
        this.age = age ;
        this.roll_no = roll_no;
        this.course = course;
        System.out.println("Const is called before the object creation.");
        System.out.println(name+" "+ age+" " + roll_no +" "+ course);
    }
    // this is the main methods.....
    public static void main(String[] args) {
        Students info1 = new Students("Ikram",20,10058,"Btech CSE");
        System.out.println("___________________________");
        Students info2 = new Students("Ali",22,10056,"Btech CSE");
        System.out.println("________________________________-__-");
        Students info3 = new Students("Manish",23,10045,"Btech CSE");

        System.out.println("---------now we will call the object----");
        info1.student_info(info1);
        System.out.println("_______________");
        info2.student_info(info2);
        System.out.println("__________________");
        info3.student_info(info3);
        System.out.println("Yes i can do anything in my life....");
    }
    // local method.
    void student_info(Students obj){
        System.out.println("Caliing through "+obj+" "+obj.name);
        System.out.println("Caliing through "+obj+" "+obj.age);
        System.out.println("Caliing through "+obj+" "+obj.roll_no);
        System.out.println("Caliing through "+obj+" "+obj.course);

    }
}
