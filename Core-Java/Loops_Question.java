import java.util.Scanner;
public class Loops_Question {
    public static void main (String[] args )
    {
        Loops_Question m1= new Loops_Question();
        System.out.println("We Are Calling Table() :");
        m1.Table();
        System.out.println("We Are Calling Sum() :");
        m1.Sum();
    }
    public void Table()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Any Table Of the Number :");
        int num= sc.nextInt();
        for (int i=1 ; i<=10; i++)
        {
            int multiply = num*i ;
            System.out.println(num+" * "+i +" = "+multiply );
        }
    }
    public void Sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Natural Number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++)
        {
            sum = sum + i;
        }
        System.out.println("Total sum of "+num+" = "+sum);
    }
}
