class Species{
    // constructor
    Species(){
//        System.out.println("This is Grand parent const.");
//        System.out.println("-----------");
    }
        void fly(){
            System.out.println("flying..........");
        }
}
public class Animals extends Species {
    public static void main(String[] args) {
        System.out.println("Species const call hoga...");
        Animals ani = new Animals();
    }

    @Override
    void fly() {
        System.out.println("Flying is not supported in animals.");
    }

    void Eat(){
        System.out.println("Animals is eating......");
    }
    void sound(){
        System.out.println("making sound trrrrr trrrrrrr");
    }
}
class  Dog extends Animals {
    Dog(){
//        super();
//        System.out.println("This is Dog const.");
    }
    @Override
    void sound() {
        System.out.println("Dog is barking....");
//        super.sound();
    }

    @Override
    void fly() {
        System.out.println("Some time dog is fly...");
    }
}