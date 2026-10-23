import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // print the tirangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the col: ");
        int col = sc.nextInt();
        for(int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                if(i<=j){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}
