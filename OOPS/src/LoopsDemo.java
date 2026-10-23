public class LoopsDemo {

    // instance varaible these can be used into the anywhere except the static method
    int age;
    String name;
    int price ;
    LoopsDemo(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("age----------"+age);
        System.out.println("name----------"+name);
    }
    public static void main(String[] args) {
        LoopsDemo info = new LoopsDemo("IKram", 28);
        System.out.println("__________________");
        LoopsDemo info1 = new LoopsDemo("Manish Kumar", 20);
        info.run(info1);



    }
    public void run( LoopsDemo object){
        System.out.println("Car is running at "+object.name);
        System.out.println("Car is running at "+object.age);
    }
}
