package C3_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedListArray = new LinkedList<>();
        System.out.println("linkedListArray : "+linkedListArray);
        linkedListArray.add("Ikram");
        linkedListArray.add("Manish");
        linkedListArray.add("Ali");
        linkedListArray.add("Rahul");
        linkedListArray.add("Bobby");
        linkedListArray.add("Aashish Kumar");

        System.out.println("LinkedListArray : "+linkedListArray);
        System.out.println(linkedListArray.get(0));
        System.out.println(linkedListArray.get(1));
        System.out.println(linkedListArray.get(2));
        System.out.println("LinkedListArray : "+linkedListArray);

    }
}
