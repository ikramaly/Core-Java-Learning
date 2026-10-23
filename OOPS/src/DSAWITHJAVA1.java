public class DSAWITHJAVA1 {
    public static void main(String[] args) {
//        int a=34;
//        int b=45;
//        if (a>b){
//            System.out.println("a is bigger than b");
//        } else if (a<b) {
//            System.out.println("a is less than b");
//        }else {
//            System.out.println("both are equals.");
//        }

        //neted else if
        int x=100;
        int y=20;
        int z=300;
        if(x>y){
            if(x>z){
                System.out.println("X (100) is greater than both (z (30) & y (20)");
            }else {
                System.out.println("X (100) is only greater tha y (20)");
            }
        }else {
            if (x<y){
                if(x<z){
                    System.out.println("X (100) is less than both y (20)  & z (30) ");
                }
            }
        }
    }

}
