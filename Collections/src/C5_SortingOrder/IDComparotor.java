package C5_SortingOrder;

import java.util.Comparator;

public class IDComparotor implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.id- o2.id;
    }
    IDComparotor(){};
}
class SortByName implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.name.compareTo(o2.name);
    }
//    SortByName(){
//        System.out.println("Sort By Name Constructor.");
//    }
//
}
