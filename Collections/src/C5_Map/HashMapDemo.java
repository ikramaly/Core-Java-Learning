package C5_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Students nam1 = new Students();
        System.out.println(Students.name);
        System.out.println("---------------");
        // obje created successfully.
        System.out.println(nam1.name);
        nam1.name = "Payal";
        System.out.println(nam1.name);
        System.out.println(Students.name);
    }
}
class Students{
    static String name = "Ikram";
}
