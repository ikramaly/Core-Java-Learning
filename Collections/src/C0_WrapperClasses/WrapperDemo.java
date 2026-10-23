package C0_WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
    }
}
class StaticDemo{
    public static void Add(){
        int a=10;
        int b=20;
        System.out.println("a + b = "+a+b);
    };
}
