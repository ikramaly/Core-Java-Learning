package Abstract_Class_Interfaces;

import java.util.Dictionary;

public class AbstractClassDemo {
    public static void main(String[] args) {


    }
}
abstract class Animal{
    String Animal;
    Animal(String name){
        this.Animal = name;
        System.out.println("Animal Name : "+name);
    }

    void eat(){
        System.out.println("Eating normal methods..");
    }
    abstract void sound();
}
class AnimalName extends Animal{

    AnimalName(String name){
        super(name);
    }
    @Override
    void sound() {
        System.out.println("Dog Barks.");
    }
//    @Override
//    void sound(){
//        System.out.println("Cat Meaooo,");
//    }

}