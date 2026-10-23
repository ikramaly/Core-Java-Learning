import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows = : ");
        int rows = sc.nextInt();
        System.out.print("Enter Columns = ");
        int cols = sc.nextInt();
        int [][] number = new int[rows][cols];
        System.out.println("Enter The Value [ "+rows+" ]"+" [ "+cols+" ]");
        for (int i=0 ; i<rows ; i++){
            for (int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();

            }
            //System.out.println();
        }
        System.out.println("Array Created Succssfully.");
        System.out.println("Now Array is printed..");
        for (int i=0 ; i<rows ; i++){
            for (int j=0; j<cols; j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("Array Printed Successfully..");
        System.out.print("I want to search : ");
        int search_num =  sc.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (search_num == number[i][j]){
                    System.out.println("Search_num loc = (" + i +", "+ j + ")");
                    //return;
                }


            }
        }


    }
}
