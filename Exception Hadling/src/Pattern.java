import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Plus Pattern : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Col : ");
        int col = sc.nextInt();

//        System.out.println(col/2);
        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                if(i==0||j==col-1||i==rows-1||j==0){
                    System.out.print(" * ");
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
