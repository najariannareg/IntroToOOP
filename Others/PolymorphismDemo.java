public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
		a.printInfo();
		b.printInfo();
		c.printInfo();
		System.out.println();
		a.printAbout();
		b.printAbout();
		c.printAbout();
		a = b;
		a.printInfo();
		a.generateInfo();
		a.printAbout();
	}
}
