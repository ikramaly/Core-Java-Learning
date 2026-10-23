public class Test_inheritence {
    public static void main(String[] args) {
        System.out.println("Animals class obj.");
        Animals a1 = new Animals();
        a1.sound();
        System.out.println("Dog Class Obj.");
        Animals a2 = new Dog();
        a2.sound();
        System.out.println("Cat Class Obj.");
        Animals a3 = new Cat();
        a3.sound();
        System.out.println("___________");
    }
}
