import java.util.Scanner;
class UserHW 
{
	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age In Alphabet : ");
		String age = sc.nextLine();
		System.out.println(age);
		*/
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Select AnyOne Your Fav Subject = ");
		String subjects = sc.nextLine();
		switch(subjects)
		{
			case "MATH" :
				System.out.println("My Fav Subject : MATH ");
			break;
			case "HINDI" :
				System.out.println("My Fav Subject : HINDI ");
			break;
			case "SCIENCE" :
				System.out.println("My Fav Subject : SCIENCE ");
			break;
			case "BIOLOGY" :
				System.out.println("My Fav Subject : BIOLOGY ");
			break;
			case "PHYSICS" :
				System.out.println("My Fav Subject : PHYSICS ");
			break;
			default :
				System.out.println("I Have Not Any Favriote Subjects. ");
			
			*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Digit UpTo 9 : ");
		int num = sc.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("ONE");
			break;
			case 2:
				System.out.println("TWO");
			break;
			case 3:
				System.out.println("THREE");
			break;
			case 4:
				System.out.println("FOUR");
			break;
			case 5:
				System.out.println("FIVE");
			break;
			case 6:
				System.out.println("SIX");
			break;
			case 7:
				System.out.println("SEVEN");
			break;
			case 8:
				System.out.println("EIGHT");
			break;
			case 9:
				System.out.println("NINE");
			break;
			default : 
				System.out.println("Please Enter Any Valid Number...");
		}
	
		}
		
		
	}

