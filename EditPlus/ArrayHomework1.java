import java.util.Scanner;
class ArrayHomework1 
{
	public static void main(String[] args) 
	{
		ArrayHomework1 M1 = new ArrayHomework1();
		/*System.out.println("We are calling M1.Sum();");
		System.out.println("Enter The Array Size : ");
		M1.Sum();
		System.out.println("We are calling 	M1.Max();");
		System.out.println("Enter The Array Size : ");
		M1.Max();
		System.out.println("We Are Calling EvenOdd()");
		System.out.println("Enter The Size Of The Array...");
		M1.EvenOdd();
		*/
		//System.out.println("We Are Calling Reverse()");
		//M1.Reverse();
		/*System.out.println("We Are Calling Pair()");
		M1.Pair();
		*/
		

		
	}
	public void Sum()
		{
		
			int arr[] = new int[5];
			arr[0] = 12;
			arr[1] = 13;
			arr[2] = 14;
			arr[3] = 15;
			arr[4] = 16;
			int sum = 0;
		
			for (int i=0; i<5 ; i++ )
			{
				sum = sum + arr[i];
			}
			System.out.println("Total Sum Of The Array : "+(sum) );
		}
	public void Max()
		{		
			Scanner sc= new Scanner(System.in);
			int size = sc.nextInt();
			int number[] = new int[size];
			System.out.println("Array Created...");	
			System.out.println("Enter Value For Array.....");
			
			for (int i=0; i<size ; i++)
			{
				number[i] = sc.nextInt();
			}
			
			int max = number[0];
			for (int i=1;i<size ;i++ )
			{
				if (number[i] > max)
				{
					max = number[i];
				}
			}
			System.out.println("Largest Number Of The Array Element "+max);
		}
	public void EvenOdd()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Size Of Array...");
			int size = sc.nextInt();
			System.out.println("Array Created Successfully...");
			System.out.println("Enter Value For Array.....");	
			int number[] = new int[size];
			for (int i=0 ; i<size ; i++ )
			{
				number[i] = sc.nextInt();
			}	
			System.out.println("Value Putted Successfully....");
			int Even = 0;
			int Odd = 0;
			for (int i= 0; i<size ; i++ )
			{
				if(number[i]%2 == 0)
				{
					Even  +=1;
				}
				else
				{
					Odd +=1;
				}
			}
			System.out.println("Total Even Numbers In Array : "+Even);
			System.out.println("Total Even Numbers In Array : "+Odd);
			System.out.println("Don't Worry, Belive Yourself Inshallah You Can Do It");
			System.out.println("Bcz Everyone Start From Zero,  ");
		}
	public void Reverse()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Size Array...");
			int size = sc.nextInt();
			System.out.println("Array Created Successfully.");
			int numbers[] = new int[size];
			System.out.println("Enter Value For Array.");
			for (int i=0; i<size ; i++ )
			{
				numbers[i] = sc.nextInt();
			}
			System.out.println("Value Putted SuccessFully.");
			System.out.println("Value Printed In Reverse Order.");
			for ( int i=size-1; i>=0 ; i-- )
			{
				System.out.println("Reveseing : "+numbers[i]);
			}
			System.out.println("Value Printed Successfully....");
			
		}
	
	/*5. Print All Pairs
	Print all possible pairs from an array using nested loops.
	Example: arr = [1, 2, 3] → (1,2), (1,3), (2,3)*/
	public void Pair()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The size Of the Array..");
		int size = sc.nextInt();
		int num[] = new int[size]; 
		System.out.println("Enter Value Of the Array..");
		for (int i=0; i<size ;i++ )
		{
			num[i] = sc.nextInt();
		}
		System.out.println("Array Value Putted SuccessFully.");
		for (int i=0; i<size ;i++ )
		{
			for (int k=i+1; k<size ;k++ )
			{
				System.out.println("Pair Of Every Possible Num :("+num[i] +"," +num[k]+")");
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Enter The size Of the Array..");
		System.out.println("I Can Do It ... Bcz I Manifest Myself Everyday,");
		System.out.println("I have Ambition and EveryDay I Envision MySelf To Working In A Big Company..");
	}
	/*
	6. Second Largest Element
	Find the second largest number in an array without sorting it.
	Example: arr = [5, 3, 8, 6] → Second Largest = 6
	*/
	public void Largest_Element()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array.");
		int size = sc.nextInt();
		int number[] = new int[size];
		System.out.println("Enter The Value For Array...");
		for (int i=0; i<size  ; i++ )
		{
			number[i] = sc.nextInt();
		}
		System.out.println("Value Putted Successfully....");
		for (int i=0; i<size ;i++ )
		{
			if (number[i] > number[i+1])
			{
			}
			
		}
	}
	
}
