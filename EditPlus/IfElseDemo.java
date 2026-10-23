class IfElseDemo 
{
	public static void main(String[] args) 
	{
		int i=11;
		if (i>10)
		{
			System.out.println("Take it 10 rupees...");
			i=i-10;
			//parvez -- bhai 5 rupees aur chaiye.
			if (i>4)
			{
				System.out.println("take it 5 rupees..");
				//Parvez-- bhai mujhe 5 rupees aur chahiye.
				i=i-5;
				if (i>5)
				{
					System.out.println("Take it 5 rupees more..");
				}
				else
				{
					System.out.println("Now, I have no money");
				}
					
				
			}
			else
			{
				System.out.println("Brother, i have not more than 4 rupees");
			}
		}
		else
		{
			System.out.println("Sorry Brother, I have no money"); 
		}
		
	}
}
