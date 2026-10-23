class MethodJava 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
		MethodJava s= new MethodJava();
		s.display();
		s.display1("Ikram Ali","M2",234);
		//s.display1();
	}
	public void display()
	{
		System.out.println("Hello To All...");
		System.out.println("This is Simple method type no return no Argu..");
	}
	public void display1(String name, String method , int Age)
	{
		System.out.println("Hello I'm "+name+" I'm From "+method+" My age "+Age);
		System.out.println("Hello I'm "+name+" I'm From "+method+" My age "+Age);
		System.out.println("Hello I'm "+name+" I'm From "+method+" My age "+Age);
		System.out.println("Hello I'm "+name+" I'm From "+method+" My age "+Age);
	}
}
