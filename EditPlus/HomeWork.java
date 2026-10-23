import java.util.Scanner;
class HomeWork 
{
	public static void main(String[] args) 
	{
		HomeWork M1 = new HomeWork();
		M1.Loop();
		System.out.println("----------------------------------------");
		int area = M1.Triangle_Area(2,4);
		System.out.println("The Area Of Triangle = "+area);
		System.out.println("----------------------------------------");
		System.out.println("The Area Of Triangle = "+ M1.Triangle_Area(2,4));
		System.out.println("----------------------------------------");
		M1.Capital();
	}
	// Counting 1 to 10 method .............................
	
	public void Loop()
	{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println("The Value Of i in Ascending Order :"+i);
		}
	}
	
	
	// Triangle area count method .......
	
	public int Triangle_Area(int b, int h)
	{
		return  (b*h)/2;
	}
	
	//This Method Will be return the Captial Name of the Country Acc. to me 
	
	public void Capital()
 	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Country Name : ");
		String country = sc.nextLine();
		switch (country)
		{
		case "India":
			System.out.println("Capital of India --  New Delhi");
		break;
		case "Pakistan":
			System.out.println("Islamabad");
		break;
		case "China":
			System.out.println("Bijing");
		break;
		case "Russia":
			System.out.println("Moscow");
		break;
		case "Bangladesh":
			System.out.println("Dhaka");
		break;
		case "USA":
			System.out.println("Washingaton");
		break;
		case "Saudi Arabia":
			System.out.println("Riyadh");
		break;
		case "Ukraine":
			System.out.println("Kiev");
		break;
		case "Oman":
			System.out.println("Muscut");
		break;
		case "Iran":
			System.out.println("Teharn");
		break;
		case "Palastine":
			System.out.println("Yerushalam");
		break;
		default :
			System.out.println("Please Enter Valid Country Name.");
		
		
		
		}
	}
	
	
	
	
		
		
}
