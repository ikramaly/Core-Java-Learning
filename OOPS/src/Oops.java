import org.w3c.dom.ls.LSOutput;

public class Oops {

    String name;
    String type;
    int duration;

//    Oops(){
//        System.out.println(" defalut constructorr called");
//    }
//    this is para constructor ;
    Oops(String name, String type, int duration){
        System.out.println("This is para constructor.");
        System.out.println(name);
        System.out.println(type);
        System.out.println(duration);
        this.name = name;
        this.duration = duration;
    }


    public static void main(String[] args) {
        Oops ob1 = new Oops("object 1","Java 1",5);
        System.out.println("_________________________________________");
        System.out.println(ob1.name);
        System.out.println(ob1.duration);

        Oops obj2 = new Oops("object 2","Java 2",55);
        System.out.println("__________________________________________");
        System.out.println(obj2.name);
        System.out.println(obj2.duration);
    }
    void run(Oops b)
    {
        System.out.println("We are learning the "+b.name);
    }
}
