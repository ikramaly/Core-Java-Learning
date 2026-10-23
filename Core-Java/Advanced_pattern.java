import java.util.*;
public class Advanced_pattern {
    public static void main(String[] args) {
        Advanced_pattern m1 = new Advanced_pattern();
        System.out.println("Butterfly_pattern()");
        m1.Butterfly_pattern();

    }
    public void Butterfly_pattern(){
        int row= 4;
        //Upper Loop.........
        //left side
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            //Space.....................
            int space = 2*(row-i);
            for (int j=1; j<=space; j++){
                System.out.print("  ");
            }
            //Right Side........
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();

        }
        //Lower Part...........
        for (int i=row; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            //Space.....................
            int space = 2*(row-i);
            for (int j=1; j<=space; j++){
                System.out.print("   ");
            }
            //Right Side........
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();

        }

    }
}
