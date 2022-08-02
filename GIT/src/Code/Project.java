package Code;

public class Project 
{
	public void method1()
	{
		System.out.println("m1");
	}
	public void method2()
	{
		System.out.println("m2");
		System.out.println("Dipeeka");
	}
	public void method3()
	{
		System.out.println("m3");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}	
	public static void main(String[] args) 
	{
		System.out.println("this is new Git project");
	
		Project p=new Project();
		p.method3();
		p.method2();
		System.out.println("Done");
	}

}
