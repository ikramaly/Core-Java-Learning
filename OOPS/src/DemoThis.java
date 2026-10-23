public class DemoThis {
    public static void main(String[] args) {
        ConstDemo s1 = new ConstDemo();
        System.out.println("___________-");
        ConstDemo s2 = new ConstDemo("Ikram", 20);
        System.out.println("________________");

        s1.Display(s1);
        s2.Display(s2);
    }


}

class ConstDemo{
    String name;
    int age;

    ConstDemo(){
        this("Unknown", 0);
        System.out.println("Defalut constructor.");
    }
    // parameterized constructor
    ConstDemo(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("This is parameter cont.");
        System.out.println(name + " "+age);
    }

    public void Display(ConstDemo obj){
        System.out.println("Object calling "+obj.name);
    }
}