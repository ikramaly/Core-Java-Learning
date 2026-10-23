public class Animals{

    void sound(){
        System.out.println("Animal crying..");
    }

}

class Dog extends Animals{
    @Override
    void sound()
    {
        System.out.println("Dog Barking....");
    }
}
class Cat extends Animals{
    @Override
    void sound(){
        System.out.println("Cat Meuaoooooo...");
    }

}