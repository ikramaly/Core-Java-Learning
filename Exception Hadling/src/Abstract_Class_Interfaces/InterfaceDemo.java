package Abstract_Class_Interfaces;

import javax.xml.stream.events.Comment;

public class InterfaceDemo {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.name();
        a.color();
        a.sweetNess();
        Fruits.Shape();

    }
}
interface Fruits{
    void color();
    void name();

    default void sweetNess(){
        System.out.println("Fruit is sweet.");
        Common();
    };
    public static void Shape(){
        System.out.println("Fruits shape can be different.");
    }
    private void Common(){
        System.out.println("Its interface internally method.");
    }

}
class Apple implements Fruits{
    @Override
    public void color() {
        System.out.println("Apple color : Red");
    }

    @Override
    public void name() {
        System.out.println("Fruit name : Apple");
    }

}