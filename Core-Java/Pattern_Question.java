import java.util.*;
public class Pattern_Question {
    public  static void main (String[] args)
    {
        Pattern_Question m1 = new Pattern_Question();
        /* System.out.println("We are Calling pattern() : ");
        m1.Solid_Rectangle();
        */
        /*System.out.println("Hollow_Rectangle():");
        m1.Hollow_Rectangle();
*/
//        System.out.println(" Half_Pyramid() : ");
//        m1.Half_pyramid();
        /*System.out.println("We Are Calling Inverted_Half_Pyramid() : ");
        m1.Inverted_Half_Pyramid();*/
//        System.out.println(" we are calling Half_pyramid_with_numbers()");
//        m1.Half_pyramid_with_numbers();
//        System.out.println("We Are Calling Floyd_Triangle() :");
//        m1.Floyd_Triangle();
        System.out.println("Zero_One_Triangle()");
        m1.Zero_One_Triangle();

    }
    public void Solid_Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value Of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the Value Of column : ");
        int col = sc.nextInt();
        for (int i= 1; i<=row; i++)
        {
            for (int j=1; j<=col; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public void Hollow_Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row : ");
        int row = sc.nextInt();
        System.out.print("Enter The Col : ");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <=col ; j++) {
                if (i==1 || i==row || j==1 || j==col ){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public void Half_pyramid()
    {
        int row = 8 ;
        int col = 5;
        for (int i=row ; i>=1; i--)
        {
            for (int j=1 ; j<=col; j++)
            {
                if (i>=j)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public void Inverted_Half_Pyramid()
    {
        int row = 10;
        int col = 6;
        for (int i =1; i <=row; i++)
        {
            for (int j = col; j >= 1; j--) {
                if (i>=j){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

    }
    public void Half_pyramid_with_numbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows  : ");
        int row = sc.nextInt();
        System.out.print("Enter the Cols :");
        int col = sc.nextInt();
        for (int i=row; i>=1; i--)
        {
            for (int j=1; j<=col; j++)
            {
                if (i>=j)
                {
                    System.out.print(j+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public void Floyd_Triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row :");
        int row = sc.nextInt();
        //System.out.print("Enter The Col : ");
       //int col = sc.nextInt();
        int num = 1;
        for (int i= 1; i<=row; i++)
        {
            for ( int j=1; j<=i; j++)
            {
                System.out.print(num+"     ");
                num++;
            }
            System.out.println();
        }

    }
    public void Zero_One_Triangle()
    {
        int row = 5;
        int col = 5;
        for (int i=1 ; i<=row; i++)
        {
            for (int j=1 ; j<=i ; j++) {
               if ((i+j)%2==0)
               {
                   System.out.print(" 1 ");
               }
               else
               {
                   System.out.print(" 0 ");
               }

            }
            System.out.println();
        }
    }


}
