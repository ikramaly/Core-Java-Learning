package Multithreading.FunctionalInterface;

@FunctionalInterface
interface Animal {
    public void sound();
    // this is the abstract method.

}
interface Add{
    public int Add( int a); // abstract method
}

interface  Name{
    void printName(String name);
}
public class Calsy{
    public static void main(String[] args) {
        Animal ani =()->{
            System.out.println("Dog is barking....");
        };
        Add obj  = (a)->{
            return a;//
        };
        Name userName = name1 -> {
            System.out.println("username : "+name1);
        };
//        userName.Name("Ikram");
        userName.printName("IkramALi");
        System.out.println(obj);
        ani.sound();
        System.out.println(obj.Add(12));
    }
}