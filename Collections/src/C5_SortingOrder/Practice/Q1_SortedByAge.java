package C5_SortingOrder.Practice;

import javax.swing.text.html.parser.TagElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Compare Student objects based on Age:

public class Q1_SortedByAge {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(1,"Ikram",20));
        list.add(new Students(3,"Ali",10));
        list.add(new Students(1,"Manish",9));

        System.out.println("Natural sorting : ");
        System.out.println("list : "+list);
        System.out.println("-----------------------------");
        Collections.sort(list,new SortByAge());
        System.out.println("SorteByAge : ");
        for (Students st : list){
            System.out.println("{ id = "+st.id+" ,"+" name = "+st.name+" ,"+" age = "+ st.age+" }");
        }
        System.out.println("-----------------------------");
        Collections.sort(list,new SortByName());
        System.out.println("Sorted By Name : "+list);
        for (Students st : list){
            System.out.println("{ id = "+st.id+" ,"+" name = "+st.name+" ,"+" age = "+ st.age+" }");
        }
    }

}
// inside this class , students obj info saved, it means
//which type of value we want to store in the list .
class Students{
    int id;
    String name;
    int age;
    Students(int id, String name, int age){
        this.id = id;
        this.age=age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{"+" id= "+id+", "+"name= "+name+", "+"age= "+age+"}";

    }
}
// For custom sorting
class SortByAge implements Comparator<Students>{// it means we want to compare of the students class type obj.
    @Override
    public int compare(Students obj1, Students obj2){
        return obj1.age-obj2.age;
    };
}
class SortByName implements Comparator<Students> {// it means we want to compare of the students class type obj.

    @Override
    public int compare(Students obj1, Students obj2) {
        return obj1.name.compareTo(obj2.name);
    };
};
