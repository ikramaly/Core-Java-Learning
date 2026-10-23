public class AllFactorsOfNumber {
    public static void main(String[] args) {
        int i=1;
        int n=99;
        int count = 0;
        int kth =5;
        while (i<=n){
            if(n%i==0){
//                System.out.println(i+" is factor of "+n);
                count +=1;
                if(count==kth){
                    System.out.println(i+" is the "+kth+"th factor of "+n);
                }
            }
            i+=1;
        }
        System.out.println("____________________________");
        System.out.println("total factor is : "+count);

        //kth factor program

    }
}
