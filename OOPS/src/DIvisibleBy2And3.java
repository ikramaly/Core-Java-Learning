public class DIvisibleBy2And3 {
    public static void main(String[] args) {
        int n=-21;
        if(n>0){
            System.out.println(n+" is positive number.");
            if(n%2==0){
                System.out.println(20+" is Divisible by 2");
            }else {
                System.out.println(n+" is not Divisible by 2");
            }
        }else{
            System.out.println(n+" number is negative.");
            n =-n;
            if(n%3==0){
                System.out.println(n+" is divisible by 3.");
            }else {
                System.out.println(n+" is not Divisible by 3.");
            }
        }
    }
}
