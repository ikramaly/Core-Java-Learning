package C4_Set;

public class OOPsPractice {
    void start(){
        System.out.println("Vehical is parent.");
    }
    void run(){
        System.out.println("Parent is running");
    };
}
class Car extends OOPsPractice{
    @Override
    void start() {
        System.out.println("Car is child");
    }
}
class Output{
    public static void main(String[] args) {
        OOPsPractice o = new OOPsPractice();
        o.start();
        o.run();
        Car c = new Car();
        c.start();
        c.run();

    }
}