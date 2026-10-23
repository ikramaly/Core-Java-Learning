public class AbstructClass {
    public static void main(String[] args) {
        // this is the abstruct class of the java
//       AnimalsClass1 a1 = new AnimalsClass1(); we cant create the abstruct class object
         Dogclass1 dog1 = new Dogclass1();
         dog1.sound();
         dog1.sleep();

    }
}
// normal class
abstract class AnimalsClass1{
    abstract void  sound();// this is the abstruct method of the java, in the parent class this method should me written
    void  sleep(){
        System.out.println("Animals also sleep....");// this is the normal method of the java
    }
}
// child class of the Animals class
class Dogclass1 extends AnimalsClass1{
    @Override
    void sound() {
        System.out.println("Dog is barking....");
    }
}
