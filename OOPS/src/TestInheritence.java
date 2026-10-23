public class TestInheritence {
    public static void main(String[] args) {
        System.out.println("We are learning the inheritence..");
        // we are crating the object..
        System.out.println("...........................");
        Animals animal = new Animals();

        animal.sound();

        Animals ani = new Dog();
        ani.sound();
        ani.fly();

    }
}
